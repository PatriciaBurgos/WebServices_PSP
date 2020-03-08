
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para multiplicacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="multiplicacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mul1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mul2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiplicacion", propOrder = {
    "mul1",
    "mul2"
})
public class Multiplicacion {

    protected String mul1;
    protected String mul2;

    /**
     * Obtiene el valor de la propiedad mul1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMul1() {
        return mul1;
    }

    /**
     * Define el valor de la propiedad mul1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMul1(String value) {
        this.mul1 = value;
    }

    /**
     * Obtiene el valor de la propiedad mul2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMul2() {
        return mul2;
    }

    /**
     * Define el valor de la propiedad mul2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMul2(String value) {
        this.mul2 = value;
    }

}
