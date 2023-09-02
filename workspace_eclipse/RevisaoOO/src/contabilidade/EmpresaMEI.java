package contabilidade;

/**
 * Classe EmpresaMEI que implementa a interface Tributavel para empresas MEI. Exercício: Interface.
 */
public class EmpresaMEI implements Tributavel {

    /**
     * Faturamento mensal da empresa MEI.
     */
    Double faturamentoMensal;

    /**
     * Construtor da classe EmpresaMEI.
     * @param faturamentoMensal Faturamento mensal da empresa.
     */
    public EmpresaMEI(Double faturamentoMensal) {
        this.faturamentoMensal = faturamentoMensal;
    }

    /**
     * Obtém o valor do ISS para a empresa MEI.
     * @return Valor do ISS.
     */
    @Override
    public Double getValorISS() {
        return 0.0;
    }

    /**
     * Obtém o valor do IR para a empresa MEI.
     * @return Valor do IR.
     */
    @Override
    public Double getValorIR() {
        return faturamentoMensal * 27.5 / 100.0;
    }
}

