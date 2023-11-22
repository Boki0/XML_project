
package com.xml.project.model;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TAutorsko_delo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAutorsko_delo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}TOsnovno_o_delu"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="podaci_o_preradi" type="{}TOsnovno_o_delu" minOccurs="0"/&gt;
 *         &lt;element name="radni_odnos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nacin_koriscenja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="vrsta" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="forma_zapisa" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="prerada" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAutorsko_delo", propOrder = {
    "podaciOPreradi",
    "radniOdnos",
    "nacinKoriscenja"
})
public class TAutorskoDelo
    extends TOsnovnoODelu
{

    @XmlElementRef(name = "podaci_o_preradi", type = JAXBElement.class, required = false)
    protected JAXBElement<TOsnovnoODelu> podaciOPreradi;
    @XmlElementRef(name = "radni_odnos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> radniOdnos;
    @XmlElementRef(name = "nacin_koriscenja", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nacinKoriscenja;
    @XmlAttribute(name = "vrsta")
    protected String vrsta;
    @XmlAttribute(name = "forma_zapisa")
    protected String formaZapisa;
    @XmlAttribute(name = "prerada")
    protected Boolean prerada;

    /**
     * Gets the value of the podaciOPreradi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TOsnovnoODelu }{@code >}
     *     
     */
    public JAXBElement<TOsnovnoODelu> getPodaciOPreradi() {
        return podaciOPreradi;
    }

    /**
     * Sets the value of the podaciOPreradi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TOsnovnoODelu }{@code >}
     *     
     */
    public void setPodaciOPreradi(JAXBElement<TOsnovnoODelu> value) {
        this.podaciOPreradi = value;
    }

    /**
     * Gets the value of the radniOdnos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRadniOdnos() {
        return radniOdnos;
    }

    /**
     * Sets the value of the radniOdnos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRadniOdnos(JAXBElement<String> value) {
        this.radniOdnos = value;
    }

    /**
     * Gets the value of the nacinKoriscenja property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNacinKoriscenja() {
        return nacinKoriscenja;
    }

    /**
     * Sets the value of the nacinKoriscenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNacinKoriscenja(JAXBElement<String> value) {
        this.nacinKoriscenja = value;
    }

    /**
     * Gets the value of the vrsta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsta() {
        return vrsta;
    }

    /**
     * Sets the value of the vrsta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrsta(String value) {
        this.vrsta = value;
    }

    /**
     * Gets the value of the formaZapisa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaZapisa() {
        return formaZapisa;
    }

    /**
     * Sets the value of the formaZapisa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaZapisa(String value) {
        this.formaZapisa = value;
    }

    /**
     * Gets the value of the prerada property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrerada() {
        return prerada;
    }

    /**
     * Sets the value of the prerada property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrerada(Boolean value) {
        this.prerada = value;
    }

}
