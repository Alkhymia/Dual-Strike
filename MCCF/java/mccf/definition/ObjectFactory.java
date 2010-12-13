//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.13 at 04:29:08 PM CET 
//


package mccf.definition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mccf.definition package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Configuration_QNAME = new QName("urn:strike-devices:configuration", "configuration");
    private final static QName _OriginalOptionRequires_QNAME = new QName("urn:strike-devices:configuration", "requires");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mccf.definition
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChoiceSetting }
     * 
     */
    public ChoiceSetting createChoiceSetting() {
        return new ChoiceSetting();
    }

    /**
     * Create an instance of {@link OriginalOption }
     * 
     */
    public OriginalOption createOriginalOption() {
        return new OriginalOption();
    }

    /**
     * Create an instance of {@link PathInfo }
     * 
     */
    public PathInfo createPathInfo() {
        return new PathInfo();
    }

    /**
     * Create an instance of {@link Requires }
     * 
     */
    public Requires createRequires() {
        return new Requires();
    }

    /**
     * Create an instance of {@link OriginalBooleanSetting }
     * 
     */
    public OriginalBooleanSetting createOriginalBooleanSetting() {
        return new OriginalBooleanSetting();
    }

    /**
     * Create an instance of {@link ValueDomainEntry }
     * 
     */
    public ValueDomainEntry createValueDomainEntry() {
        return new ValueDomainEntry();
    }

    /**
     * Create an instance of {@link ValueDomain }
     * 
     */
    public ValueDomain createValueDomain() {
        return new ValueDomain();
    }

    /**
     * Create an instance of {@link Info }
     * 
     */
    public Info createInfo() {
        return new Info();
    }

    /**
     * Create an instance of {@link ValueSetting }
     * 
     */
    public ValueSetting createValueSetting() {
        return new ValueSetting();
    }

    /**
     * Create an instance of {@link OriginalChoiceSetting }
     * 
     */
    public OriginalChoiceSetting createOriginalChoiceSetting() {
        return new OriginalChoiceSetting();
    }

    /**
     * Create an instance of {@link OriginalConfiguration }
     * 
     */
    public OriginalConfiguration createOriginalConfiguration() {
        return new OriginalConfiguration();
    }

    /**
     * Create an instance of {@link Setting }
     * 
     */
    public Setting createSetting() {
        return new Setting();
    }

    /**
     * Create an instance of {@link BooleanSetting }
     * 
     */
    public BooleanSetting createBooleanSetting() {
        return new BooleanSetting();
    }

    /**
     * Create an instance of {@link OriginalValueSetting }
     * 
     */
    public OriginalValueSetting createOriginalValueSetting() {
        return new OriginalValueSetting();
    }

    /**
     * Create an instance of {@link DescriptionImage }
     * 
     */
    public DescriptionImage createDescriptionImage() {
        return new DescriptionImage();
    }

    /**
     * Create an instance of {@link Page }
     * 
     */
    public Page createPage() {
        return new Page();
    }

    /**
     * Create an instance of {@link Option }
     * 
     */
    public Option createOption() {
        return new Option();
    }

    /**
     * Create an instance of {@link Configuration }
     * 
     */
    public Configuration createConfiguration() {
        return new Configuration();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Configuration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:strike-devices:configuration", name = "configuration")
    public JAXBElement<Configuration> createConfiguration(Configuration value) {
        return new JAXBElement<Configuration>(_Configuration_QNAME, Configuration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:strike-devices:configuration", name = "requires", scope = OriginalOption.class)
    @XmlIDREF
    public JAXBElement<Object> createOriginalOptionRequires(Object value) {
        return new JAXBElement<Object>(_OriginalOptionRequires_QNAME, Object.class, OriginalOption.class, value);
    }

}
