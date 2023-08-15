package contabilidade;

public class EmpresaSimples implements Tributavel {
	Double faturamentoMensal;
	
	public EmpresaSimples(Double faturamentoMensal)
	{
		super();
		this.faturamentoMensal = faturamentoMensal;
	}
	
	@Override
	public Double getValorISS() {
		return faturamentoMensal * 15.0 / 100.0; 
	}

	@Override
	public Double getValorIR() {
		return faturamentoMensal * 8.0 / 100.0;
	}
}
