//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.06.27 at 07:32:12 PM CEST 
//


package dualstrike.configuration.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dualstrike.configuration.model package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dualstrike.configuration.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Info }
     * 
     */
    public Info createInfo() {
        return new Info();
    }

    /**
     * Create an instance of {@link ChoiceSetting }
     * 
     */
    public ChoiceSetting createChoiceSetting() {
        return new ChoiceSetting();
    }

    /**
     * Create an instance of {@link BooleanSetting }
     * 
     */
    public BooleanSetting createBooleanSetting() {
        return new BooleanSetting();
    }

    /**
     * Create an instance of {@link Configuration }
     * 
     */
    public Configuration createConfiguration() {
        return new Configuration();
    }

    /**
     * Create an instance of {@link Setting }
     * 
     */
    public Setting createSetting() {
        return new Setting();
    }

    /**
     * Create an instance of {@link Page }
     * 
     */
    public Page createPage() {
        return new Page();
    }

}
