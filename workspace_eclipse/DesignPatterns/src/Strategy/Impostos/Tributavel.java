package Strategy.Impostos;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Interface Tributavel.
 * Define um contrato para cálculo de impostos.
 */
public interface Tributavel {

    /**
     * Calcula o valor do imposto com base no valor total da nota fiscal.
     *
     * @param valorTotalNF  O valor total da nota fiscal.
     * @return              O valor do imposto calculado.
     */
    public double calcularImposto(double valorTotalNF);
}
