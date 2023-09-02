package contabilidade;

/**
 * Classe EmpresaSimples que implementa a interface Tributavel para empresas Simples. Exercício: Interface.
 */
public class EmpresaSimples implements Tributavel {

    /**
     * Faturamento mensal da empresa Simples.
     */
    Double faturamentoMensal;

    /**
     * Construtor da classe EmpresaSimples.
     * @param faturamentoMensal Faturamento mensal da empresa.
     */
    public EmpresaSimples(Double faturamentoMensal) {
        this.faturamentoMensal = faturamentoMensal;
    }

    /**
     * Obtém o valor do ISS para a empresa Simples.
     * @return Valor do ISS.
     */
    @Override
    public Double getValorISS() {
        return faturamentoMensal * 15.0 / 100.0;
    }

    /**
     * Obtém o valor do IR para a empresa Simples.
     * @return Valor do IR.
     */
    @Override
    public Double getValorIR() {
        return faturamentoMensal * 8.0 / 100.0;
    }
}
