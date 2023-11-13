package avancado;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe SobreCollection_2 que demonstra operações mais avançadas com coleções em Java. Exercício: Collection.
 */
public class SobreCollection_2 {

    /**
     * Método principal.
     * @param args Argumentos da linha de comando.
     */
	public static void main(String[] args) {
		
		// 1º
		Collection<String> engenhariasAtuais = new ArrayList<>();
		
		engenhariasAtuais.add("Telecomunicação");
		engenhariasAtuais.add("Biomédica");
		engenhariasAtuais.add("Computação");
		engenhariasAtuais.add("Software");
		engenhariasAtuais.add("Produção");
		
		System.out.println("Engenharias atuais: " + engenhariasAtuais);
		
		// 2º 
		Collection<String> engenhariasFuturas = new ArrayList<>();
		engenhariasFuturas.add("Mecânica");
		engenhariasFuturas.add("Mecatrônica");
		
		System.out.println("Engenharias futuras " + engenhariasFuturas);
		
		// 3º
		Collection<String> todas = new ArrayList<String>();
		todas.addAll(engenhariasAtuais);
		todas.addAll(engenhariasFuturas);
		
		System.out.println("Todas as engenharias: " + todas);
		
		// Mais sobre Collection
		System.out.println("");
		System.out.println(">> Entendendo isEmpty() e size()");
		
		// Construtor sobrecarregado que recebe outra coleção...
		Collection<String> engenharias = new ArrayList<>(todas);
		
		System.out.println("Engenharias vazias? " + engenharias.isEmpty());
		System.out.println("Quantos elemento engenharias tem? " + engenharias.size());
		
		// Clear
		System.out.println("");
		System.out.println(">> Entendendo clear(): ");
		
		imprimirStatusDaColecao(engenharias);
		
		System.out.println("... invocando clear()");
		engenharias.clear();
		
		imprimirStatusDaColecao(engenharias);
	}
	
	 /**
     * Método para imprimir o status da coleção.
     * @param engenharias Coleção de engenharias.
     */
	private static void imprimirStatusDaColecao(Collection<String> engenharias)
	{
		if(engenharias.isEmpty())
		{
			System.out.println("Vazio");
		} else {
			System.out.println("Tem elementos");
		}
		
		if(engenharias.size() == 0)
		{
			System.out.println("Vazio");
		} else {
			System.out.println("Tem elementos");
		}	
	}
}
