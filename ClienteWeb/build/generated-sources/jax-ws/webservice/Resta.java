
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="res1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="res2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resta", propOrder = {
    "res1",
    "res2"
})
public class Resta {

    protected String res1;
    protected String res2;

    /**
     * Obtiene el valor de la propiedad res1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRes1() {
        return res1;
    }

    /**
     * Define el valor de la propiedad res1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRes1(String value) {
        this.res1 = value;
    }

    /**
     * Obtiene el valor de la propiedad res2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRes2() {
        return res2;
    }

    /**
     * Define el valor de la propiedad res2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRes2(String value) {
        this.res2 = value;
    }

}
