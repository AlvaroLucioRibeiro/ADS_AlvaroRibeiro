package contabilidade;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Interface Tributavel que define os métodos para cálculo de impostos. Exercício: Interface.
 */
public interface Tributavel {

    /**
     * Obtém o valor do Imposto de Renda (IR).
     * @return Valor do IR.
     */
    Double getValorIR();

    /**
     * Obtém o valor do Imposto Sobre Serviços (ISS).
     * @return Valor do ISS.
     */
    Double getValorISS();
}
