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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BooleanSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BooleanSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:strike-devices:configuration}BooleanSetting">
 *       &lt;redefine>
 *         &lt;complexType name="BooleanSetting">
 *           &lt;complexContent>
 *             &lt;extension base="{urn:strike-devices:configuration}Setting">
 *               &lt;sequence>
 *                 &lt;element name="image" type="{urn:strike-devices:configuration}DescriptionImage" minOccurs="0"/>
 *               &lt;/sequence>
 *               &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *             &lt;/extension>
 *           &lt;/complexContent>
 *         &lt;/complexType>
 *       &lt;/redefine>
 *       &lt;attGroup ref="{urn:strike-devices:configuration}Position"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BooleanSetting")
public class BooleanSetting
    extends OriginalBooleanSetting
{

    @XmlAttribute(name = "byte-no", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long byteNo;
    @XmlAttribute(name = "bit-no", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long bitNo;

    /**
     * Gets the value of the byteNo property.
     * 
     */
    public long getByteNo() {
        return byteNo;
    }

    /**
     * Sets the value of the byteNo property.
     * 
     */
    public void setByteNo(long value) {
        this.byteNo = value;
    }

    /**
     * Gets the value of the bitNo property.
     * 
     */
    public long getBitNo() {
        return bitNo;
    }

    /**
     * Sets the value of the bitNo property.
     * 
     */
    public void setBitNo(long value) {
        this.bitNo = value;
    }

}
