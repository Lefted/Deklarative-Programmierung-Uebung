//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.1 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.hka.xml.uebungen.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für rechnungsbetrag-type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="rechnungsbetrag-type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="betrag" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="waehrung" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rechnungsbetrag-type", propOrder = {
    "betrag",
    "waehrung"
})
public class RechnungsbetragType {

    protected double betrag;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String waehrung;

    /**
     * Ruft den Wert der betrag-Eigenschaft ab.
     * 
     */
    public double getBetrag() {
        return betrag;
    }

    /**
     * Legt den Wert der betrag-Eigenschaft fest.
     * 
     */
    public void setBetrag(double value) {
        this.betrag = value;
    }

    /**
     * Ruft den Wert der waehrung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Legt den Wert der waehrung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaehrung(String value) {
        this.waehrung = value;
    }

}
