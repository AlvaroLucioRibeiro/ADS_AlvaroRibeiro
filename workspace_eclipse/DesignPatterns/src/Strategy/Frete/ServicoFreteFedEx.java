package Strategy.Frete;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe ServicoFreteFedEx.
 * Implementa a interface Fretavel para fornecer cálculos de frete específicos para o serviço FedEx.
 */
public class ServicoFreteFedEx implements Fretavel {

    /**
     * Calcula o valor do frete usando as tarifas da FedEx com base no peso fornecido.
     *
     * @param pesoEmKg  O peso do item em quilogramas.
     * @return          O custo do frete. Retorna 0.0 se o peso for menor que 20.0 kg, 
     *                  45.0 se o peso estiver entre 20.0 e 40.0 kg, e 75.0 caso contrário.
     */
    @Override
    public double calcularValor(double pesoEmKg) {
        if (pesoEmKg < 20.0) {
            return 0.0;
        } else if (pesoEmKg < 40){
            return 45.0;
        } else {
            return 75.0;
        }
    }
}
