//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.1 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.hka.xml.uebungen.jaxb;

import java.math.BigInteger;
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
 *         <element name="menge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         <element name="einheit" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         <element name="leistung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="einzel-preis" type="{uebung3}rechnungsbetrag-type"/>
 *         <element name="gesamt-preis" type="{uebung3}rechnungsbetrag-type"/>
 *         <element name="mehrwertsteuer-prozent" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         <element name="datum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="positionsnummer" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "menge",
    "einheit",
    "leistung",
    "einzelPreis",
    "gesamtPreis",
    "mehrwertsteuerProzent",
    "datum"
})
@XmlRootElement(name = "abrechnungs-position")
public class AbrechnungsPosition {

    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger menge;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String einheit;
    @XmlElement(required = true)
    protected String leistung;
    @XmlElement(name = "einzel-preis", required = true)
    protected RechnungsbetragType einzelPreis;
    @XmlElement(name = "gesamt-preis", required = true)
    protected RechnungsbetragType gesamtPreis;
    @XmlElement(name = "mehrwertsteuer-prozent")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger mehrwertsteuerProzent;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    @XmlAttribute(name = "positionsnummer", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger positionsnummer;

    /**
     * Ruft den Wert der menge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMenge() {
        return menge;
    }

    /**
     * Legt den Wert der menge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMenge(BigInteger value) {
        this.menge = value;
    }

    /**
     * Ruft den Wert der einheit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEinheit() {
        return einheit;
    }

    /**
     * Legt den Wert der einheit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEinheit(String value) {
        this.einheit = value;
    }

    /**
     * Ruft den Wert der leistung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeistung() {
        return leistung;
    }

    /**
     * Legt den Wert der leistung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeistung(String value) {
        this.leistung = value;
    }

    /**
     * Ruft den Wert der einzelPreis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RechnungsbetragType }
     *     
     */
    public RechnungsbetragType getEinzelPreis() {
        return einzelPreis;
    }

    /**
     * Legt den Wert der einzelPreis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RechnungsbetragType }
     *     
     */
    public void setEinzelPreis(RechnungsbetragType value) {
        this.einzelPreis = value;
    }

    /**
     * Ruft den Wert der gesamtPreis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RechnungsbetragType }
     *     
     */
    public RechnungsbetragType getGesamtPreis() {
        return gesamtPreis;
    }

    /**
     * Legt den Wert der gesamtPreis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RechnungsbetragType }
     *     
     */
    public void setGesamtPreis(RechnungsbetragType value) {
        this.gesamtPreis = value;
    }

    /**
     * Ruft den Wert der mehrwertsteuerProzent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMehrwertsteuerProzent() {
        return mehrwertsteuerProzent;
    }

    /**
     * Legt den Wert der mehrwertsteuerProzent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMehrwertsteuerProzent(BigInteger value) {
        this.mehrwertsteuerProzent = value;
    }

    /**
     * Ruft den Wert der datum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatum() {
        return datum;
    }

    /**
     * Legt den Wert der datum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatum(XMLGregorianCalendar value) {
        this.datum = value;
    }

    /**
     * Ruft den Wert der positionsnummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPositionsnummer() {
        return positionsnummer;
    }

    /**
     * Legt den Wert der positionsnummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPositionsnummer(BigInteger value) {
        this.positionsnummer = value;
    }

}
