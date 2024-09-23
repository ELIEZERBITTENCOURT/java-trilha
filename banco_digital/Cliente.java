package banco_digital;

import java.util.ArrayList;
import java.util.List;

// Classe Cliente que possui uma lista de contas
class Cliente {
    private String nome;
    private String cpf;
    private List<Conta> contas;

    // Construtor
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<>();
    }

    // Método para adicionar uma conta ao cliente
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    // Exibir informações do cliente e suas contas
    public void exibirInformacoes() {
        System.out.println("Cliente: " + nome + " | CPF: " + cpf);
        for (Conta conta : contas) {
            conta.extrato();
            System.out.println(); 
        }
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Conta> getContas() {
        return contas;
    }
}
