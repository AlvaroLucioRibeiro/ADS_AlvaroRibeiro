package avancado;

import java.util.*;

/**
 * Classe SobreCollection_1 que demonstra o uso básico de uma coleção em Java. Exercício: Collection.
 */
public class SobreCollection_1 {

    /**
     * Método principal.
     * @param args Argumentos da linha de comando.
     */
	public static void main(String[] args) {
		
		Collection<String> colecao = buildCollectionImplementation();
		colecao.add("Gato");
		colecao.add("Cachorro");
		colecao.add("Leão");
		colecao.add("Pantera");
		colecao.add("Avestruz");
		
		System.out.println(colecao);
	}
	
	 /**
     * Método para construir uma implementação de Collection.
     * @return Uma nova instância de TreeSet.
     */
	private static Collection<String> buildCollectionImplementation() {
		return new TreeSet<String>();
	}

}
