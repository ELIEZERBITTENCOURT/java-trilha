package banco_digital;

// Conta corrente com possível comportamento específico
// Conta corrente com taxa de saque
class ContaCorrente extends Conta {
    private static final double TAXA_SAQUE = 1.00;

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + TAXA_SAQUE;
        if (valorComTaxa > 0 && saldo >= valorComTaxa) {
            saldo -= valorComTaxa;
            System.out.println("Saque de R$" + valor + " realizado com taxa de R$" + TAXA_SAQUE);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }
}