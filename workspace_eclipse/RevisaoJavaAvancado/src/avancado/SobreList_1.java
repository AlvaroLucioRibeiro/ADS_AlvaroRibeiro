package avancado;

import java.util.ArrayList;
import java.util.List;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe SobreList_1 que demonstra o uso básico de uma lista em Java. Exercício: List.
 */
public class SobreList_1 {

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
		
		System.out.println(listaDeAlimentos);
	}
}