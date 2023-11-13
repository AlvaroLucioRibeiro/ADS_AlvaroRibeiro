package Strategy.Impostos;

import java.util.List;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe ReceitaFederal.
 * Responsável por fornecer informações sobre os impostos vigentes.
 */
public class ReceitaFederal {

    /**
     * Busca a lista de impostos vigentes.
     *
     * @return  Uma lista de objetos que implementam a interface Tributavel,
     *          representando os impostos vigentes.
     */
    public List<Tributavel> buscarListaImpostosVigentes(){
        return List.of(new ImpostoISS(), new ImpostoICMS(), new ImpostoIVA());
    }
}
