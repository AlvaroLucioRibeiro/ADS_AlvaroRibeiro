package avancado;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe SobreList_2 que demonstra o uso de uma lista de objetos em Java. Exercício: List.
 */
public class SobreList_2 {

    /**
     * Método principal.
     * @param args Argumentos da linha de comando.
     */
	public static void main(String[] args) {
		List<Animal> listaDeAnimais = new ArrayList<>();
		
		listaDeAnimais.add(new Animal(1L, "Tartaruga"));
		listaDeAnimais.add(new Animal(2L, "Coelho"));
		listaDeAnimais.add(new Animal(3L, "Cachorro"));
		listaDeAnimais.add(new Animal(4L, "Gato"));
		listaDeAnimais.add(new Animal(5L, "Girafa"));
		listaDeAnimais.add(new Animal(6L, "Gato"));
		
		System.out.println(listaDeAnimais);
	}
}