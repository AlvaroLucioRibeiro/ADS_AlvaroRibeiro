package avancado;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Classe SobreStreams que demonstra o uso básico de Streams em Java. Exercício: Stream.
 */
public class SobreStreams {

    /**
     * Método principal.
     * @param args Argumentos da linha de comando.
     */
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto(1L, "Cadeira", 100.00));
		produtos.add(new Produto(2L, "Cama", 400.00));
		produtos.add(new Produto(3L, "Mesa", 200.00));
		produtos.add(new Produto(4L, "Sofá", 500.00));
		produtos.add(new Produto(5L, "Cadeira", 150.00));
		
		// 1 Filter()
		List<Produto> produtosFiltrados = produtos.stream().filter(p -> p.getPreco() > 300.0).collect(Collectors.toList());
		
		produtosFiltrados.forEach(System.out::println);
		
		// 2 Map()
		List<String> descricao = produtos.stream().map(p -> p.getDescricao()).collect(Collectors.toList());
		
		descricao.forEach(System.out::println);
		
		// 3 Map() e reduce()
		Double precoTotal = produtos.stream().map(p -> p.getPreco()).reduce(0.0, Double::sum);
		
		System.out.println(precoTotal);
		
		// Exercício: Desafio
		Double totalParaBaixoDe300 = produtos.stream().filter(p -> p.getPreco() < 300.0).map(p -> p.getPreco()).reduce(0.0, Double::sum);
		
		System.out.println(totalParaBaixoDe300);
		
	}
}
