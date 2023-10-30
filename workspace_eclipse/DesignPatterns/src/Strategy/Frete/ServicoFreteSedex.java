package Strategy.Frete;

/**
 * Classe ServicoFreteSedex.
 * Implementa a interface Fretavel para fornecer cálculos de frete específicos para o serviço Sedex.
 */
public class ServicoFreteSedex implements Fretavel {

    /**
     * Calcula o valor do frete usando as tarifas do Sedex com base no peso fornecido.
     *
     * @param pesoEmKg  O peso do item em quilogramas.
     * @return          O custo do frete. Retorna 50.0 se o peso for menor que 10.0 kg, 
     *                  70.0 se o peso estiver entre 10.0 e 20.0 kg, e 90.0 caso contrário.
     */
    @Override
    public double calcularValor(double pesoEmKg) {
        if (pesoEmKg < 10.0) {
            return 50.0;
        } else if (pesoEmKg < 20.00) {
            return 70.00;
        } else {
            return 90.00;
        }
    }
}
