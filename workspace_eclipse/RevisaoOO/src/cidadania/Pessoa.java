package cidadania;

/**
 * Classe Pessoa que contém atributos básicos. Exercício: Herança. 
 */
class Pessoa {

    /**
     * Nome da pessoa.
     */
    String nome;

    /**
     * Sexo da pessoa.
     */
    String sexo;

    /**
     * Idade da pessoa.
     */
    Integer idade;

    /**
     * Construtor da classe Pessoa.
     * @param nome Nome da pessoa.
     * @param sexo Sexo da pessoa.
     * @param idade Idade da pessoa.
     */
    Pessoa(String nome, String sexo, Integer idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
}
