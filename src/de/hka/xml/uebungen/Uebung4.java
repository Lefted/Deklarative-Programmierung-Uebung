package de.hka.xml.uebungen;

import java.io.File;
import java.util.List;

import de.hka.xml.uebungen.jaxb.Rechnungen;
import de.hka.xml.uebungen.jaxb.Rechnungen.Rechnung;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.JAXBIntrospector;
import jakarta.xml.bind.Unmarshaller;

public class Uebung4 {

	private static final Uebung4 INSTANCE = new Uebung4();

	public static void main(String[] args) {
		try {
			Rechnungen rechnungen = INSTANCE.readRechnungenFromXML();
			INSTANCE.getMahnungstexte(rechnungen);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	private Rechnungen readRechnungenFromXML() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance("de.hka.xml.uebungen.jaxb");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		return (Rechnungen) JAXBIntrospector.getValue(unmarshaller.unmarshal(new File("Uebung4.xml")));
	}

	private String getMahnungstexte(Rechnungen rechnungen) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < rechnungen.getRechnung().size(); i++) {
			Rechnung rechnung = rechnungen.getRechnung().get(i);
			builder.append(getMahnungstext(rechnung));
			if (i != rechnungen.getRechnung().size() - 1) {
				builder.append("\n");
			}
		}
		return builder.toString();
	}
	
	private String getMahnungstext(Rechnung rechnung) {
		StringBuilder builder = new StringBuilder();
		
		
		
		return builder.toString();
	}
}
