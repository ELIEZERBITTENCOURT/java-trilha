package com.testeexemplo;

public abstract class Usuario {
    private String nome;
    private String email;
    private String nivelSeguranca;

    public Usuario(String nome, String email, String nivelSeguranca) {
        this.nome = nome;
        this.email = email;
        this.nivelSeguranca = nivelSeguranca;
    }

    // Métodos de encapsulamento
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getNivelSeguranca() {
        return nivelSeguranca;
    }

    // Método abstrato para exibir permissões, polimorfismo
    public abstract void exibirPermissoes();
}
