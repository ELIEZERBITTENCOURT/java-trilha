package com.testeexemplo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class SistemaDeLoginTest {
    
    private LoginService loginService;
    private Usuario admin;
    private Usuario usuarioComum;

    // Inicializa o serviço de login e cria usuários para os testes
    @BeforeEach
    void setUp() {
        loginService = new LoginService();
        admin = new Admin("Alice", "alice@admin.com");
        usuarioComum = new UsuarioComum("Rafa", "rafa@comum.com");
    }

    // Verifica se o login do admin com token válido funciona
    @Test
    void testAutenticacaoComTokenValidoParaAdmin() {
        boolean autenticado = loginService.autenticar("tokenValido123");
        assertTrue(autenticado, "Admin deveria ser autenticado com token válido");
    }
        
    // Verifica se o login do usuário comum com token válido funciona
    @Test
    void testAutenticacaoComTokenValidoParaUsuarioComum() {
        boolean autenticado = loginService.autenticar("tokenValido123");
        assertTrue(autenticado, "Usuário Comum deveria ser autenticado com token válido");
    }

    // Verifica se o login do admin com token inválido falha
    @Test
    void testAutenticacaoComTokenInvalidoParaAdmin() {
        boolean autenticado = loginService.autenticar("tokenInvalido");
        assertFalse(autenticado, "Admin não deveria ser autenticado com token inválido");
    }

    // Verifica se o login do usuário comum com token inválido falha
    @Test
    void testAutenticacaoComTokenInvalidoParaUsuarioComum() {
        boolean autenticado = loginService.autenticar("tokenInvalido");
        assertFalse(autenticado, "Usuário Comum não deveria ser autenticado com token inválido");
    }
       
    // Verifica as permissões de um usuário admin
    @Test
    void testPermissoesAdmin() {
        assertEquals("Admin", admin.getNivelSeguranca(), "Admin deveria ter nível de segurança 'Admin'");
    }
    
    // Verifica as permissões de um usuário comum
    @Test
    void testPermissoesUsuarioComum() {
        assertEquals("Usuário Comum", usuarioComum.getNivelSeguranca(), "Usuário comum deveria ter nível de segurança 'Usuário Comum'");
    }
}
