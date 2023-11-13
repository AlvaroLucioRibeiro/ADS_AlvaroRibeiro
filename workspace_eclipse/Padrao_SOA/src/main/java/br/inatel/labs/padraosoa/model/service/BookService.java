package br.inatel.labs.padraosoa.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import br.inatel.labs.padraosoa.model.entity.Book;
import jakarta.annotation.PostConstruct;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Serviço para gerenciamento de livros.
 * Esta classe é responsável por realizar operações de negócio relacionadas a livros.
 */
@Service
public class BookService {
    
    private List<Book> bookList = new ArrayList<Book>();
    
    /**
     * Inicializa a lista de livros com alguns livros padrão.
     * Este método é chamado após a construção do bean de serviço.
     */
    @PostConstruct
    private void setup() {
        Book b1 = new Book(1L, "Delphin Blanco", "Contos");
        Book b2 = new Book(2L, "Python com Matemática", "Programação");
        Book b3 = new Book(3L, "Cozinha Mineira", "Gastronomia");

        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
    }
    
    /**
     * Encontra todos os livros disponíveis.
     * 
     * @return Uma lista de {@link Book}.
     */
    public List<Book> findAll(){
        return this.bookList; 
    }
    
    /**
     * Encontra um livro pelo seu ID.
     * 
     * @param id O ID do livro a ser encontrado.
     * @return Um {@link Optional} contendo o livro, se encontrado, ou vazio se não for encontrado.
     */
    public Optional<Book> findByID(Long id) {
        return this.bookList.stream().filter(b -> b.getId().equals(id)).findFirst();
    }
    
    /**
     * Cria um novo livro com um ID gerado aleatoriamente e adiciona à lista de livros.
     * 
     * @param book O {@link Book} a ser criado.
     * @return O {@link Book} criado com o ID atribuído.
     */
    public Book create(Book book) {
        long generatedId = new Random().nextLong();
        book.setId(generatedId);
        this.bookList.add(book);
        return book;
    }
}
