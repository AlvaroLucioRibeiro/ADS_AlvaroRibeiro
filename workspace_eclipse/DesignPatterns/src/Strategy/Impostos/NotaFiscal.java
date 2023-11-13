package Strategy.Impostos;

import java.time.LocalDate;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe NotaFiscal.
 * Representa uma nota fiscal com suas principais informações.
 */
public class NotaFiscal {

    /**
     * Número da nota fiscal.
     */
    private Long numero;

    /**
     * Data de emissão da nota fiscal.
     */
    private LocalDate dataEmissao;

    /**
     * Valor total da nota fiscal.
     */
    private Double valorTotal;

    /**
     * Construtor da classe.
     * 
     * @param numero       Número da nota fiscal.
     * @param dataEmissao  Data de emissão da nota fiscal.
     * @param valorTotal   Valor total da nota fiscal.
     */
    public NotaFiscal(Long numero, LocalDate dataEmissao, Double valorTotal) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.valorTotal = valorTotal;
    }

    /**
     * Retorna o número da nota fiscal.
     * 
     * @return  O número da nota fiscal.
     */
    public Long getNumero() {
        return numero;
    }

    /**
     * Retorna a data de emissão da nota fiscal.
     * 
     * @return  A data de emissão da nota fiscal.
     */
    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Retorna o valor total da nota fiscal.
     * 
     * @return  O valor total da nota fiscal.
     */
    public Double getValorTotal() {
        return valorTotal;
    }
}
