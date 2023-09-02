package banco;

/**
 * Classe ContaCorrente que herda de Conta. Exercício: Polimorfimo.
 */
class ContaCorrente extends Conta {

    /**
     * Rentabiliza o saldo da conta corrente em 1%.
     */
    @Override
    public void rentabilizar() {
        saldo *= 1.01;
    }
}
