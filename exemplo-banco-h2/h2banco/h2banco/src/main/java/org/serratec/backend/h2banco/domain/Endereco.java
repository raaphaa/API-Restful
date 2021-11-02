package org.serratec.backend.h2banco.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Endereco {

    @Id
    private Long id;
    @Column
    private String endereco;
    @Column
    private String numero;
    @Column
    private String CEP;

    public Endereco() {

    }
    public Endereco(String endereco, String numero, String cEP) {
        super();
        this.endereco = endereco;
        this.numero = numero;
        CEP = cEP;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getCEP() {
        return CEP;
    }
    public void setCEP(String cEP) {
        CEP = cEP;
    }
}