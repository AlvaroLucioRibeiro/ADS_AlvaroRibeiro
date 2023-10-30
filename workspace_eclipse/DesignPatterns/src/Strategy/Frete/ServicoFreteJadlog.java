package Strategy.Frete;

/**
 * Classe ServicoFreteJadlog.
 * Implementa a interface Fretavel para fornecer cálculos de frete específicos para o serviço Jadlog.
 */
public class ServicoFreteJadlog implements Fretavel {

    /**
     * Calcula o valor do frete usando as tarifas da Jadlog com base no peso fornecido.
     *
     * @param pesoEmKg  O peso do item em quilogramas.
     * @return          O custo do frete. Retorna 0.0 se o peso for menor que 30.0 kg, e 150.0 caso contrário.
     */
    @Override
    public double calcularValor(double pesoEmKg) {
        if (pesoEmKg < 30.0) {
            return 0.0;
        } else {
            return 150.0;
        }
    }
}
