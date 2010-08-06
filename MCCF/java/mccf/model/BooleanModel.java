package mccf.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;

import mccf.definition.BooleanSetting;


public class BooleanModel extends SettingModel implements ActionListener {
	private final boolean defaultValue;
	private final JRadioButton enableButton;
	private final JRadioButton disableButton;
	private boolean value;
	private final String id;
	
	BooleanModel(final ConfigurationModel configuration, final BooleanSetting booleanSetting, final JRadioButton enableButton, final JRadioButton disableButton) {
		super(configuration, (int)booleanSetting.getByteNo(), (int)booleanSetting.getBitNo());
		defaultValue = booleanSetting.isDefault();
		value = defaultValue;
		this.enableButton = enableButton;
		this.disableButton = disableButton;
		this.id = booleanSetting.getId();
		configuration.setSetting(id, value);
		enableButton.addActionListener(this);
		disableButton.addActionListener(this);
	}

	@Override
	public synchronized void actionPerformed(final ActionEvent event) {
		if(enableButton.isSelected() != value) {
			value = enableButton.isSelected();
			getConfiguration().setSetting(id, value);
			getConfiguration().getFileHandler().setModelChanged();
		}
	}

	public synchronized boolean isValue() {
		return value;
	}

	public synchronized void setValue(final boolean value) {
		if(this.value != value) {
			this.value = value;
			enableButton.setSelected(value);
			disableButton.setSelected(!value);
			getConfiguration().setSetting(id, value);
			getConfiguration().getFileHandler().setModelChanged();
		}
	}

	public boolean isDefaultValue() {
		return defaultValue;
	}

	@Override
	synchronized void loadDefaults() {
		setValue(defaultValue);
	}

	@Override
	synchronized void loadBytes(final byte[] bytes) {
		setValue(ConfigurationModel.getBit(bytes, getByteNo(), getBitNo()));
	}

	@Override
	synchronized void saveBytes(byte[] bytes) {
		if(value)
			bytes[getByteNo()] |= (1 << getBitNo());
	}
}
