package com.serotonina.serotoninaback.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tarefaNota;

    public Tarefa() {
    }

    public Tarefa(Long id, String tarefaNota, Categoria categoria, Usuario usuario) {
        this.id = id;
        this.tarefaNota = tarefaNota;
        this.categoria = categoria;
        this.usuario = usuario;
    }

    /* Configuração de relacionamentos com JPA */
    // @ManyToOne(mappedBy="tarefa")
    @JoinColumn(name = "categoria_tarefa")
    public Categoria categoria;

    /* Configuração de relacionamentos com o JPA */
    // Referenciando na classe Usuario pelo campo "tarefas"
    @ManyToOne
    private Usuario usuario;

    @ManyToMany
    @JoinTable(name = "associacao_tarefa_rotina", joinColumns = @JoinColumn(name = "fk_tarefa"))
    private List<Rotina> rotina;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTarefaNota() {
        return tarefaNota;
    }

    public void setTarefaNota(String tarefaNota) {
        this.tarefaNota = tarefaNota;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Rotina> getRotina() {
        return rotina;
    }

    public void setRotina(List<Rotina> rotina) {
        this.rotina = rotina;
    }

}
