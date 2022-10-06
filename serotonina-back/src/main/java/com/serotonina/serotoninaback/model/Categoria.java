package com.serotonina.serotoninaback.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public Long id;
    String urgente, naoUrgente, meta;

    /* Configuração de relacionamentos com o JPA */
    // Referenciando na classe Tarefa pelo campo "tarefas"

    @ManyToOne
    private Tarefa tarefa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrgente() {
        return urgente;
    }

    public void setUrgente(String urgente) {
        this.urgente = urgente;
    }

    public String getNaoUrgente() {
        return naoUrgente;
    }

    public void setNaoUrgente(String naoUrgente) {
        this.naoUrgente = naoUrgente;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public Conteudo getConteudo() {
        return conteudo;
    }

    public void setConteudo(Conteudo conteudo) {
        this.conteudo = conteudo;
    }

    @OneToOne(mappedBy = "categoria_tarefa")
    public Conteudo conteudo;

}