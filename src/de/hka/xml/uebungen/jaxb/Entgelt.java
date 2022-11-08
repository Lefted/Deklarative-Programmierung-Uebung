//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.1 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.hka.xml.uebungen.jaxb;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
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
 *         <element name="rechnungsbetrag" type="{uebung3}rechnungsbetrag-type"/>
 *         <element ref="{uebung3}choice-nettobetrag-bruttobetrag"/>
 *         <element name="mehrwertsteuer-gesamt" type="{uebung3}rechnungsbetrag-type"/>
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
    "rechnungsbetrag",
    "choiceNettobetragBruttobetrag",
    "mehrwertsteuerGesamt"
})
@XmlRootElement(name = "entgelt")
public class Entgelt {

    @XmlElement(required = true)
    protected RechnungsbetragType rechnungsbetrag;
    @XmlElementRef(name = "choice-nettobetrag-bruttobetrag", namespace = "uebung3", type = JAXBElement.class)
    protected JAXBElement<RechnungsbetragType> choiceNettobetragBruttobetrag;
    @XmlElement(name = "mehrwertsteuer-gesamt", required = true)
    protected RechnungsbetragType mehrwertsteuerGesamt;

    /**
     * Ruft den Wert der rechnungsbetrag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RechnungsbetragType }
     *     
     */
    public RechnungsbetragType getRechnungsbetrag() {
        return rechnungsbetrag;
    }

    /**
     * Legt den Wert der rechnungsbetrag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RechnungsbetragType }
     *     
     */
    public void setRechnungsbetrag(RechnungsbetragType value) {
        this.rechnungsbetrag = value;
    }

    /**
     * Ruft den Wert der choiceNettobetragBruttobetrag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RechnungsbetragType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechnungsbetragType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechnungsbetragType }{@code >}
     *     
     */
    public JAXBElement<RechnungsbetragType> getChoiceNettobetragBruttobetrag() {
        return choiceNettobetragBruttobetrag;
    }

    /**
     * Legt den Wert der choiceNettobetragBruttobetrag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RechnungsbetragType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechnungsbetragType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RechnungsbetragType }{@code >}
     *     
     */
    public void setChoiceNettobetragBruttobetrag(JAXBElement<RechnungsbetragType> value) {
        this.choiceNettobetragBruttobetrag = value;
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
