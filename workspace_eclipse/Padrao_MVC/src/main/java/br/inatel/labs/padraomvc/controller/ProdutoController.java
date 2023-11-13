package br.inatel.labs.padraomvc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import br.inatel.labs.padraomvc.model.entity.Produto;
import br.inatel.labs.padraomvc.model.service.ProdutoService;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Controlador para gerenciar as requisições relacionadas a produtos.
 * Esta classe é responsável por manipular a rota "/produtos" e exibir uma lista de produtos.
 */
@Controller
public class ProdutoController {

    @Autowired
    private ProdutoService service;
    
    /**
     * Manipula a requisição GET para a rota "/produtos".
     * Este método recupera uma lista de produtos do serviço, adiciona-os ao modelo e retorna o nome da vista.
     *
     * @param model O modelo do Spring MVC onde os dados são adicionados para serem exibidos na vista.
     * @return Retorna o nome da vista "tabela-de-produtos" a ser renderizada.
     */
    @GetMapping("/produtos")
    public String getProdutos(Model model) {
        List<Produto> listaProdutos = service.findAll();
        model.addAttribute("ListaProdutos", listaProdutos);
        return "tabela-de-produtos";
    }
    
}
