package Strategy.Frete;

/**
 * Classe responsável por calcular o custo do frete usando uma estratégia de frete fornecida.
 */
public class CalculadoraFrete {

    /**
     * Calcula o custo do frete usando a estratégia e o peso fornecidos.
     * 
     * @param fretavel  A estratégia a ser usada para calcular o frete.
     * @param pesoEmKg  O peso do item em quilogramas.
     * @return          O custo do frete.
     */
    public double calculaValor(Fretavel fretavel, double pesoEmKg){
        return fretavel.calcularValor(pesoEmKg);

    }
}
