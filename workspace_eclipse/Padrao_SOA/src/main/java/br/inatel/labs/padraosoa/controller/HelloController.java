package br.inatel.labs.padraosoa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST que fornece uma saudação.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    /**
     * Processa as requisições GET para o caminho /hello.
     * 
     * @return Um objeto {@link MyMessage} contendo a mensagem de saudação.
     */
    @GetMapping
    public MyMessage processarGetHello() {
        MyMessage msg = new MyMessage("Olá, mundo SOA");
        return msg;
    }
}
