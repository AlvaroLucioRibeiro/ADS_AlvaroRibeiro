package avancado;

import java.util.Comparator;

public class ComparadorPorId implements Comparator<Animal> {
	
	@Override
	public int compare(Animal a1, Animal a2) {
	    return Long.valueOf(a1.getId()).compareTo(Long.valueOf(a2.getId()));
	}
}
