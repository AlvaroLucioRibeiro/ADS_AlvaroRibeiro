package esporte;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe Pessoa que contém atributos básicos. Exercício: Herança e Construtor.
 */
public class Pessoa {

    /**
     * Nome da pessoa.
     */
    String nome;

    /**
     * Idade da pessoa.
     */
    Integer idade;

    /**
     * Construtor da classe Pessoa.
     * @param nome Nome da pessoa.
     * @param idade Idade da pessoa.
     */
    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    /**
     * Método para envelhecer a pessoa.
     */
    public void envelhecer() {
        this.idade++;
    }
}

