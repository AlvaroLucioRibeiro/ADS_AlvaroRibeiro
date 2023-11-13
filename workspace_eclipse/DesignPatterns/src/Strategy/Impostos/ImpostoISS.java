package Strategy.Impostos;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe ImpostoISS.
 * Implementa a interface Tributavel para fornecer cálculos do imposto ISS.
 */
public class ImpostoISS implements Tributavel {
    
    /**
     * Alíquota do ISS.
     */
    private static final double ALIQUOTA_ISS = 0.02;

    /**
     * Calcula o valor do imposto ISS com base no valor total da nota fiscal.
     *
     * @param valorTotalNF  O valor total da nota fiscal.
     * @return              O valor do imposto ISS, calculado como valorTotalNF * ALIQUOTA_ISS.
     */
    @Override
    public double calcularImposto(double valorTotalNF) {
        return valorTotalNF * ALIQUOTA_ISS;
    }
}
