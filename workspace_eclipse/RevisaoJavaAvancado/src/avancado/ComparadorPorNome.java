package avancado;

import java.util.Comparator;

/**
* Classe ComparadorPorNome que implementa a interface Comparator para comparar objetos da classe Animal pelo nome. Exercício: Ordenação.
*/
public class ComparadorPorNome implements Comparator<Animal> {

   /**
    * Método que compara dois objetos da classe Animal pelo nome.
    * @param a1 Primeiro objeto Animal.
    * @param a2 Segundo objeto Animal.
    * @return resultado da comparação.
    */
	@Override
	public int compare(Animal a1, Animal a2) {
		return a1.getNome().compareTo(a2.getNome());
	}
}
