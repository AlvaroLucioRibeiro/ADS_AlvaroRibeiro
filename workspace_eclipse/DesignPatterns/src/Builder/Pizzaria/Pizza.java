package Builder.Pizzaria;

/**
 * Esta classe representa um objeto Pizza.
 * Contém atributos relacionados ao tamanho e coberturas da pizza.
 */
public class Pizza {
	
	private Integer size = 0;
	private Boolean flagCheese = false;
	private Boolean flagPeperoni = false;
	
	/**
	 * Retorna o tamanho da pizza.
	 * 
	 * @return o tamanho da pizza
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * Retorna se a pizza tem queijo como cobertura.
	 * 
	 * @return true se tem queijo, false caso contrário
	 */
	public Boolean getFlagCheese() {
		return flagCheese;
	}

	/**
	 * Define se a pizza terá queijo como cobertura.
	 * 
	 * @param flagCheese true para adicionar queijo, false para não adicionar
	 */
	public void setFlagCheese(Boolean flagCheese) {
		this.flagCheese = flagCheese;
	}

	/**
	 * Retorna se a pizza tem peperoni como cobertura.
	 * 
	 * @return true se tem peperoni, false caso contrário
	 */
	public Boolean getFlagPeperoni() {
		return flagPeperoni;
	}

	/**
	 * Define se a pizza terá peperoni como cobertura.
	 * 
	 * @param flagPeperoni true para adicionar peperoni, false para não adicionar
	 */
	public void setFlagPeperoni(Boolean flagPeperoni) {
		this.flagPeperoni = flagPeperoni;
	}

	/**
	 * Define o tamanho da pizza.
	 * 
	 * @param size o tamanho a ser definido para a pizza
	 */
	public void setSize(Integer size) {
		this.size = size;
	}
}