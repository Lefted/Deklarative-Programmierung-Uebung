//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.1 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.hka.xml.uebungen.jaxb;

import jakarta.xml.bind.annotation.XmlRegistry;


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
     * Create an instance of {@link Entgelt }
     * 
     * @return
     *     the new instance of {@link Entgelt }
     */
    public Entgelt createEntgelt() {
        return new Entgelt();
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
     * Create an instance of {@link BarzahlungType }
     * 
     * @return
     *     the new instance of {@link BarzahlungType }
     */
    public BarzahlungType createBarzahlungType() {
        return new BarzahlungType();
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

}
