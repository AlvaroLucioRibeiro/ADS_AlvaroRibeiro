package Strategy.Frete;

/**
 * Interface Fretavel.
 * Define um contrato para classes que implementam cálculos de frete.
 */
public interface Fretavel {

    /**
     * Calcula o valor do frete com base no peso fornecido.
     * 
     * @param pesoEmKg  O peso do item em quilogramas.
     * @return          O custo do frete.
     */
    public double calcularValor(double pesoEmKg);
}