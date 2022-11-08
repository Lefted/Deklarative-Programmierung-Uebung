//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.1 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.hka.xml.uebungen.jaxb;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.hka.xml.uebungen.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ChoiceSteuernummerUmsatzsteuerId_QNAME = new QName("uebung3", "choice-steuernummer-umsatzsteuer-id");
    private final static QName _Steuernummer_QNAME = new QName("uebung3", "steuernummer");
    private final static QName _UmsatzsteuerIdentifikationsnummer_QNAME = new QName("uebung3", "umsatzsteuer-identifikationsnummer");
    private final static QName _ChoiceNettobetragBruttobetrag_QNAME = new QName("uebung3", "choice-nettobetrag-bruttobetrag");
    private final static QName _Nettobetrag_QNAME = new QName("uebung3", "nettobetrag");
    private final static QName _Bruttobetrag_QNAME = new QName("uebung3", "bruttobetrag");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.hka.xml.uebungen.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Unternehmer }
     * 
     * @return
     *     the new instance of {@link Unternehmer }
     */
    public Unternehmer createUnternehmer() {
        return new Unternehmer();
    }

    /**
     * Create an instance of {@link Rechnungen }
     * 
     * @return
     *     the new instance of {@link Rechnungen }
     */
    public Rechnungen createRechnungen() {
        return new Rechnungen();
    }

    /**
     * Create an instance of {@link Telefon }
     * 
     * @return
     *     the new instance of {@link Telefon }
     */
    public Telefon createTelefon() {
        return new Telefon();
    }

    /**
     * Create an instance of {@link Fax }
     * 
     * @return
     *     the new instance of {@link Fax }
     */
    public Fax createFax() {
        return new Fax();
    }

    /**
     * Create an instance of {@link Unternehmer.Anschrift }
     * 
     * @return
     *     the new instance of {@link Unternehmer.Anschrift }
     */
    public Unternehmer.Anschrift createUnternehmerAnschrift() {
        return new Unternehmer.Anschrift();
    }

    /**
     * Create an instance of {@link LeistungsEmpfaenger }
     * 
     * @return
     *     the new instance of {@link LeistungsEmpfaenger }
     */
    public LeistungsEmpfaenger createLeistungsEmpfaenger() {
        return new LeistungsEmpfaenger();
    }

    /**
     * Create an instance of {@link RechnungsbetragType }
     * 
     * @return
     *     the new instance of {@link RechnungsbetragType }
     */
    public RechnungsbetragType createRechnungsbetragType() {
        return new RechnungsbetragType();
    }

    /**
     * Create an instance of {@link Entgelt }
     * 
     * @return
     *     the new instance of {@link Entgelt }
     */
    public Entgelt createEntgelt() {
        return new Entgelt();
    }

    /**
     * Create an instance of {@link AbrechnungsPosition }
     * 
     * @return
     *     the new instance of {@link AbrechnungsPosition }
     */
    public AbrechnungsPosition createAbrechnungsPosition() {
        return new AbrechnungsPosition();
    }

    /**
     * Create an instance of {@link AbrechnungsPositionen }
     * 
     * @return
     *     the new instance of {@link AbrechnungsPositionen }
     */
    public AbrechnungsPositionen createAbrechnungsPositionen() {
        return new AbrechnungsPositionen();
    }

    /**
     * Create an instance of {@link Zahlungsart }
     * 
     * @return
     *     the new instance of {@link Zahlungsart }
     */
    public Zahlungsart createZahlungsart() {
        return new Zahlungsart();
    }

    /**
     * Create an instance of {@link Zahlungsarten }
     * 
     * @return
     *     the new instance of {@link Zahlungsarten }
     */
    public Zahlungsarten createZahlungsarten() {
        return new Zahlungsarten();
    }

    /**
     * Create an instance of {@link Rechnungen.Rechnung }
     * 
     * @return
     *     the new instance of {@link Rechnungen.Rechnung }
     */
    public Rechnungen.Rechnung createRechnungenRechnung() {
        return new Rechnungen.Rechnung();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "uebung3", name = "choice-steuernummer-umsatzsteuer-id")
    public JAXBElement<Object> createChoiceSteuernummerUmsatzsteuerId(Object value) {
        return new JAXBElement<>(_ChoiceSteuernummerUmsatzsteuerId_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "uebung3", name = "steuernummer", substitutionHeadNamespace = "uebung3", substitutionHeadName = "choice-steuernummer-umsatzsteuer-id")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSteuernummer(String value) {
        return new JAXBElement<>(_Steuernummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "uebung3", name = "umsatzsteuer-identifikationsnummer", substitutionHeadNamespace = "uebung3", substitutionHeadName = "choice-steuernummer-umsatzsteuer-id")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createUmsatzsteuerIdentifikationsnummer(String value) {
        return new JAXBElement<>(_UmsatzsteuerIdentifikationsnummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechnungsbetragType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RechnungsbetragType }{@code >}
     */
    @XmlElementDecl(namespace = "uebung3", name = "choice-nettobetrag-bruttobetrag")
    public JAXBElement<RechnungsbetragType> createChoiceNettobetragBruttobetrag(RechnungsbetragType value) {
        return new JAXBElement<>(_ChoiceNettobetragBruttobetrag_QNAME, RechnungsbetragType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechnungsbetragType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RechnungsbetragType }{@code >}
     */
    @XmlElementDecl(namespace = "uebung3", name = "nettobetrag", substitutionHeadNamespace = "uebung3", substitutionHeadName = "choice-nettobetrag-bruttobetrag")
    public JAXBElement<RechnungsbetragType> createNettobetrag(RechnungsbetragType value) {
        return new JAXBElement<>(_Nettobetrag_QNAME, RechnungsbetragType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechnungsbetragType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RechnungsbetragType }{@code >}
     */
    @XmlElementDecl(namespace = "uebung3", name = "bruttobetrag", substitutionHeadNamespace = "uebung3", substitutionHeadName = "choice-nettobetrag-bruttobetrag")
    public JAXBElement<RechnungsbetragType> createBruttobetrag(RechnungsbetragType value) {
        return new JAXBElement<>(_Bruttobetrag_QNAME, RechnungsbetragType.class, null, value);
    }

}
