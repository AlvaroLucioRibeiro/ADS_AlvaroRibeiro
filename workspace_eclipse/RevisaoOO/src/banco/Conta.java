package banco;

/**
 * Classe abstrata Conta. Exercício: Polimorfismo
 */
public abstract class Conta {

    /**
     * Saldo da conta.
     */
    Double saldo = 0.0;

    /**
     * @return String representando o saldo da conta.
     */
    @Override
    public String toString() {
        return "Conta [saldo= " + saldo + "]";
    }

    /**
     * Deposita um valor na conta.
     * @param valor Valor a ser depositado.
     */
    public void depositar(double valor) {
        saldo += valor;
    }

    /**
     * Saca um valor da conta.
     * @param Valor a ser sacado.
     */
    public void sacar(double valor) {
        saldo -= valor;
    }

    /**
     * Método abstrato para rentabilizar a conta.
     */
    public abstract void rentabilizar();
}
