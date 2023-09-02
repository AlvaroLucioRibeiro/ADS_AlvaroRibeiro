package avancado;

/**
 * Classe Produto que representa um produto com id, descrição e preço. Exercício: Stream.
 */
public class Produto {

    /**
     * Identificador único do produto.
     */
    private Long id;

    /**
     * Descrição do produto.
     */
    private String descricao;

    /**
     * Preço do produto.
     */
    private Double preco;

    /**
     * Construtor da classe Produto.
     * @param id Identificador único do produto.
     * @param descricao Descrição do produto.
     * @param preco Preço do produto.
     */
    public Produto(Long id, String descricao, Double preco) {
        // código do construtor
    }

    /**
     * Retorna o identificador único do produto.
     * @return id do produto.
     */
    public Long getId() {
        return id;
    }

    /**
     * Retorna a descrição do produto.
     * @return descrição do produto.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Retorna o preço do produto.
     * @return preço do produto.
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * Retorna a representação em String do Produto.
     * @return String representando o produto.
     */
    @Override
    public String toString() {
        return "Produto [id=" + id + ", descricao=" + descricao + ", preco=" + preco + "]";
    }
}
