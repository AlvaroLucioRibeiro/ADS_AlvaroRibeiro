package br.inatel.labs.padraomvc.model.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import br.inatel.labs.padraomvc.model.entity.Produto;
import jakarta.annotation.PostConstruct;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Serviço para gerenciamento de produtos.
 * Este serviço oferece funcionalidades para manipular e acessar a lista de produtos.
 */
@Service
public class ProdutoService {
	
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	
	/**
	 * Método inicializador para preencher a lista de produtos com produtos padrão.
	 * Este método é executado automaticamente após a construção da instância do serviço.
	 */
	@PostConstruct
	private void setup() {
		Produto P1 = new Produto(1L, "Furadeira", 300.0);
		Produto P2 = new Produto(2L, "SerraCircular", 400.0);
		Produto P3 = new Produto(3L, "Lixadeira", 200.0);
		listaProdutos.add(P1);
		listaProdutos.add(P2);
		listaProdutos.add(P3);
	}
	
	/**
	 * Recupera a lista completa de produtos.
	 * 
	 * @return Uma lista de produtos.
	 */
	public List<Produto> findAll() {
		return this.listaProdutos;
	}
	
}
