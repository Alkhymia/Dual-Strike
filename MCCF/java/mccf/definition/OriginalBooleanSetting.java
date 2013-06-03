//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.19 at 11:06:42 AM CET 
//


package mccf.definition;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BooleanSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BooleanSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:strike-devices:configuration}Setting">
 *       &lt;sequence>
 *         &lt;element name="image" type="{urn:strike-devices:configuration}DescriptionImage" minOccurs="0"/>
 *         &lt;element name="requires" type="{urn:strike-devices:configuration}BooleanRequires" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "image",
    "requires"
})
@XmlSeeAlso({
    BooleanSetting.class
})
public class OriginalBooleanSetting
    extends Setting
{

    protected DescriptionImage image;
    protected List<BooleanRequires> requires;
    @XmlAttribute(name = "default")
    protected Boolean _default;

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionImage }
     *     
     */
    public DescriptionImage getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionImage }
     *     
     */
    public void setImage(DescriptionImage value) {
        this.image = value;
    }

    /**
     * Gets the value of the requires property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requires property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequires().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BooleanRequires }
     * 
     * 
     */
    public List<BooleanRequires> getRequires() {
        if (requires == null) {
            requires = new ArrayList<BooleanRequires>();
        }
        return this.requires;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefault(Boolean value) {
        this._default = value;
    }

}