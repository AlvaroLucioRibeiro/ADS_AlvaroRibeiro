package banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContaTest {

	@Test
	void testaContaCorrente() {
		Conta cc = new ContaCorrente();
		cc.depositar(110.00);
		cc.sacar(10.00);
		cc.rentabilizar();
		
		Double saldoAtual = cc.saldo;
		System.out.println("Saldo atual: " + saldoAtual );
		
		Double saldoEsperado = 101.00;
		assertEquals(saldoAtual, saldoEsperado);
	}
	
	@Test
	void testContaPoupanca() {
		Conta cp = new ContaPoupanca();
		cp.depositar(1100.00);
		cp.sacar(100.00);
		cp.rentabilizar();
		
		Double saldoAtual = cp.saldo;
		System.out.println("Saldo atual: " + saldoAtual );
		
		Double saldoEsperado = 1020.00;
		assertEquals(saldoAtual, saldoEsperado);	
	}
	
	@Test
	void testPolimorfismo() {
		
		// Este flag define qual será a instância da Conta
		boolean flagContaCorrenteComoDefault = false;
		
		Conta conta = null;
		if(flagContaCorrenteComoDefault)
		{
			conta = new ContaCorrente();
		} else {
			conta = new ContaPoupanca();
		}
		
		conta.depositar(1000.00);
		
		conta.rentabilizar();
		
		System.out.println("Polimorfismo");
		System.out.println(conta.getClass().getName());
		System.out.println(conta.saldo);
		
		
	}
	
	@Test
	void testConta_toString(){
		
		Conta conta = new ContaCorrente();
		conta.depositar(100.00);
		conta.sacar(10.00);
		
		String str = conta.toString();
		
		System.out.println(str);
	}
}