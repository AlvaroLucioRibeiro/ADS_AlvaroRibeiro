package avancado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe SobreComparable_1 que demonstra o uso da interface Comparable com Strings. Exercício: Ordenação.
 */
public class SobreComparable_1 {

    /**
     * Método principal.
     * @param args Argumentos da linha de comando.
     */
	public static void main(String[] args) {
		List<String> listaDeAlimentos = new ArrayList<String>();
		
		listaDeAlimentos.add("Damasco");
		listaDeAlimentos.add("Batata");
		listaDeAlimentos.add("Arroz");
		listaDeAlimentos.add("Cenoura");
		
		System.out.println("> Pela ordem de inserção:");
		System.out.println(listaDeAlimentos);
		
		System.out.println("> Pela ordem alfabética:");
		Collections.sort(listaDeAlimentos);
		System.out.println(listaDeAlimentos);
	}
}
