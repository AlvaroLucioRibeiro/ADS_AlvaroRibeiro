package br.inatel.labs.padraosoa.model.entity;

import java.util.Objects;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe de entidade que representa um livro.
 */
public class Book {

    private Long id;
    private String title;
    private String category;
    
    /**
     * Construtor para criar uma instância de um livro.
     * 
     * @param id O identificador único do livro.
     * @param title O título do livro.
     * @param category A categoria do livro.
     */
    public Book(Long id, String title, String category) {
        super();
        this.id = id;
        this.title = title;
        this.category = category;
    }

    /**
     * Obtém o ID do livro.
     * 
     * @return O ID do livro.
     */
    public Long getId() {
        return id;
    }

    /**
     * Define o ID do livro.
     * 
     * @param id O ID a ser atribuído ao livro.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtém o título do livro.
     * 
     * @return O título do livro.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define o título do livro.
     * 
     * @param title O título a ser atribuído ao livro.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Obtém a categoria do livro.
     * 
     * @return A categoria do livro.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Define a categoria do livro.
     * 
     * @param category A categoria a ser atribuída ao livro.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Gera o código hash baseado no ID do livro.
     * 
     * @return O código hash do livro.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     * Compara este livro a outro objeto para determinar a igualdade.
     * Dois livros são considerados iguais se eles têm o mesmo ID.
     * 
     * @param obj O objeto com o qual comparar este livro.
     * @return true se este livro é igual ao objeto argumentado; false caso contrário.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        return Objects.equals(id, other.id);
    }
    
}
