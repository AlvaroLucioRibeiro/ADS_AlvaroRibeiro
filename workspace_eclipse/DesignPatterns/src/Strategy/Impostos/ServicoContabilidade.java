package Strategy.Impostos;

import java.util.List;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe ServicoContabilidade.
 * Responsável por cálculos relacionados à contabilidade, como totalização de impostos.
 */
public class ServicoContabilidade {

    /**
     * Calcula o valor total dos impostos para uma dada nota fiscal, usando uma lista de impostos vigentes.
     *
     * @param nf                    Nota fiscal para a qual os impostos serão calculados.
     * @param listaImpostosVigentes Lista de impostos vigentes que devem ser aplicados.
     * @return                      O valor total de todos os impostos calculados.
     */
    public double TotalizarImpostos(NotaFiscal nf, List<Tributavel> listaImpostosVigentes){
        double valorTotalNF = nf.getValorTotal();

        return listaImpostosVigentes.stream()
                                    .map(t -> t.calcularImposto(valorTotalNF))
                                    .reduce(0.0, Double::sum);
    }

    // Modo antigo de totalizar impostos
    /*
    /**
     * (Método antigo) Calcula o valor total dos impostos para uma dada nota fiscal, usando uma lista de impostos vigentes.
     *
     * @param nf                    Nota fiscal para a qual os impostos serão calculados.
     * @param listaImpostosVigentes Lista de impostos vigentes que devem ser aplicados.
     * @return                      O valor total de todos os impostos calculados.
     * /
    public double TotalizarImpostos(NotaFiscal nf, List<Tributavel> listaImpostosVigentes){
        double valorTotalNF = nf.getValorTotal();

        double impostosTotalizados = 0.0;
        for (Tributavel tributavel : listaImpostosVigentes) {
            double impostoCalaculado = tributavel.calcularImposto(valorTotalNF);
            impostosTotalizados += impostoCalaculado;
        }
        return impostosTotalizados;
    }
    */
}
