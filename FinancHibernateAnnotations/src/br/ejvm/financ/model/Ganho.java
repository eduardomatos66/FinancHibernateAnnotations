package br.ejvm.financ.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name = "tbl_ganho")
@SequenceGenerator(name = "pk_ganho_id", sequenceName = "pk_ganho_id")
public class Ganho implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "pk_ganho_id")
    @Column(name = "ganho_id")
    private Integer id;
    @Column(name = "ganho_data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @Column(name = "ganho_de_quem")
    private String deQuem;
    @Column(name = "ganho_comentario")
    private String comentario;
    @Column(name = "ganho_valor")
    private Long valor;
    @Column(name = "ganho_ok")
    private Boolean ok;
    
    public Ganho() {}

    public Ganho(Integer id, Date data, String deQuem, String comentario, Long valor, Boolean ok) {
        this.setId(id);
        this.data = data;
        this.deQuem = deQuem;
        this.comentario = comentario;
        this.valor = valor;
        this.ok = ok;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data
     *            the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the deQuem
     */
    public String getDeQuem() {
        return deQuem;
    }

    /**
     * @param deQuem
     *            the deQuem to set
     */
    public void setDeQuem(String deQuem) {
        this.deQuem = deQuem;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario
     *            the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * @return the valor
     */
    public Long getValor() {
        return valor;
    }

    /**
     * @param valor
     *            the valor to set
     */
    public void setValor(Long valor) {
        this.valor = valor;
    }

    /**
     * @return the ok
     */
    public Boolean isOk() {
        return ok;
    }

    /**
     * @param ok
     *            the ok to set
     */
    public void setOk(Boolean ok) {
        this.ok = ok;
    }
}
