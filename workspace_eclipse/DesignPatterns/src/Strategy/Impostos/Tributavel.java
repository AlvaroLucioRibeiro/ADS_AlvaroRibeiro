package Strategy.Impostos;

/**
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
