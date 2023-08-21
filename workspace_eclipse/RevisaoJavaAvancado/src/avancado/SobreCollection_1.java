package avancado;

import java.util.*;

public class SobreCollection_1 {
	
	public static void main(String[] args) {
		
		Collection<String> colecao = buildCollectionImplementation();
		colecao.add("Gato");
		colecao.add("Cachorro");
		colecao.add("Leão");
		colecao.add("Pantera");
		colecao.add("Avestruz");
		
		System.out.println(colecao);
	}
	
	private static Collection<String> buildCollectionImplementation() {
		return new TreeSet<String>();
	}

}
