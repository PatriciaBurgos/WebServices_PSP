
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para suma complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="suma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dig1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dig2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suma", propOrder = {
    "dig1",
    "dig2"
})
public class Suma {

    protected String dig1;
    protected String dig2;

    /**
     * Obtiene el valor de la propiedad dig1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDig1() {
        return dig1;
    }

    /**
     * Define el valor de la propiedad dig1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDig1(String value) {
        this.dig1 = value;
    }

    /**
     * Obtiene el valor de la propiedad dig2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDig2() {
        return dig2;
    }

    /**
     * Define el valor de la propiedad dig2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDig2(String value) {
        this.dig2 = value;
    }

}
