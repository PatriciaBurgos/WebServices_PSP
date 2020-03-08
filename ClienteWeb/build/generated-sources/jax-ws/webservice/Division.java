
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para division complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="division">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="div1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="div2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "division", propOrder = {
    "div1",
    "div2"
})
public class Division {

    protected String div1;
    protected String div2;

    /**
     * Obtiene el valor de la propiedad div1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiv1() {
        return div1;
    }

    /**
     * Define el valor de la propiedad div1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiv1(String value) {
        this.div1 = value;
    }

    /**
     * Obtiene el valor de la propiedad div2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiv2() {
        return div2;
    }

    /**
     * Define el valor de la propiedad div2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiv2(String value) {
        this.div2 = value;
    }

}
