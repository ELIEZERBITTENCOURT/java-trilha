package banco_digital;

// Classe Banco Conta, testando as contas
public class Banco {
    public static void main(String[] args) {
        // Criando clientes
        Cliente joao = new Cliente("João Silva", "123.456.789-00");
        Cliente maria = new Cliente("Maria Souza", "987.654.321-00");

        // Criando contas para os clientes
        ContaCorrente ccJoao = new ContaCorrente(12345);
        ContaPoupanca cpMaria = new ContaPoupanca(54321);

        // Associando as contas aos clientes
        joao.adicionarConta(ccJoao);
        maria.adicionarConta(cpMaria);

        // Operações
        ccJoao.depositar(500);
        cpMaria.depositar(300);

        ccJoao.sacar(100);
        cpMaria.aplicarRendimento();

        // Exibir informações dos clientes e contas
        joao.exibirInformacoes();
        maria.exibirInformacoes();

        // Transferência entre contas (João transfere para Maria)
        ccJoao.transferir(200, cpMaria);

        // Exibir novamente as informações após a transferência
        joao.exibirInformacoes();
        maria.exibirInformacoes();
    }
}