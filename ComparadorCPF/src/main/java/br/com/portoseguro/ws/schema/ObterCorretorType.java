
package br.com.portoseguro.ws.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ObterCorretorType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ObterCorretorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroPessoa" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObterCorretorType", propOrder = {
    "numeroPessoa"
})
public class ObterCorretorType {

    protected long numeroPessoa;

    /**
     * Obtém o valor da propriedade numeroPessoa.
     * 
     */
    public long getNumeroPessoa() {
        return numeroPessoa;
    }

    /**
     * Define o valor da propriedade numeroPessoa.
     * 
     */
    public void setNumeroPessoa(long value) {
        this.numeroPessoa = value;
    }

}
