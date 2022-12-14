//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.1 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.hka.xml.uebungen.jaxb;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         <element name="anschrift">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="firmen-name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   <element name="vorname" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   <element name="nachname" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   <element name="postleitzahl" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   <element name="stadt" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                   <element name="strasse" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                   <element name="haus-nummer" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                   <element ref="{uebung3}telefon" minOccurs="0"/>
 *                   <element ref="{uebung3}fax" minOccurs="0"/>
 *                   <element name="e-mail" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="steuernummer" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         <element name="umsatzsteuer-identifikationsnummer" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
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
    "anschrift",
    "steuernummer",
    "umsatzsteuerIdentifikationsnummer"
})
@XmlRootElement(name = "unternehmer")
public class Unternehmer {

    @XmlElement(required = true)
    protected Unternehmer.Anschrift anschrift;
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String steuernummer;
    @XmlElement(name = "umsatzsteuer-identifikationsnummer")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String umsatzsteuerIdentifikationsnummer;

    /**
     * Ruft den Wert der anschrift-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Unternehmer.Anschrift }
     *     
     */
    public Unternehmer.Anschrift getAnschrift() {
        return anschrift;
    }

    /**
     * Legt den Wert der anschrift-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Unternehmer.Anschrift }
     *     
     */
    public void setAnschrift(Unternehmer.Anschrift value) {
        this.anschrift = value;
    }

    /**
     * Ruft den Wert der steuernummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSteuernummer() {
        return steuernummer;
    }

    /**
     * Legt den Wert der steuernummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSteuernummer(String value) {
        this.steuernummer = value;
    }

    /**
     * Ruft den Wert der umsatzsteuerIdentifikationsnummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmsatzsteuerIdentifikationsnummer() {
        return umsatzsteuerIdentifikationsnummer;
    }

    /**
     * Legt den Wert der umsatzsteuerIdentifikationsnummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmsatzsteuerIdentifikationsnummer(String value) {
        this.umsatzsteuerIdentifikationsnummer = value;
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
     *         <element name="firmen-name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         <element name="vorname" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         <element name="nachname" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         <element name="postleitzahl" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         <element name="stadt" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *         <element name="strasse" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *         <element name="haus-nummer" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *         <element ref="{uebung3}telefon" minOccurs="0"/>
     *         <element ref="{uebung3}fax" minOccurs="0"/>
     *         <element name="e-mail" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
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
        "firmenName",
        "vorname",
        "nachname",
        "postleitzahl",
        "stadt",
        "strasse",
        "hausNummer",
        "telefon",
        "fax",
        "eMail"
    })
    public static class Anschrift {

        @XmlElement(name = "firmen-name")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String firmenName;
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String vorname;
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String nachname;
        @XmlElement(required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger postleitzahl;
        @XmlElement(required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String stadt;
        @XmlElement(required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String strasse;
        @XmlElement(name = "haus-nummer", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String hausNummer;
        protected Telefon telefon;
        protected Fax fax;
        @XmlElement(name = "e-mail")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String eMail;

        /**
         * Ruft den Wert der firmenName-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirmenName() {
            return firmenName;
        }

        /**
         * Legt den Wert der firmenName-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirmenName(String value) {
            this.firmenName = value;
        }

        /**
         * Ruft den Wert der vorname-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVorname() {
            return vorname;
        }

        /**
         * Legt den Wert der vorname-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVorname(String value) {
            this.vorname = value;
        }

        /**
         * Ruft den Wert der nachname-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNachname() {
            return nachname;
        }

        /**
         * Legt den Wert der nachname-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNachname(String value) {
            this.nachname = value;
        }

        /**
         * Ruft den Wert der postleitzahl-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPostleitzahl() {
            return postleitzahl;
        }

        /**
         * Legt den Wert der postleitzahl-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPostleitzahl(BigInteger value) {
            this.postleitzahl = value;
        }

        /**
         * Ruft den Wert der stadt-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStadt() {
            return stadt;
        }

        /**
         * Legt den Wert der stadt-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStadt(String value) {
            this.stadt = value;
        }

        /**
         * Ruft den Wert der strasse-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStrasse() {
            return strasse;
        }

        /**
         * Legt den Wert der strasse-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStrasse(String value) {
            this.strasse = value;
        }

        /**
         * Ruft den Wert der hausNummer-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHausNummer() {
            return hausNummer;
        }

        /**
         * Legt den Wert der hausNummer-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHausNummer(String value) {
            this.hausNummer = value;
        }

        /**
         * Ruft den Wert der telefon-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Telefon }
         *     
         */
        public Telefon getTelefon() {
            return telefon;
        }

        /**
         * Legt den Wert der telefon-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Telefon }
         *     
         */
        public void setTelefon(Telefon value) {
            this.telefon = value;
        }

        /**
         * Ruft den Wert der fax-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Fax }
         *     
         */
        public Fax getFax() {
            return fax;
        }

        /**
         * Legt den Wert der fax-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Fax }
         *     
         */
        public void setFax(Fax value) {
            this.fax = value;
        }

        /**
         * Ruft den Wert der eMail-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMail() {
            return eMail;
        }

        /**
         * Legt den Wert der eMail-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMail(String value) {
            this.eMail = value;
        }

    }

}
