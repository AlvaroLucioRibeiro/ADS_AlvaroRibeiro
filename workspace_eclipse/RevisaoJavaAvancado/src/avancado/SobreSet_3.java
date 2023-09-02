package avancado;

import java.util.HashSet;
import java.util.Set;

/**
 * Classe SobreSet_3 que demonstra o uso de um conjunto (Set) de objetos da classe Animal. Exercício: Set.
 */
public class SobreSet_3 {

    /**
     * Método principal.
     * @param args Argumentos da linha de comando.
     */
	public static void main(String[] args) {
		
		Set<Animal> setDeAnimais = new HashSet<>();
		
		setDeAnimais.add(new Animal(1L, "Tartaruga"));
		setDeAnimais.add(new Animal(2L, "Coelho"));
		setDeAnimais.add(new Animal(3L, "Cachorro"));
		setDeAnimais.add(new Animal(4L, "Gato"));
		setDeAnimais.add(new Animal(2L, "Coelho"));

		setDeAnimais.forEach(System.out::println);

	}
}
