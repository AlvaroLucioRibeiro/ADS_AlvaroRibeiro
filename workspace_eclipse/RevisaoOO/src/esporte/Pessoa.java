package esporte;

public class Pessoa extends Object {
	
	// Ctrl + 3: Digita as iniciais do código para ele gerar
	
	String nome;
	
	Integer idade;

	public Pessoa(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public void envelhecer() {
		this.idade++;
	}
}
