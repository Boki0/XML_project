
package com.xml.project.model;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mesto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Ulica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Broj" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mesto",
    "ulica",
    "broj"
})
@XmlRootElement(name = "Adresa")
public class Adresa {

    @XmlElement(name = "Mesto", required = true)
    protected String mesto;
    @XmlElement(name = "Ulica", required = true)
    protected String ulica;
    @XmlElement(name = "Broj", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger broj;

    /**
     * Gets the value of the mesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesto() {
        return mesto;
    }

    /**
     * Sets the value of the mesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesto(String value) {
        this.mesto = value;
    }

    /**
     * Gets the value of the ulica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlica() {
        return ulica;
    }

    /**
     * Sets the value of the ulica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlica(String value) {
        this.ulica = value;
    }

    /**
     * Gets the value of the broj property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBroj() {
        return broj;
    }

    /**
     * Sets the value of the broj property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBroj(BigInteger value) {
        this.broj = value;
    }
    @Override
    public String toString() {

        StringBuffer buffer = new StringBuffer();
        buffer.append("\n");
        buffer.append("Adresa: ");
        buffer.append("\n\t\t");
        buffer.append(mesto+"  "+ ulica+ "  "+broj);
        return buffer.toString();
    }


}
