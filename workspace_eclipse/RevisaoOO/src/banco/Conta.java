package banco;

public abstract class Conta {
    Double saldo = 0.0;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public abstract void rentabilizar();
}