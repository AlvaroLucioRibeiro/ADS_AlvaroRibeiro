package esporte;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe Nadador que herda de Atleta e implementa a ação de nadar. Exercício: Herança e Construtor.
 */
public class Nadador extends Atleta {

    /**
     * Construtor da classe Nadador.
     * @param nome Nome do nadador.
     * @param idade Idade do nadador.
     * @param peso Peso do nadador.
     * @param aposentado Estado de aposentadoria do nadador.
     */
    public Nadador(String nome, Integer idade, Integer peso, Boolean aposentado) {
        super(nome, idade, peso, aposentado);
    }

    /**
     * Método para o nadador nadar.
     */
    void nadar() {
        System.out.println("Nadador nadando");
    }
}
