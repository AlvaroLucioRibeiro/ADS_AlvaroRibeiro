package avancado;

import java.util.HashSet;
import java.util.Set;

/**
 * Classe SobreSet_1 que demonstra o uso básico de um conjunto (Set) em Java. Exercício: Set.
 */
public class SobreSet_1 {

    /**
     * Método principal.
     * @param args Argumentos da linha de comando.
     */
	public static void main(String[] args) {
		Set<String> setDeFrutas = new HashSet<>();
		
		setDeFrutas.add("Laranja");
		setDeFrutas.add("Pera");
		setDeFrutas.add("Manga");
		setDeFrutas.add("Limão");
		
		System.out.println(setDeFrutas);
	}
}
