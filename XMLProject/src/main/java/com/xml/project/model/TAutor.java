
package com.xml.project.model;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TAutor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAutor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}TFizicko_lice"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pseudonim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Godina_smrti" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="primarni" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="anonimni" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAutor", propOrder = {
    "pseudonim",
    "godinaSmrti"
})
public class TAutor
    extends TFizickoLice
{

    @XmlElementRef(name = "Pseudonim", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pseudonim;
    @XmlElementRef(name = "Godina_smrti", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> godinaSmrti;
    @XmlAttribute(name = "primarni")
    protected Boolean primarni;
    @XmlAttribute(name = "anonimni")
    protected Boolean anonimni;

    /**
     * Gets the value of the pseudonim property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPseudonim() {
        return pseudonim;
    }

    /**
     * Sets the value of the pseudonim property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPseudonim(JAXBElement<String> value) {
        this.pseudonim = value;
    }

    /**
     * Gets the value of the godinaSmrti property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getGodinaSmrti() {
        return godinaSmrti;
    }

    /**
     * Sets the value of the godinaSmrti property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setGodinaSmrti(JAXBElement<BigInteger> value) {
        this.godinaSmrti = value;
    }

    /**
     * Gets the value of the primarni property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimarni() {
        return primarni;
    }

    /**
     * Sets the value of the primarni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimarni(Boolean value) {
        this.primarni = value;
    }

    /**
     * Gets the value of the anonimni property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnonimni() {
        return anonimni;
    }

    /**
     * Sets the value of the anonimni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnonimni(Boolean value) {
        this.anonimni = value;
    }
    @Override
    public String toString() {
        return "TAutor\n\t\t" + pseudonim.getValue() +" godinaSmrti=" + godinaSmrti.getValue() +" primarni=" + primarni +" anonimni=" + anonimni +super.toString() +"\n";
    }

}
