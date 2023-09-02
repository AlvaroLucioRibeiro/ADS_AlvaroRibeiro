package contabilidade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Classe de teste para as classes que implementam a interface Tributavel.
 */

class ContabilidadeTest {

    /**
     * Testa a funcionalidade da classe EmpresaMEI.
     */
	@Test
	void testEmpresaMEI() {
		Double faturamentoMensal = 100.0;
		EmpresaMEI empresaMEI = new EmpresaMEI(faturamentoMensal);

		System.out.println("EmpresaMEI:");
		System.out.println("Valor ISS: " + empresaMEI.getValorISS());
		System.out.println("Valor IR: " + empresaMEI.getValorIR());

		assertEquals(0.0, empresaMEI.getValorISS());
		assertEquals(27.5, empresaMEI.getValorIR());
	}
	
	 /**
     * Testa a funcionalidade da classe EmpresaSimples.
     */
	@Test
	void testEmpresaSimples() {
		Double faturamentoMensal = 100.0;
		EmpresaSimples empresaSimples = new EmpresaSimples(faturamentoMensal);

		System.out.println("EmpresaSimples:");
		System.out.println("Valor ISS: " + empresaSimples.getValorISS());
		System.out.println("Valor IR: " + empresaSimples.getValorIR());

		assertEquals(15.0, empresaSimples.getValorISS());
		assertEquals(8.0, empresaSimples.getValorIR());
	}
}
