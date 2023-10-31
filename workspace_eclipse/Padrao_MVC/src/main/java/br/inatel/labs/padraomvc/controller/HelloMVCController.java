package br.inatel.labs.padraomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloMVCController {
	
	@GetMapping("/Hello")
	public String getHello(Model model) {
		model.addAttribute("usuario", "Álvaro");
		return "hello-mvc"; // Não precisa de '.html'
	}

}
