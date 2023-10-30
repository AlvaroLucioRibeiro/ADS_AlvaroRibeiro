package Strategy.Frete;

/**
 * Classe ServicoFreteDHL.
 * Implementa a interface Fretavel para fornecer cálculos de frete específicos para o serviço DHL.
 */
public class ServicoFreteDHL implements Fretavel {

    /**
     * Calcula o valor do frete usando as tarifas da DHL com base no peso fornecido.
     *
     * @param pesoEmKg  O peso do item em quilogramas.
     * @return          O custo do frete. Retorna 100.0 se o peso for menor que 20.0 kg, e 190.0 caso contrário.
     */
    @Override
    public double calcularValor(double pesoEmKg) {
        if (pesoEmKg < 20.0) {
            return 100.0;
        } else {
            return 190.0;
        }
    }
}
