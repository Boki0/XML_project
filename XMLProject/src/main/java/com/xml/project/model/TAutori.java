
package com.xml.project.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TAutori complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAutori"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Autor" type="{}TAutor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAutori", propOrder = {
    "autor"
})
public class TAutori {

    @XmlElement(name = "Autor")
    protected List<TAutor> autor;

    /**
     * Gets the value of the autor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the autor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAutor }
     * 
     * 
     */
    public List<TAutor> getAutor() {
        if (autor == null) {
            autor = new ArrayList<TAutor>();
        }
        return this.autor;
    }

    @Override
    public String toString() {
       StringBuffer bf = new StringBuffer();
        for (TAutor t: autor) {
            bf.append(t.toString());

        }
        return bf.toString();

    }
}
