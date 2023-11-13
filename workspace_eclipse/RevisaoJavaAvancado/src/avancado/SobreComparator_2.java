package avancado;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe SobreComparator_2 que demonstra diferentes maneiras de usar a interface Comparator com lambda. Exercício: Ordenação.
 */
public class SobreComparator_2 {

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
		
		listaDeAnimais.sort((a1, a2) -> a1.getNome().compareTo(a2.getNome()));
		System.out.println(listaDeAnimais);
		
		listaDeAnimais.sort(Comparator.comparing(a -> a.getNome()));
		System.out.println(listaDeAnimais);
		
		listaDeAnimais.sort(Comparator.comparing(Animal::getNome));
		System.out.println(listaDeAnimais);
	}
}
