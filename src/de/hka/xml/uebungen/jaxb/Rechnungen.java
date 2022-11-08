//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.1 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.hka.xml.uebungen.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         <element name="rechnung" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{uebung3}unternehmer"/>
 *                   <element ref="{uebung3}leistungs-empfaenger"/>
 *                   <element name="ausstellungsdatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="rechnungsnummer" type="{uebung3}rechnungsnummer-type"/>
 *                   <element ref="{uebung3}entgelt"/>
 *                   <element ref="{uebung3}abrechnungs-positionen"/>
 *                   <element ref="{uebung3}zahlungsarten"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rechnung"
})
@XmlRootElement(name = "rechnungen")
public class Rechnungen {

    @XmlElement(required = true)
    protected List<Rechnungen.Rechnung> rechnung;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name;

    /**
     * Gets the value of the rechnung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rechnung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRechnung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rechnungen.Rechnung }
     * 
     * 
     * @return
     *     The value of the rechnung property.
     */
    public List<Rechnungen.Rechnung> getRechnung() {
        if (rechnung == null) {
            rechnung = new ArrayList<>();
        }
        return this.rechnung;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }


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
     *         <element ref="{uebung3}unternehmer"/>
     *         <element ref="{uebung3}leistungs-empfaenger"/>
     *         <element name="ausstellungsdatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="rechnungsnummer" type="{uebung3}rechnungsnummer-type"/>
     *         <element ref="{uebung3}entgelt"/>
     *         <element ref="{uebung3}abrechnungs-positionen"/>
     *         <element ref="{uebung3}zahlungsarten"/>
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
        "unternehmer",
        "leistungsEmpfaenger",
        "ausstellungsdatum",
        "rechnungsnummer",
        "entgelt",
        "abrechnungsPositionen",
        "zahlungsarten"
    })
    public static class Rechnung {

        @XmlElement(required = true)
        protected Unternehmer unternehmer;
        @XmlElement(name = "leistungs-empfaenger", required = true)
        protected LeistungsEmpfaenger leistungsEmpfaenger;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar ausstellungsdatum;
        @XmlElement(required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String rechnungsnummer;
        @XmlElement(required = true)
        protected Entgelt entgelt;
        @XmlElement(name = "abrechnungs-positionen", required = true)
        protected AbrechnungsPositionen abrechnungsPositionen;
        @XmlElement(required = true)
        protected Zahlungsarten zahlungsarten;

        /**
         * Ruft den Wert der unternehmer-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Unternehmer }
         *     
         */
        public Unternehmer getUnternehmer() {
            return unternehmer;
        }

        /**
         * Legt den Wert der unternehmer-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Unternehmer }
         *     
         */
        public void setUnternehmer(Unternehmer value) {
            this.unternehmer = value;
        }

        /**
         * Ruft den Wert der leistungsEmpfaenger-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link LeistungsEmpfaenger }
         *     
         */
        public LeistungsEmpfaenger getLeistungsEmpfaenger() {
            return leistungsEmpfaenger;
        }

        /**
         * Legt den Wert der leistungsEmpfaenger-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link LeistungsEmpfaenger }
         *     
         */
        public void setLeistungsEmpfaenger(LeistungsEmpfaenger value) {
            this.leistungsEmpfaenger = value;
        }

        /**
         * Ruft den Wert der ausstellungsdatum-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAusstellungsdatum() {
            return ausstellungsdatum;
        }

        /**
         * Legt den Wert der ausstellungsdatum-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setAusstellungsdatum(XMLGregorianCalendar value) {
            this.ausstellungsdatum = value;
        }

        /**
         * Ruft den Wert der rechnungsnummer-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRechnungsnummer() {
            return rechnungsnummer;
        }

        /**
         * Legt den Wert der rechnungsnummer-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRechnungsnummer(String value) {
            this.rechnungsnummer = value;
        }

        /**
         * Ruft den Wert der entgelt-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Entgelt }
         *     
         */
        public Entgelt getEntgelt() {
            return entgelt;
        }

        /**
         * Legt den Wert der entgelt-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Entgelt }
         *     
         */
        public void setEntgelt(Entgelt value) {
            this.entgelt = value;
        }

        /**
         * Ruft den Wert der abrechnungsPositionen-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link AbrechnungsPositionen }
         *     
         */
        public AbrechnungsPositionen getAbrechnungsPositionen() {
            return abrechnungsPositionen;
        }

        /**
         * Legt den Wert der abrechnungsPositionen-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link AbrechnungsPositionen }
         *     
         */
        public void setAbrechnungsPositionen(AbrechnungsPositionen value) {
            this.abrechnungsPositionen = value;
        }

        /**
         * Ruft den Wert der zahlungsarten-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Zahlungsarten }
         *     
         */
        public Zahlungsarten getZahlungsarten() {
            return zahlungsarten;
        }

        /**
         * Legt den Wert der zahlungsarten-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Zahlungsarten }
         *     
         */
        public void setZahlungsarten(Zahlungsarten value) {
            this.zahlungsarten = value;
        }

    }

}
