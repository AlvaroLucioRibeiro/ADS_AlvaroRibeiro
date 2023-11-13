package Builder.Pizzaria;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Esta classe fornece um padrão de construção para criar um objeto Pizza.
 * Oferece métodos para adicionar coberturas e definir o tamanho de uma Pizza.
 */
public class PizzaBuilder {
	
	private Pizza pizza = new Pizza();
	
	/**
	 * Adiciona queijo como cobertura na pizza.
	 * 
	 * @return esta instância de PizzaBuilder
	 */
	public PizzaBuilder addCheese() {
		pizza.setFlagCheese(true);
		return this;
	}
	
	/**
	 * Adiciona peperoni como cobertura na pizza.
	 * 
	 * @return esta instância de PizzaBuilder
	 */
	public PizzaBuilder addPeperoni() {
		pizza.setFlagPeperoni(true);
		return this;
	}
	
	/**
	 * Define o tamanho da pizza.
	 * 
	 * @param s Tamanho da pizza
	 * @return esta instância de PizzaBuilder
	 */
	public PizzaBuilder defineSize(Integer s) {
		pizza.setSize(s);
		return this;
	}
	
	
	/**
	 * Valida se a pizza tem ingrediente
	 * lança uma exceção.
	 */
	private void validadeIgredient()
	{
		if(!pizza.getFlagCheese() && !pizza.getFlagPeperoni())
		{
			throw new IllegalStateException("Não foi adicionado nenhum ingrediente");
		}
	}

	/**
	 * Valida o tamanho da pizza. Se o tamanho não estiver entre 1 e 3, 
	 * lança uma exceção.
	 */
	private void validateSize() {
	if(pizza.getSize() < 1 || pizza.getSize() > 3)
	throw new IllegalStateException("Tamanho não disponível");
	}
	
	/**
	 * Retorna o objeto Pizza construído.
	 * Antes da devolução, valida o tamanho da pizza.
	 * 
	 * @return o objeto Pizza construído
	 */
	public Pizza getPizza() {
		validateSize();
		return pizza;
	}
}
