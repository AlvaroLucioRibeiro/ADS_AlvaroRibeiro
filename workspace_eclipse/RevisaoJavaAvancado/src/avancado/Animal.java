package avancado;

import java.util.Objects;
/**
 * Classe Animal que implementa a interface Comparable. Exercício: Array.
 */
public class Animal implements Comparable<Animal> {

    /**
     * ID do animal.
     */
    private long id;

    /**
     * Nome do animal.
     */
    private String nome;

    /**
     * Construtor da classe Animal.
     * @param id ID do animal.
     * @param nome Nome do animal.
     */
    public Animal(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    /**
     * Retorna uma representação em String do Animal.
     * @return String representando o ID e o nome do animal.
     */
    @Override
    public String toString() {
        return "id= " + this.id + ", nome= " + this.nome;
    }

    /**
     * Obtém o ID do animal.
     * @return ID do animal.
     */
    public long getId() {
        return id;
    }

    /**
     * Obtém o nome do animal.
     * @return Nome do animal.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Compara este animal com outro animal com base no nome.
     * @param that O outro animal.
     * @return Resultado da comparação.
     */
    @Override
    public int compareTo(Animal that) {
        return this.nome.compareTo(that.nome);
    }

    /**
     * Gera o hash code para esta instância de Animal.
     * @return O hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    /**
     * Compara este animal com outro objeto para verificar a igualdade.
     * @param obj O outro objeto.
     * @return Verdadeiro se os objetos são iguais, falso caso contrário.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        return id == other.id && Objects.equals(nome, other.nome);
    }
}

