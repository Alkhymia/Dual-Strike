package mccf.model;

import java.util.List;
import java.util.Vector;

import mccf.definition.BooleanSetting;
import mccf.definition.ChoiceSetting;
import mccf.definition.IntegerSetting;

public class PageModel  {
	private final ConfigurationModel configuration;
	private final List<SettingModel> settings = new Vector<SettingModel>();
	
	PageModel(final ConfigurationModel configuration) {
		this.configuration = configuration;
	}
	
	public List<SettingModel> getSettings() {
		return settings;
	}

	public synchronized ChoiceModel createChoice(final ChoiceSetting choiceSetting) {
		ChoiceModel choiceModel;
		
		choiceModel = new ChoiceModel(configuration, choiceSetting);
		settings.add(choiceModel);
		
		return choiceModel;
	}

	public synchronized BooleanModel createBoolean(final BooleanSetting booleanSetting) {
		BooleanModel booleanModel;
		
		booleanModel = new BooleanModel(configuration, booleanSetting);
		settings.add(booleanModel);
		
		return booleanModel;
	}
	
	public synchronized IntegerModel createValue(final IntegerSetting integerSetting) {
		IntegerModel valueModel;
		
		valueModel = new IntegerModel(configuration, integerSetting);
		settings.add(valueModel);
		
		return valueModel;
	}
	
	public synchronized void loadDefaults() {
		for(SettingModel setting: settings)
			setting.loadDefaults();
	}
}
