package avancado;

import java.util.Comparator;

/**
 * Classe ComparadorPorId que implementa a interface Comparator para comparar objetos da classe Animal pelo id. Exercício: Ordenação.
 */
public class ComparadorPorId implements Comparator<Animal> {

    /**
     * Método que compara dois objetos da classe Animal pelo id.
     * @param a1 Primeiro objeto Animal.
     * @param a2 Segundo objeto Animal.
     * @return resultado da comparação.
     */
	@Override
	public int compare(Animal a1, Animal a2) {
	    return Long.valueOf(a1.getId()).compareTo(Long.valueOf(a2.getId()));
	}
}
