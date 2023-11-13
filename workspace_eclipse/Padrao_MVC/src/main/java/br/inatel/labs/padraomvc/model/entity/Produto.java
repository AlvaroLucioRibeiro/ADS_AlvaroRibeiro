package br.inatel.labs.padraomvc.model.entity;

import java.util.Objects;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe de entidade que representa um produto.
 * Esta classe inclui propriedades para ID, descrição e preço de um produto,
 * juntamente com métodos de acesso e modificação (getters e setters) para essas propriedades.
 */
public class Produto {
	
	private Long id;
	private String descricao;
	private Double preco;
	
	/**
	 * Construtor para criar uma nova instância de Produto.
	 *
	 * @param id O identificador único do produto.
	 * @param descricao A descrição do produto.
	 * @param preco O preço do produto.
	 */
	public Produto(Long id, String descricao, Double preco) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	/**
	 * Gera um código hash com base no ID do produto.
	 *
	 * @return O código hash do produto.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	/**
	 * Define a igualdade de dois objetos Produto.
	 * Dois produtos são considerados iguais se tiverem o mesmo ID.
	 *
	 * @param obj O objeto a ser comparado com esta instância.
	 * @return true se os produtos forem considerados iguais, false caso contrário.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}

	// Getters e Setters para id, descricao e preco

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
}
