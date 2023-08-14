package banco;

class ContaPoupanca extends Conta {
    @Override
    public void rentabilizar() {
        saldo *= 1.02; 
    }
}