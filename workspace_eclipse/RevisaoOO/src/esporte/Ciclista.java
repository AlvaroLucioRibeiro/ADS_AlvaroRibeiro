package esporte;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe Ciclista que herda de Atleta e implementa a ação de pedalar. Exercício: Herança e Construtor.
 */
public class Ciclista extends Atleta {

    /**
     * Construtor da classe Ciclista.
     * @param nome Nome do ciclista.
     * @param idade Idade do ciclista.
     * @param peso Peso do ciclista.
     * @param aposentado Estado de aposentadoria do ciclista.
     */
    public Ciclista(String nome, Integer idade, Integer peso, Boolean aposentado) {
        super(nome, idade, peso, aposentado);
    }

    /**
     * Método para o ciclista pedalar.
     */
    void pedalar() {
        System.out.println("Ciclista Pedalando");
    }
}
