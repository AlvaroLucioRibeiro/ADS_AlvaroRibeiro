package esporte;

/**
 * Classe Atleta que herda de Pessoa e adiciona atributos específicos de um atleta. Exercício: Herança e Construtor.
 */
public class Atleta extends Pessoa {

    /**
     * Peso do atleta.
     */
    Integer peso;

    /**
     * Estado de aposentadoria do atleta.
     */
    Boolean aposentado;

    /**
     * Construtor da classe Atleta.
     * @param nome Nome do atleta.
     * @param idade Idade do atleta.
     * @param peso Peso do atleta.
     * @param aposentado Estado de aposentadoria do atleta.
     */
    public Atleta(String nome, Integer idade, Integer peso, Boolean aposentado) {
        super(nome, idade);
        this.peso = peso;
        this.aposentado = aposentado;
    }

    /**
     * Método para aquecer o atleta.
     */
    void aquecer() {
        System.out.println("aquecendo");
    }

    /**
     * Método para aposentar o atleta.
     */
    void aposentar() {
        this.aposentado = true;
    }
}
