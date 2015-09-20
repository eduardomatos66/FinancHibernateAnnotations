package br.ejvm.financ.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@SuppressWarnings("serial")
@Entity(name = "tbl_tipo_gasto")
@SequenceGenerator(name = "pk_tipo_gasto_id", sequenceName = "pk_tipo_gasto_id")
public class TipoGasto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "pk_tipo_gasto_id")
    @Column(name = "tipo_gasto_id")
    private Long id;

    @Column(name = "tipo_gasto_nome")
    private String name;

    protected TipoGasto() {}

    public TipoGasto(String name) {
        super();
        this.name = name;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}