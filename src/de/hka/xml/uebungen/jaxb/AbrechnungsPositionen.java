//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.1 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.hka.xml.uebungen.jaxb;

import java.util.ArrayList;
import java.util.List;
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
 *       <choice>
 *         <element ref="{uebung3}abrechnungs-position" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "abrechnungsPosition"
})
@XmlRootElement(name = "abrechnungs-positionen")
public class AbrechnungsPositionen {

    @XmlElement(name = "abrechnungs-position")
    protected List<AbrechnungsPosition> abrechnungsPosition;

    /**
     * Gets the value of the abrechnungsPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the abrechnungsPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbrechnungsPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbrechnungsPosition }
     * 
     * 
     * @return
     *     The value of the abrechnungsPosition property.
     */
    public List<AbrechnungsPosition> getAbrechnungsPosition() {
        if (abrechnungsPosition == null) {
            abrechnungsPosition = new ArrayList<>();
        }
        return this.abrechnungsPosition;
    }

}
