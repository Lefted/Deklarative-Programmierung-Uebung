//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.1 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.hka.xml.uebungen.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="bruttobetrag" type="{uebung3}rechnungsbetrag-type"/>
 *         <element name="nettobetrag" type="{uebung3}rechnungsbetrag-type" minOccurs="0"/>
 *         <element name="mehrwertsteuer-gesamt" type="{uebung3}rechnungsbetrag-type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bruttobetrag",
    "nettobetrag",
    "mehrwertsteuerGesamt"
})
@XmlRootElement(name = "entgelt")
public class Entgelt {

    @XmlElement(required = true)
    protected RechnungsbetragType bruttobetrag;
    protected RechnungsbetragType nettobetrag;
    @XmlElement(name = "mehrwertsteuer-gesamt")
    protected RechnungsbetragType mehrwertsteuerGesamt;

    /**
     * Ruft den Wert der bruttobetrag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RechnungsbetragType }
     *     
     */
    public RechnungsbetragType getBruttobetrag() {
        return bruttobetrag;
    }

    /**
     * Legt den Wert der bruttobetrag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RechnungsbetragType }
     *     
     */
    public void setBruttobetrag(RechnungsbetragType value) {
        this.bruttobetrag = value;
    }

    /**
     * Ruft den Wert der nettobetrag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RechnungsbetragType }
     *     
     */
    public RechnungsbetragType getNettobetrag() {
        return nettobetrag;
    }

    /**
     * Legt den Wert der nettobetrag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RechnungsbetragType }
     *     
     */
    public void setNettobetrag(RechnungsbetragType value) {
        this.nettobetrag = value;
    }

    /**
     * Ruft den Wert der mehrwertsteuerGesamt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RechnungsbetragType }
     *     
     */
    public RechnungsbetragType getMehrwertsteuerGesamt() {
        return mehrwertsteuerGesamt;
    }

    /**
     * Legt den Wert der mehrwertsteuerGesamt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RechnungsbetragType }
     *     
     */
    public void setMehrwertsteuerGesamt(RechnungsbetragType value) {
        this.mehrwertsteuerGesamt = value;
    }

}
