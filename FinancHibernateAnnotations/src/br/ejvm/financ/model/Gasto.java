package br.ejvm.financ.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author EduardoMatos
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="tbl_gasto")
@SequenceGenerator(name="pk_gasto_id", sequenceName="pk_gasto_id")
public class Gasto implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="pk_gasto_id")
	@Column(name="gasto_id")    
    private Long id;
	@Column(name="gasto_data")
	@Temporal(TemporalType.TIMESTAMP)
    private Date data;
	@ManyToOne
    private TipoGasto type;
    @Column(name="gasto_recebedor")
    private String receiver;
    @Column(name="gasto_origem")
    private String with;
    @Column(name="gasto_realizado")
    private boolean ok;
    @Column(name="gasto_valor")
    private Float value;
    @Column(name="gasto_emprestado")
    private Float valueEmprest;
    @Lob
    @Column(name="gasto_comprovante", nullable=true, columnDefinition="mediumblob")
    private byte[] comprovante;
    
    /**
     * Default Constructor.
     */
    public Gasto() {}
    
    /**
     * @param date
     * @param with
     * @param type
     * @param value
     * @param ok
     * @param receiver
     */
    public Gasto(Date date, TipoGasto type, String receiver,  String with, boolean ok, Float value, Float valueEmprest, byte[] comprovante) {
        super();
        this.setData(date);
        this.setWith(with);
        this.setType(type);
        this.setValue(value);
        this.setOk(ok);
        this.setReceiver(receiver);
        this.setValueEmprest(valueEmprest);
        this.setComprovante(comprovante);
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the date
     */
    public Date getData() {
        return data;
    }
    
    /**
     * @param date the date to set
     */
    public void setData(Date date) {
        this.data = date;
    }
    
    /**
     * @return the with
     */
    public String getWith() {
        return with;
    }
    
    /**
     * @param with the with to set
     */
    public void setWith(String with) {
        this.with = with;
    }
    
    /**
     * @return the type
     */
    public TipoGasto getType() {
        return type;
    }
    
    /**
     * @param type the type to set
     */
    public void setType(TipoGasto type) {
        this.type = type;
    }
    
    /**
     * @return the value
     */
    public Float getValue() {
        return value;
    }
    
    /**
     * @param value the value to set
     */
    public void setValue(Float value) {
        if (value == null) { 
            value = 0.0f;
        }
        this.value = value;
    }
    
    /**
     * @return the ok
     */
    public boolean isOk() {
        return ok;
    }
    
    /**
     * @param ok the ok to set
     */
    public void setOk(boolean ok) {
        this.ok = ok;
    }
    
    /**
     * @return the receiver
     */
    public String getReceiver() {
        return receiver;
    }
    
    /**
     * @param receiver the receiver to set
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /**
     * @return the valueEmprest
     */
    public Float getValueEmprest() {
        return valueEmprest;
    }

    /**
     * @param valueEmprest the valueEmprest to set
     */
    public void setValueEmprest(Float valeuEmprest) {
        if (valeuEmprest == null) { 
            valeuEmprest = 0.0f;
        }
        this.valueEmprest = valeuEmprest;
    }
    
        
    /**
	 * @return the comprovante
	 */
	public byte[] getComprovante() {
		return comprovante;
	}

	/**
	 * @param comprovante the comprovante to set
	 */
	public void setComprovante(byte[] comprovante) {
		this.comprovante = comprovante;
	}

	@Override
    public String toString() {
        String result = "";
        result += "\n====================================================================\nID: " + this.id;
        result += " \nDate: " + this.data.toString();
        result += "; Type: " + this.type.toString();
        result += " \nReceiver: " + this.receiver;
        result += " \nWith: " + this.with;
        result += " \nOK: " + String.valueOf(this.ok);
        result += " \nValue: " + this.value.toString();
        result += " \nEmprest: " + this.valueEmprest.toString();
        return result;
    }    
}