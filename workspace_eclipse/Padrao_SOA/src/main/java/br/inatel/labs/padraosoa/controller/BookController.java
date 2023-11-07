package br.inatel.labs.padraosoa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.inatel.labs.padraosoa.model.entity.Book;
import br.inatel.labs.padraosoa.model.service.BookService;

/**
 * Controlador REST para gerenciar livros.
 * Este controlador fornece endpoints para operações CRUD básicas em um recurso de livro.
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService service;

    /**
     * Obtém uma lista de todos os livros.
     * 
     * @return Uma lista de {@link Book}.
     */
    @GetMapping
    public List<Book> getAllBooks() {
        List<Book> books = this.service.findAll();
        return books;
    }
    
    /**
     * Obtém um livro pelo seu ID.
     * 
     * @param bookId O ID do livro a ser recuperado.
     * @return O {@link Book} recuperado.
     * @throws ResponseStatusException Se o livro não for encontrado, lança exceção com status HTTP 404.
     */
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") Long bookId) {
        Optional<Book> opBook = this.service.findByID(bookId);
        
        if(opBook.isPresent()) {
            return opBook.get();
        }
        
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
    
    /**
     * Cria um novo livro.
     * 
     * @param book O {@link Book} a ser criado.
     * @return O {@link Book} criado com seu novo ID.
     */
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Book postBook(@RequestBody Book book) {
        book = this.service.create(book);
        return book;
    }
}
