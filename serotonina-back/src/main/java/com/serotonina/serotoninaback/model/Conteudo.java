package com.serotonina.serotoninaback.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conteudo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo, conteudo, pago, gratuito;

    public Conteudo(String titulo, String categoria, String conteudo, String pago, String gratuito) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.pago = pago;
        this.gratuito = gratuito;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public String getGratuito() {
        return gratuito;
    }

    public void setGratuito(String gratuito) {
        this.gratuito = gratuito;
    }

}
