package com.resuolve.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;
import com.resuolve.app.JsonConfigure.View;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    @JsonView({ View.Usuario.class })
    private Long id;

    @JsonView({ View.Usuario.class })
    @Column(name = "usuario_nome")
    private String nome;

    @JsonView({ View.Usuario.class })
    @Column(name = "usuario_email")
    private String email;
    
    @Column(name = "usuario_senha")
    private String senha;

    @JsonView({ View.Usuario.class })
    @Column(name = "usuario_telefone")
    private String telefone;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


}
