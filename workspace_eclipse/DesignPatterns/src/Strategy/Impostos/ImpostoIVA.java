package Strategy.Impostos;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe ImpostoIVA.
 * Implementa a interface Tributavel para fornecer cálculos do imposto IVA.
 */
public class ImpostoIVA implements Tributavel {
    
    /**
     * Alíquota do IVA.
     */
    private static final double ALIQUOTA_IVA = 0.05;

    /**
     * Calcula o valor do imposto IVA com base no valor total da nota fiscal.
     *
     * @param valorTotalNF  O valor total da nota fiscal.
     * @return              O valor do imposto IVA, calculado como valorTotalNF * ALIQUOTA_IVA.
     */
    @Override
    public double calcularImposto(double valorTotalNF) {
        return valorTotalNF * ALIQUOTA_IVA;
    }
}
