package avancado;

import java.util.Objects;

public class Animal implements Comparable <Animal> {
	
	private long id;
	private String nome;

	public Animal(long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	@Override
	public String toString() {
	    return "id= " + this.id + ", nome= " + this.nome;
	}
	
	public long getId() {
		return id;
	}
	public String getNome() {
	return nome;
	}

	@Override
	public int compareTo(Animal that) {
		return this.nome.compareTo(that.nome);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return id == other.id && Objects.equals(nome, other.nome);
	}
	
	
}
