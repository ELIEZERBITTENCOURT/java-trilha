package com.testeexemplo;

public class Admin extends Usuario {
    public Admin(String nome, String email) {
        super(nome, email, "Admin");
    }

    @Override
    public void exibirPermissoes() {
        System.out.println("Permissões: Acesso total ao sistema.");
    }
}
