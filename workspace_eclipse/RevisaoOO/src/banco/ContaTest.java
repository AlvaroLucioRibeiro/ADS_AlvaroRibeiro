package banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe de teste para as classes Conta, ContaCorrente e ContaPoupanca. Exercício: Polimorfismo.
 */
class ContaTest {

    /**
     * Testa a funcionalidade da Conta Corrente.
     */
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
	
	 /**
     * Testa a funcionalidade da Conta Poupança.
     */
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
	
	 /**
     * Testa o polimorfismo entre ContaCorrente e ContaPoupanca.
     */
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
	
	/**
     * Testa o método toString da classe Conta.
     */
	@Test
	void testConta_toString(){
		
		Conta conta = new ContaCorrente();
		conta.depositar(100.00);
		conta.sacar(10.00);
		
		String str = conta.toString();
		
		System.out.println(str);
	}
}