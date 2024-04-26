package com.fatec.sigvs.ti_model;

public class Livro {
    String nome;
    String autor;


    public Livro(String nome, String autor){
        this.nome = nome;
        this.autor = autor;
    }
    
    public String getAutor() {
        return autor;
    }

    public String getNome() {
        return nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
