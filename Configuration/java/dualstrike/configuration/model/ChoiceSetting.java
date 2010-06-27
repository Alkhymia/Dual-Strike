//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.06.27 at 07:32:12 PM CEST 
//


package dualstrike.configuration.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ChoiceSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChoiceSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:strike-devices:configuration}Infos"/>
 *         &lt;element name="option" type="{urn:strike-devices:configuration}Setting" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="prefix" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChoiceSetting", propOrder = {
    "title",
    "help",
    "option"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2010-06-27T07:32:12+02:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
public class ChoiceSetting {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2010-06-27T07:32:12+02:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected List<Info> title;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2010-06-27T07:32:12+02:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected List<Info> help;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2010-06-27T07:32:12+02:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected List<Setting> option;
    @XmlAttribute(name = "default")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2010-06-27T07:32:12+02:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected Object _default;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2010-06-27T07:32:12+02:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected String prefix;

    /**
     * Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Info }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2010-06-27T07:32:12+02:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public List<Info> getTitle() {
        if (title == null) {
            title = new ArrayList<Info>();
        }
        return this.title;
    }

    /**
     * Gets the value of the help property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the help property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHelp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Info }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2010-06-27T07:32:12+02:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public List<Info> getHelp() {
        if (help == null) {
            help = new ArrayList<Info>();
        }
        return this.help;
    }

    /**
     * Gets the value of the option property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the option property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Setting }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2010-06-27T07:32:12+02:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public List<Setting> getOption() {
        if (option == null) {
            option = new ArrayList<Setting>();
        }
        return this.option;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2010-06-27T07:32:12+02:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public Object getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2010-06-27T07:32:12+02:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setDefault(Object value) {
        this._default = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2010-06-27T07:32:12+02:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2010-06-27T07:32:12+02:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setPrefix(String value) {
        this.prefix = value;
    }

}
