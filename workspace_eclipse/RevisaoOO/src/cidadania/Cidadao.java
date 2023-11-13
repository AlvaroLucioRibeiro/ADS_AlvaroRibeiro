package cidadania;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe Cidadao que herda de Pessoa e adiciona o atributo CPF. Exercício: Herança.
 */
class Cidadao extends Pessoa {

    /**
     * CPF do cidadão.
     */
    String cpf;

    /**
     * Construtor da classe Cidadao.
     * @param nome Nome do cidadão.
     * @param sexo Sexo do cidadão.
     * @param idade Idade do cidadão.
     * @param cpf CPF do cidadão.
     */
    Cidadao(String nome, String sexo, Integer idade, String cpf) {
        super(nome, sexo, idade);
        this.cpf = cpf;
    }
}
