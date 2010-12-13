//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.13 at 04:29:08 PM CET 
//


package mccf.definition;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Configuration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Configuration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="device" type="{urn:strike-devices:configuration}Field"/>
 *         &lt;element name="version" type="{urn:strike-devices:configuration}Field"/>
 *         &lt;group ref="{urn:strike-devices:configuration}Infos"/>
 *         &lt;element name="connectionHelp" type="{urn:strike-devices:configuration}Info" maxOccurs="unbounded"/>
 *         &lt;element name="page" type="{urn:strike-devices:configuration}Page" maxOccurs="unbounded"/>
 *         &lt;element name="valueDomain" type="{urn:strike-devices:configuration}ValueDomain" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="def-lang-version" use="required" type="{http://www.w3.org/2001/XMLSchema}int" fixed="2" />
 *       &lt;attribute name="lang" use="required" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="prefix" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="icon-path" type="{urn:strike-devices:configuration}RelativePath" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "device",
    "version",
    "title",
    "help",
    "connectionHelp",
    "page",
    "valueDomain"
})
@XmlSeeAlso({
    Configuration.class
})
public class OriginalConfiguration {

    protected byte device;
    protected byte version;
    @XmlElement(required = true)
    protected List<Info> title;
    protected List<PathInfo> help;
    @XmlElement(required = true)
    protected List<Info> connectionHelp;
    @XmlElement(required = true)
    protected List<Page> page;
    @XmlElement(required = true)
    protected List<ValueDomain> valueDomain;
    @XmlAttribute(name = "def-lang-version", required = true)
    protected int defLangVersion;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String prefix;
    @XmlAttribute(name = "icon-path")
    protected String iconPath;

    /**
     * Gets the value of the device property.
     * 
     */
    public byte getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     */
    public void setDevice(byte value) {
        this.device = value;
    }

    /**
     * Gets the value of the version property.
     * 
     */
    public byte getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(byte value) {
        this.version = value;
    }

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
     * {@link PathInfo }
     * 
     * 
     */
    public List<PathInfo> getHelp() {
        if (help == null) {
            help = new ArrayList<PathInfo>();
        }
        return this.help;
    }

    /**
     * Gets the value of the connectionHelp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionHelp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionHelp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Info }
     * 
     * 
     */
    public List<Info> getConnectionHelp() {
        if (connectionHelp == null) {
            connectionHelp = new ArrayList<Info>();
        }
        return this.connectionHelp;
    }

    /**
     * Gets the value of the page property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the page property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Page }
     * 
     * 
     */
    public List<Page> getPage() {
        if (page == null) {
            page = new ArrayList<Page>();
        }
        return this.page;
    }

    /**
     * Gets the value of the valueDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueDomain }
     * 
     * 
     */
    public List<ValueDomain> getValueDomain() {
        if (valueDomain == null) {
            valueDomain = new ArrayList<ValueDomain>();
        }
        return this.valueDomain;
    }

    /**
     * Gets the value of the defLangVersion property.
     * 
     */
    public int getDefLangVersion() {
        return defLangVersion;
    }

    /**
     * Sets the value of the defLangVersion property.
     * 
     */
    public void setDefLangVersion(int value) {
        this.defLangVersion = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the iconPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconPath() {
        return iconPath;
    }

    /**
     * Sets the value of the iconPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconPath(String value) {
        this.iconPath = value;
    }

}
