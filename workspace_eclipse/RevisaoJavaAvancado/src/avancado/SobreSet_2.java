package avancado;

import java.util.Set;
import java.util.TreeSet;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe SobreSet_2 que demonstra o uso de um conjunto ordenado (TreeSet) em Java. Exercício: Set.
 */
public class SobreSet_2 {

    /**
     * Método principal.
     * @param args Argumentos da linha de comando.
     */
	public static void main(String[] args) {
		Set<String> setDeFrutas = new TreeSet<>();
		
		setDeFrutas.add("Laranja");
		setDeFrutas.add("Pera");
		setDeFrutas.add("Manga");
		setDeFrutas.add("Limão");
		
		System.out.println(setDeFrutas);
	}
}
