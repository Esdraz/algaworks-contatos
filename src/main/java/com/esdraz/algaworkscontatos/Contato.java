package com.esdraz.algaworkscontatos;

import java.util.UUID;

public class Contato {

    private String id;

    private String nome;

    private String telefone;

    public Contato() {
    }

    public Contato(String nome, String telefone) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.telefone = telefone;
    }

    public Contato(String id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    //checar se o registro e novo ou esta sendo editado
    public boolean isNovo() {
        return id == null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


}
