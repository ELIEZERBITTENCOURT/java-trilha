package com.testeexemplo;

public class SistemaDeLogin {
    public static void main( String[] args )
    {
        // Criar Ususários
        Usuario admin = new Admin("Alice", "alice@admin.com");
        Usuario usuarioComum = new UsuarioComum("Rafa", "rafa@comum.com");

        LoginService loginService = new LoginService();


        System.out.println( "Tentativa de login do Admin:");
        loginService.realizarLogin(admin, "tokenvalido123");

        System.out.println("\nTentativa de login do Ususário Comum:");
        loginService.realizarLogin(usuarioComum, "tokenInvalido");
    }
}
