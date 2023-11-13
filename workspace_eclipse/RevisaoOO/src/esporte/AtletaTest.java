package esporte;

import org.junit.jupiter.api.Test;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe de teste para as classes relacionadas a atletas e esportes.
 */
class AtletaTest {

    /**
     * Testa o construtor da classe Atleta.
     */
	@Test
	void testarConstrutor() 
	{
		Pessoa pessoaEdson = new Pessoa("Edson", 21);
		
		System.out.println(pessoaEdson.nome);
		System.out.println(pessoaEdson.idade);
		
		Atleta atletaEdson = new Atleta("Edson", 21, 80, false);
		
		System.out.println(atletaEdson.nome);
		System.out.println(atletaEdson.idade);
		System.out.println(atletaEdson.peso);
		System.out.println(atletaEdson.aposentado);
	}
	
	/**
     * Testa a funcionalidade da classe Nadador.
     */
	@Test
	void testarNadador() {
		Nadador nadador = new Nadador("Gustavo", 34, 90, false);
		nadador.nadar();
		
		nadador.envelhecer();
		System.out.println(nadador.idade);
		
		nadador.aposentar();
		System.out.println(nadador.aposentado);
	}

}
