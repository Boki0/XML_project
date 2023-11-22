
package com.xml.project.model;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TOsnovno_o_delu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TOsnovno_o_delu"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identifikator"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="Naslov" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Alternativni_naslov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Autori" type="{}TAutori"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOsnovno_o_delu", propOrder = {
    "identifikator",
    "autori"
})
@XmlSeeAlso({
    TAutorskoDelo.class
})
public class TOsnovnoODelu {

    @XmlElement(name = "Identifikator", required = true)
    protected TOsnovnoODelu.Identifikator identifikator;
    @XmlElement(name = "Autori", required = true)
    protected TAutori autori;

    /**
     * Gets the value of the identifikator property.
     * 
     * @return
     *     possible object is
     *     {@link TOsnovnoODelu.Identifikator }
     *     
     */
    public TOsnovnoODelu.Identifikator getIdentifikator() {
        return identifikator;
    }

    /**
     * Sets the value of the identifikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOsnovnoODelu.Identifikator }
     *     
     */
    public void setIdentifikator(TOsnovnoODelu.Identifikator value) {
        this.identifikator = value;
    }

    /**
     * Gets the value of the autori property.
     * 
     * @return
     *     possible object is
     *     {@link TAutori }
     *     
     */
    public TAutori getAutori() {
        return autori;
    }

    /**
     * Sets the value of the autori property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAutori }
     *     
     */
    public void setAutori(TAutori value) {
        this.autori = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="Naslov" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Alternativni_naslov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Identifikator {

        @XmlElement(name = "Naslov", required = true)
        protected String naslov;
        @XmlElementRef(name = "Alternativni_naslov", type = JAXBElement.class, required = false)
        protected JAXBElement<String> alternativniNaslov;

        /**
         * Gets the value of the naslov property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNaslov() {
            return naslov;
        }

        /**
         * Sets the value of the naslov property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNaslov(String value) {
            this.naslov = value;
        }

        /**
         * Gets the value of the alternativniNaslov property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAlternativniNaslov() {
            return alternativniNaslov;
        }

        /**
         * Sets the value of the alternativniNaslov property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAlternativniNaslov(JAXBElement<String> value) {
            this.alternativniNaslov = value;
        }

    }

}
