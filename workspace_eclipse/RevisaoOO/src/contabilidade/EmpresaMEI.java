package contabilidade;

public class EmpresaMEI implements Tributavel {
	Double faturamentoMensal;
	
	public EmpresaMEI(Double faturamentoMensal) {
		super();
		this.faturamentoMensal = faturamentoMensal;
	}

	@Override
	public Double getValorISS() {
		return 0.0; 
	}

	@Override
	public Double getValorIR() {
		return faturamentoMensal * 27.5 / 100.0; 
	}
}
