package esporte;

/**
 * Classe Corredor que herda de Atleta e implementa a ação de correr. Exercício: Herança e Construtor.
 */
public class Corredor extends Atleta {

    /**
     * Construtor da classe Corredor.
     * @param nome Nome do corredor.
     * @param idade Idade do corredor.
     * @param peso Peso do corredor.
     * @param aposentado Estado de aposentadoria do corredor.
     */
    public Corredor(String nome, Integer idade, Integer peso, Boolean aposentado) {
        super(nome, idade, peso, aposentado);
    }

    /**
     * Método para o corredor correr.
     */
    void correr() {
        System.out.println("Corredor correndo");
    }
}
