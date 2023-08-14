package banco;

class ContaCorrente extends Conta {
    @Override
    public void rentabilizar() {
        saldo *= 1.01; 
    }
}