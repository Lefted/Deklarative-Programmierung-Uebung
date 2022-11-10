package de.hka.xml.uebungen;

import java.io.File;
import java.net.URISyntaxException;
import java.util.List;

import de.hka.xml.uebungen.jaxb.LeistungsEmpfaenger;
import de.hka.xml.uebungen.jaxb.Rechnungen;
import de.hka.xml.uebungen.jaxb.Rechnungen.Rechnung;
import de.hka.xml.uebungen.jaxb.RechnungsbetragType;
import de.hka.xml.uebungen.jaxb.Telefon;
import de.hka.xml.uebungen.jaxb.Unternehmer;
import de.hka.xml.uebungen.jaxb.Zahlungsart;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.JAXBIntrospector;
import jakarta.xml.bind.Unmarshaller;

public class Uebung4 {

	private static final Uebung4 INSTANCE = new Uebung4();

	public static void main(String[] args) {
		try {
			Rechnungen rechnungen = INSTANCE.readRechnungenFromXML();
			String mahnungstext = INSTANCE.getMahnungstexte(rechnungen);
			System.out.println(mahnungstext);
		} catch (JAXBException | URISyntaxException e) {
			e.printStackTrace();
		}
	}

	private Rechnungen readRechnungenFromXML() throws JAXBException, URISyntaxException {
		JAXBContext context = JAXBContext.newInstance("de.hka.xml.uebungen.jaxb");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		return (Rechnungen) JAXBIntrospector
				.getValue(unmarshaller.unmarshal(new File(getClass().getResource("Uebung4.xml").toURI())));
	}

	private String getMahnungstexte(Rechnungen rechnungen) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < rechnungen.getRechnung().size(); i++) {
			Rechnung rechnung = rechnungen.getRechnung().get(i);
			builder.append(getMahnungstext(rechnung));
			if (i != rechnungen.getRechnung().size() - 1) {
				builder.append("\n\n");
			}
		}
		return builder.toString();
	}

	private String getMahnungstext(Rechnung rechnung) {
		StringBuilder builder = new StringBuilder();

		LeistungsEmpfaenger leistungsEmpfaenger = rechnung.getLeistungsEmpfaenger();
		Unternehmer unternehmer = rechnung.getUnternehmer();
		RechnungsbetragType bruttobetrag = rechnung.getEntgelt().getBruttobetrag();

		builder.append(leistungsEmpfaenger.getAnrede()) //
				.append(" ") //
				.append(leistungsEmpfaenger.getNachname()) //
				.append(",\nBitte zahlen Sie endlich den geforderten Betrag\nvon ") //
				.append(bruttobetrag.getBetrag()) //
				.append(" ") //
				.append(bruttobetrag.getWaehrung()) //
				.append(" auf das Konto\n") //
				.append(getZahlungsartText(rechnung.getZahlungsarten().getZahlungsart())) //
				.append(" ein.\n");
		Telefon telefon = unternehmer.getAnschrift().getTelefon();
		if (telefon != null) {
			builder.append(
					"Falls Sie trotzdem noch unverschämt genug sind\nund Fragen haben, dann können Sie mich jederzeit\nunter ") //
					.append(telefon.getVorwahl()) //
					.append("/") //
					.append(telefon.getNummer()) //
					.append(" erreichen.\n");
		}

		return builder.append("Hochachtungsvoll\n") //
				.append(unternehmer.getAnschrift().getFirmenName()) //
				.toString();
	}

	private String getZahlungsartText(List<Zahlungsart> zahlungsarten) {
		// zuerst versuchen eine zahlungsart mit kontonummer zu nutzen
		for (Zahlungsart zahlungsart : zahlungsarten) {
			String kontonummer = zahlungsart.getKontonummer();
			if (kontonummer != null && !kontonummer.isBlank()) {
				return getZahlungsartMitKontonummerText(zahlungsart);
			}
		}

		// wenn keine existiert eine mit iban nehmen
		for (Zahlungsart zahlungsart : zahlungsarten) {
			String iban = zahlungsart.getIban();
			if (iban != null && !iban.isBlank()) {
				return getZahlungsartMitIbanText(zahlungsart);
			}
		}
		throw new IllegalArgumentException("Keine geeignete Zahlungsart gefunden");
	}

	private String getZahlungsartMitKontonummerText(Zahlungsart zahlungsart) {
		String bank = zahlungsart.getBank();
		String blz = zahlungsart.getBlz();
		String kontonummer = zahlungsart.getKontonummer();

		StringBuilder builder = new StringBuilder();
		if (bank != null && !bank.isBlank()) {
			builder.append(bank) //
					.append(", ");
		}
		if (blz != null && !blz.isBlank()) {
			builder.append(blz) //
					.append(", ");
		}
		return builder.append(kontonummer) //
				.toString();
	}

	private String getZahlungsartMitIbanText(Zahlungsart zahlungsart) {
		String bank = zahlungsart.getBank();
		String blz = zahlungsart.getBlz();
		String iban = zahlungsart.getIban();

		StringBuilder builder = new StringBuilder();
		if (bank != null && !bank.isBlank()) {
			builder.append(bank) //
					.append(", ");
		}
		if (blz != null && !blz.isBlank()) {
			builder.append(blz) //
					.append(", ");
		}
		return builder.append(iban) //
				.toString();
	}
}
