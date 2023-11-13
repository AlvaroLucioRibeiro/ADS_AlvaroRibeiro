package Strategy.Impostos;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe ImpostoICMS.
 * Implementa a interface Tributavel para fornecer cálculos do imposto ICMS.
 */
public class ImpostoICMS implements Tributavel {
    
    /**
     * Alíquota do ICMS.
     */
    private static final double ALIQUOTA_ICMS = 0.1;

    /**
     * Calcula o valor do imposto ICMS com base no valor total da nota fiscal.
     *
     * @param valorTotalNF  O valor total da nota fiscal.
     * @return              O valor do imposto ICMS, calculado como valorTotalNF * ALIQUOTA_ICMS.
     */
    @Override
    public double calcularImposto(double valorTotalNF) {
        return valorTotalNF * ALIQUOTA_ICMS;
    }
}
