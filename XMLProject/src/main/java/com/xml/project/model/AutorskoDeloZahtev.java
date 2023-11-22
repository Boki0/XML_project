
package com.xml.project.model;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
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
 *       &lt;all&gt;
 *         &lt;element name="Podnosilac"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="Telefon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Podaci_podnosioca"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element name="Autor" type="{}TAutor" minOccurs="0"/&gt;
 *                             &lt;element name="Punomocnik" type="{}TFizicko_lice" minOccurs="0"/&gt;
 *                             &lt;element name="Pravno_lice" type="{}TPravno_lice" minOccurs="0"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Autorsko_delo" type="{}TAutorsko_delo"/&gt;
 *         &lt;element name="Prilog" type="{}TPrilog" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="naslov" type="{http://www.w3.org/2001/XMLSchema}string" fixed="ЗАХТЕВ ЗА УНОШЕЊЕ У ЕВИДЕНЦИЈУ И ДЕПОНОВАЊЕ АУТОРСКИХ ДЕЛА" /&gt;
 *       &lt;attribute name="broj_prijave" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="datum_podnosenja" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
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
@XmlRootElement(name = "Autorsko_delo_zahtev")
public class AutorskoDeloZahtev {

    @XmlElement(name = "Podnosilac", required = true)
    protected AutorskoDeloZahtev.Podnosilac podnosilac;
    @XmlElement(name = "Autorsko_delo", required = true)
    protected TAutorskoDelo autorskoDelo;
    @XmlElementRef(name = "Prilog", type = JAXBElement.class, required = false)
    protected JAXBElement<TPrilog> prilog;
    @XmlAttribute(name = "naslov")
    protected String naslov;
    @XmlAttribute(name = "broj_prijave")
    protected String brojPrijave;
    @XmlAttribute(name = "datum_podnosenja")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumPodnosenja;

    /**
     * Gets the value of the podnosilac property.
     * 
     * @return
     *     possible object is
     *     {@link AutorskoDeloZahtev.Podnosilac }
     *     
     */
    public AutorskoDeloZahtev.Podnosilac getPodnosilac() {
        return podnosilac;
    }

    /**
     * Sets the value of the podnosilac property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutorskoDeloZahtev.Podnosilac }
     *     
     */
    public void setPodnosilac(AutorskoDeloZahtev.Podnosilac value) {
        this.podnosilac = value;
    }

    /**
     * Gets the value of the autorskoDelo property.
     * 
     * @return
     *     possible object is
     *     {@link TAutorskoDelo }
     *     
     */
    public TAutorskoDelo getAutorskoDelo() {
        return autorskoDelo;
    }

    /**
     * Sets the value of the autorskoDelo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAutorskoDelo }
     *     
     */
    public void setAutorskoDelo(TAutorskoDelo value) {
        this.autorskoDelo = value;
    }

    /**
     * Gets the value of the prilog property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TPrilog }{@code >}
     *     
     */
    public JAXBElement<TPrilog> getPrilog() {
        return prilog;
    }

    /**
     * Sets the value of the prilog property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TPrilog }{@code >}
     *     
     */
    public void setPrilog(JAXBElement<TPrilog> value) {
        this.prilog = value;
    }

    /**
     * Gets the value of the naslov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaslov() {
        if (naslov == null) {
            return "\u0417\u0410\u0425\u0422\u0415\u0412 \u0417\u0410 \u0423\u041d\u041e\u0428\u0415\u040a\u0415 \u0423 \u0415\u0412\u0418\u0414\u0415\u041d\u0426\u0418\u0408\u0423 \u0418 \u0414\u0415\u041f\u041e\u041d\u041e\u0412\u0410\u040a\u0415 \u0410\u0423\u0422\u041e\u0420\u0421\u041a\u0418\u0425 \u0414\u0415\u041b\u0410";
        } else {
            return naslov;
        }
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
     * Gets the value of the brojPrijave property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrojPrijave() {
        return brojPrijave;
    }

    /**
     * Sets the value of the brojPrijave property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrojPrijave(String value) {
        this.brojPrijave = value;
    }

    /**
     * Gets the value of the datumPodnosenja property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumPodnosenja() {
        return datumPodnosenja;
    }

    /**
     * Sets the value of the datumPodnosenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumPodnosenja(XMLGregorianCalendar value) {
        this.datumPodnosenja = value;
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
     *         &lt;element name="Telefon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Podaci_podnosioca"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;element name="Autor" type="{}TAutor" minOccurs="0"/&gt;
     *                   &lt;element name="Punomocnik" type="{}TFizicko_lice" minOccurs="0"/&gt;
     *                   &lt;element name="Pravno_lice" type="{}TPravno_lice" minOccurs="0"/&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
    public static class Podnosilac {

        @XmlElementRef(name = "Telefon", type = JAXBElement.class, required = false)
        protected JAXBElement<String> telefon;
        @XmlElement(name = "Email")
        protected String email;
        @XmlElement(name = "Podaci_podnosioca", required = true)
        protected AutorskoDeloZahtev.Podnosilac.PodaciPodnosioca podaciPodnosioca;

        /**
         * Gets the value of the telefon property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getTelefon() {
            return telefon;
        }

        /**
         * Sets the value of the telefon property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setTelefon(JAXBElement<String> value) {
            this.telefon = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Gets the value of the podaciPodnosioca property.
         * 
         * @return
         *     possible object is
         *     {@link AutorskoDeloZahtev.Podnosilac.PodaciPodnosioca }
         *     
         */
        public AutorskoDeloZahtev.Podnosilac.PodaciPodnosioca getPodaciPodnosioca() {
            return podaciPodnosioca;
        }

        /**
         * Sets the value of the podaciPodnosioca property.
         * 
         * @param value
         *     allowed object is
         *     {@link AutorskoDeloZahtev.Podnosilac.PodaciPodnosioca }
         *     
         */
        public void setPodaciPodnosioca(AutorskoDeloZahtev.Podnosilac.PodaciPodnosioca value) {
            this.podaciPodnosioca = value;
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
         *       &lt;choice&gt;
         *         &lt;element name="Autor" type="{}TAutor" minOccurs="0"/&gt;
         *         &lt;element name="Punomocnik" type="{}TFizicko_lice" minOccurs="0"/&gt;
         *         &lt;element name="Pravno_lice" type="{}TPravno_lice" minOccurs="0"/&gt;
         *       &lt;/choice&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "autor",
            "punomocnik",
            "pravnoLice"
        })
        public static class PodaciPodnosioca {

            @XmlElement(name = "Autor")
            protected TAutor autor;
            @XmlElementRef(name = "Punomocnik", type = JAXBElement.class, required = false)
            protected JAXBElement<TFizickoLice> punomocnik;
            @XmlElementRef(name = "Pravno_lice", type = JAXBElement.class, required = false)
            protected JAXBElement<TPravnoLice> pravnoLice;

            /**
             * Gets the value of the autor property.
             * 
             * @return
             *     possible object is
             *     {@link TAutor }
             *     
             */
            public TAutor getAutor() {
                return autor;
            }

            /**
             * Sets the value of the autor property.
             * 
             * @param value
             *     allowed object is
             *     {@link TAutor }
             *     
             */
            public void setAutor(TAutor value) {
                this.autor = value;
            }

            /**
             * Gets the value of the punomocnik property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link TFizickoLice }{@code >}
             *     
             */
            public JAXBElement<TFizickoLice> getPunomocnik() {
                return punomocnik;
            }

            /**
             * Sets the value of the punomocnik property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link TFizickoLice }{@code >}
             *     
             */
            public void setPunomocnik(JAXBElement<TFizickoLice> value) {
                this.punomocnik = value;
            }

            /**
             * Gets the value of the pravnoLice property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link TPravnoLice }{@code >}
             *     
             */
            public JAXBElement<TPravnoLice> getPravnoLice() {
                return pravnoLice;
            }

            /**
             * Sets the value of the pravnoLice property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link TPravnoLice }{@code >}
             *     
             */
            public void setPravnoLice(JAXBElement<TPravnoLice> value) {
                this.pravnoLice = value;
            }

        }

    }

}
