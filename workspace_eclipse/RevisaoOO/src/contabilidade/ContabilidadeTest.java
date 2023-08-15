package contabilidade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ContabilidadeTest {

	@Test
	void testEmpresaMEI() {
		Double faturamentoMensal = 1000.0;
		EmpresaMEI empresaMEI = new EmpresaMEI(faturamentoMensal);

		System.out.println("Teste EmpresaMEI:");
		System.out.println("Valor ISS: " + empresaMEI.getValorISS());
		System.out.println("Valor IR: " + empresaMEI.getValorIR());

		assertEquals(0.0, empresaMEI.getValorISS());
		assertEquals(275.0, empresaMEI.getValorIR());
	}
	
	@Test
	void testEmpresaSimples() {
		Double faturamentoMensal = 1000.0;
		EmpresaSimples empresaSimples = new EmpresaSimples(faturamentoMensal);

		System.out.println("Teste EmpresaSimples:");
		System.out.println("Valor ISS: " + empresaSimples.getValorISS());
		System.out.println("Valor IR: " + empresaSimples.getValorIR());

		assertEquals(150.0, empresaSimples.getValorISS());
		assertEquals(80.0, empresaSimples.getValorIR());
	}
}
