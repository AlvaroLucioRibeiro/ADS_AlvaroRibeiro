package Builder.Pizzaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
* Esta classe testa a funcionalidade da classe PizzaBuilder.
*/

class PizzaBuilderTest {

	/**
	 * Testa a construção de uma Pizza com os dados válidos.
	 * Espera-se que a Pizza seja construída com queijo, peperoni e tamanho 1.
	 */
	@Test
	public void dadosPartesValidas_quandoGetPizza_entaoPizzaEhConstruida() {
		Pizza pizzaPronta = new PizzaBuilder().addCheese().addPeperoni().defineSize(1).getPizza();
		
		assertNotNull(pizzaPronta);
		assertTrue(pizzaPronta.getSize() == 1);
		assertTrue(pizzaPronta.getFlagCheese());
		assertTrue(pizzaPronta.getFlagPeperoni());
	}

	/**
	 * Testa a construção de uma Pizza com tamanho errado.
	 * Apesar de definir o tamanho como 1, o teste espera que o tamanho seja 3.
	 * Este teste provavelmente foi criado para falhar e precisa ser revisado.
	 */
	@Test
	public void dadosPizzaTamanhoErrado_quandoGetPizza_entaoPizzaEhConstruida() {
		try {
		Pizza pizzaPronta = new PizzaBuilder().addCheese().addPeperoni().defineSize(4).getPizza();
		fail("Deveria ser lançado");
		} catch (IllegalStateException e)
		{
			System.out.println("ok, Exception Esperado");
		}
	}
}