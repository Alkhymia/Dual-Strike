//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.13 at 04:29:08 PM CET 
//


package mccf.definition;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *       An element of this kind imposes two constraints on the configuration:
 *         -The containing option can only be activated if the referred
 *          setting is set, i.e. in case of a boolean it is enabled and
 *          in case of an option it is the current selection of its
 *          containing choice.
 *         -If the containing option is the current selection of its
 *          containing choice, the referred setting is set fix, i.e.
 *          in case of a boolean it is not disengageable and in case of an
 *          option the other options of its containing choice are not
 *          selectable.
 *          
 *       To prevent cascading changes and clashing requirements, the
 *       following cases must not occur (which the application has to check):
 *         -A choice A contains an option which is being required by a
 *          choice B (A may be equal to B) and an option of A requires a
 *          setting.
 *         -In one choice for a pair of options A and B, A is required
 *          by a choice C, B is required by a choice D and C and D are
 *          different choices.
 *       
 *       The attribute "requiredValue" must not only be used if the ID reference
 *       in the content refers to a element of the type "Value".
 *     
 * 
 * <p>Java class for Requires complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Requires">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>IDREF">
 *       &lt;attribute name="requiredValue" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Requires", propOrder = {
    "value"
})
public class Requires {

    @XmlValue
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object value;
    @XmlAttribute
    protected Integer requiredValue;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * Gets the value of the requiredValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequiredValue() {
        return requiredValue;
    }

    /**
     * Sets the value of the requiredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequiredValue(Integer value) {
        this.requiredValue = value;
    }

}
