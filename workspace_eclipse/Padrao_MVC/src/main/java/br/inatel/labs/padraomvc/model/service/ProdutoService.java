package br.inatel.labs.padraomvc.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import br.inatel.labs.padraomvc.model.entity.Produto;
import jakarta.annotation.PostConstruct;

@Service
public class ProdutoService {
	
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	
	@PostConstruct
	private void setup()
	{
		Produto P1 = new Produto(1L, "Furadeira", 300.0);
		Produto P2 = new Produto(2L, "SerraCircular", 400.0);
		Produto P3 = new Produto(3L, "Lixadeira", 200.0);
		listaProdutos.add(P1);
		listaProdutos.add(P2);
		listaProdutos.add(P3);
	}
	
	public List<Produto> findAll()
	{
		return this.listaProdutos;
	}
	
}
