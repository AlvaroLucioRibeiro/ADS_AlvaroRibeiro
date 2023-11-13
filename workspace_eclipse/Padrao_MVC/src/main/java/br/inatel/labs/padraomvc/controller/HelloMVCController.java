package br.inatel.labs.padraomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Controller para gerenciar requisições relacionadas a saudações.
 * Este controlador manipula a rota "/Hello" e retorna uma vista com um cumprimento personalizado.
 */
@Controller
public class HelloMVCController {
    
    /**
     * Manipula o pedido GET para a rota "/Hello".
     * Adiciona um atributo de usuário ao modelo e retorna o nome da vista.
     * 
     * @param model O modelo Spring MVC onde os dados são adicionados para serem exibidos na vista.
     * @return Retorna o nome da vista "hello-mvc" a ser renderizada, sem a necessidade de especificar a extensão '.html'.
     */
    @GetMapping("/Hello")
    public String getHello(Model model) {
        model.addAttribute("usuario", "Álvaro");
        return "hello-mvc";
    }

}
