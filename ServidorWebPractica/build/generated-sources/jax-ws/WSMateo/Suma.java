
package WSMateo;

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
 *         &lt;element name="numer1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="numer2" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "numer1",
    "numer2"
})
public class Suma {

    protected double numer1;
    protected double numer2;

    /**
     * Obtiene el valor de la propiedad numer1.
     * 
     */
    public double getNumer1() {
        return numer1;
    }

    /**
     * Define el valor de la propiedad numer1.
     * 
     */
    public void setNumer1(double value) {
        this.numer1 = value;
    }

    /**
     * Obtiene el valor de la propiedad numer2.
     * 
     */
    public double getNumer2() {
        return numer2;
    }

    /**
     * Define el valor de la propiedad numer2.
     * 
     */
    public void setNumer2(double value) {
        this.numer2 = value;
    }

}
