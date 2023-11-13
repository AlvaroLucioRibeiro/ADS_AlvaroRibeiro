package estoque;

import java.time.LocalDate;
/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe Produto que representa um produto em estoque. Exercício: Encapsulamento.
 */
public class Produto {

    /**
     * Descrição do produto.
     */
    private String descricao;

    /**
     * Valor de compra do produto.
     */
    private Double valorCompra;

    /**
     * Data de validade do produto.
     */
    private LocalDate dataValidade;

    /**
     * Obtém a descrição do produto.
     * @return Descrição do produto.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do produto.
     * @param descricao Descrição do produto.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém o valor de compra do produto.
     * @return Valor de compra do produto.
     */
    public Double getValorCompra() {
        return valorCompra;
    }

    /**
     * Define o valor de compra do produto.
     * @param valorCompra Valor de compra do produto.
     */
    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    /**
     * Obtém a data de validade do produto.
     * @return Data de validade do produto.
     */
    public LocalDate getDataValidade() {
        return dataValidade;
    }

    /**
     * Define a data de validade do produto.
     * @param dataValidade Data de validade do produto.
     */
    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
}
