package banco_digital;

// Classe abstrata Conta, serve como modelo para as outras contas
abstract class Conta {
    private int numero;
    protected double saldo;

    // Construtor
    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    // Métodos comuns a todas as contas
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public void transferir(double valor, Conta destino) {
        if (valor > 0 && saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para a conta " + destino.numero + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para transferência.");
        }
    }

    public void extrato() {
        System.out.println("Número da conta: " + numero);
        System.out.println("Saldo: R$" + saldo);
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
