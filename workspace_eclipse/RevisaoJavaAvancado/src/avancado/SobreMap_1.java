package avancado;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe SobreMap_1 que demonstra o uso básico de um mapa (Map) em Java. Exercício: Map.
 */
public class SobreMap_1 {

    /**
     * Método principal.
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        Animal a1 = new Animal(1L, "Tartaruga");
        Animal a2 = new Animal(2L, "Coelho");
        Animal a3 = new Animal(3L, "Cachorro");
        Animal a4 = new Animal(4L, "Gato");
        Animal a5 = new Animal(5L, "Girafa");

        Map<String, Animal> mapaDeAnimais = new HashMap<>();
        mapaDeAnimais.put("TAR", a1);
        mapaDeAnimais.put("COE", a2);
        mapaDeAnimais.put("CAO", a3);
        mapaDeAnimais.put("GAT", a4);
        mapaDeAnimais.put("GIT", a5);

        System.out.println(mapaDeAnimais);

        Set<String> setDasChaves = mapaDeAnimais.keySet();
        System.out.println(setDasChaves);

        Collection<Animal> colecaoDeValores = mapaDeAnimais.values();
        System.out.println(colecaoDeValores);

        Set<Entry<String, Animal>> entrySet = mapaDeAnimais.entrySet();
        for (Entry<String, Animal> entry : entrySet) {
            System.out.println("Chave: " + entry.getKey());
            System.out.println("Valor: " + entry.getValue());
        }
    }
}
