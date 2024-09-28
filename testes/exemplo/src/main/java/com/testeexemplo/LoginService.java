package com.testeexemplo;

public class LoginService implements Autenticacao {
    @Override
    public boolean autenticar(String tokenOpenID) {
        // Aqui, estamos simulando a autenticação via OpenID.
        // Em um cenário real, você usaria uma biblioteca para autenticação com OpenID Connect.
        return tokenOpenID.equals("tokenValido123"); // Token de exemplo
    }

    public void realizarLogin(Usuario usuario, String tokenOpenID) {
        if (autenticar(tokenOpenID)) {
            System.out.println("Usuário autenticado com sucesso!");
            System.out.println("Bem-vindo, " + usuario.getNome() + "!");
            System.out.println("Email: " + usuario.getEmail());
            System.out.println("Nível de Segurança: " + usuario.getNivelSeguranca());
            usuario.exibirPermissoes();
        } else {
            System.out.println("Falha na autenticação via OpenID.");
        }
    }
}
