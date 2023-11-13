package avancado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe SobreComparator_1 que demonstra o uso da interface Comparator para ordenar objetos da classe Animal. Exercício: Ordenação.
 */
public class SobreComparator_1 {

    /**
     * Método principal.
     * @param args Argumentos da linha de comando.
     */
	public static void main(String[] args) {
		
		List<Animal> listaDeAnimais = new ArrayList<>();
	
		listaDeAnimais.add(new Animal(4L, "Gato"));
		listaDeAnimais.add(new Animal(3L, "Cachorro"));
		listaDeAnimais.add(new Animal(2L, "Coelho"));
		listaDeAnimais.add(new Animal(6L, "Gato"));
		listaDeAnimais.add(new Animal(1L, "Tartaruga"));
		listaDeAnimais.add(new Animal(5L, "Girafa"));
		
		System.out.println("> Pela ordem de nome:");
		Collections.sort(listaDeAnimais, new ComparadorPorNome());
		System.out.println(listaDeAnimais);
		
		System.out.println("> Pela ordem do ID:");
		Collections.sort(listaDeAnimais, new ComparadorPorId());
		System.out.println(listaDeAnimais);
	
	}
}
