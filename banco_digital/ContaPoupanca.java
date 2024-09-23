package banco_digital;

// Conta poupança com possível comportamento específico
// Conta poupança com rendimento
class ContaPoupanca extends Conta {
    private static final double RENDIMENTO = 0.05;

    public ContaPoupanca(int numero) {
        super(numero);
    }

    public void aplicarRendimento() {
        double rendimento = saldo * RENDIMENTO;
        saldo += rendimento;
        System.out.println("Rendimento aplicado: R$" + rendimento);
    }
}