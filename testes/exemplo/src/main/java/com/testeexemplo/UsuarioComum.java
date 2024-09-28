package com.testeexemplo;

public class UsuarioComum extends Usuario{
    public UsuarioComum(String nome, String email) {
        super(nome, email, "Usuário Comum");
    }

    @Override
    public void exibirPermissoes() {
        System.out.println("Permissões: Acesso limitado ao sistema.");
    }
}
