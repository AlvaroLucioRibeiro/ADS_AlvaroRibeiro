package banco;

/**
 * Classe ContaPoupanca que herda de Conta. Exercício: Polimorfimo.
 */
class ContaPoupanca extends Conta {

    /**
     * Rentabiliza o saldo da conta poupança em 2%.
     */
    @Override
    public void rentabilizar() {
        saldo *= 1.02;
    }
}
