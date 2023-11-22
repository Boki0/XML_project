
package com.xml.project.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPrilog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPrilog"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Sadrzi_opis" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Sadrzi_primer" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPrilog", propOrder = {

})
public class TPrilog {

    @XmlElement(name = "Sadrzi_opis")
    protected boolean sadrziOpis;
    @XmlElement(name = "Sadrzi_primer")
    protected boolean sadrziPrimer;

    /**
     * Gets the value of the sadrziOpis property.
     * 
     */
    public boolean isSadrziOpis() {
        return sadrziOpis;
    }

    /**
     * Sets the value of the sadrziOpis property.
     * 
     */
    public void setSadrziOpis(boolean value) {
        this.sadrziOpis = value;
    }

    /**
     * Gets the value of the sadrziPrimer property.
     * 
     */
    public boolean isSadrziPrimer() {
        return sadrziPrimer;
    }

    /**
     * Sets the value of the sadrziPrimer property.
     * 
     */
    public void setSadrziPrimer(boolean value) {
        this.sadrziPrimer = value;
    }

}
