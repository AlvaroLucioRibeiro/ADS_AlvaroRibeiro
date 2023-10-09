package Builder.Carro;

/**
 * Esta classe é responsável por construir um objeto Carro. 
 */
public class CarroBuilder {
	
	private Carro carro = new Carro();

    /**
     * Define as portas do carro.
     * 
     * @param portas Array de objetos Porta para definir no carro.
     */
	public void buildPortas(Porta [] portas) {
		carro.setPortas(portas);
	}

    /**
     * Define o motor do carro.
     * 
     * @param m Objeto Motor para definir no carro.
     */
	public void buildMotor(Motor m) {
		carro.setMotor(m);
	}

    /**
     * Define o computador de bordo do carro.
     * 
     * @param cb Objeto ComputadorBordo para definir no carro.
     */
	public void buildComputadorBordo(ComputadorBordo cb) {
		carro.setComputadorBordo(cb);
	}

    /**
     * Define o sistema de freio ABS do carro.
     * 
     * @param f Objeto FreioABS para definir no carro.
     */
	public void buildFreioABS(FreioABS f) {
		carro.setFreioABS(f);
	}

    /**
     * Valida o número de portas definido para o carro. 
     * O carro pode ter apenas 2 ou 4 portas.
     * 
     * @throws IllegalStateException Se o número de portas for diferente de 2 ou 4.
     */
	public void validarPortas() {
		int nmrPortas = carro.getPortas().length;
		if (nmrPortas != 2 && nmrPortas != 4) {
			throw new IllegalStateException("Número de portas inválido");
		}
	}

    /**
     * Valida se o carro possui um motor definido.
     * 
     * @throws IllegalStateException Se o carro não tiver um motor definido.
     */
	public void validarMotor() {
		if(carro.getMotor() == null)
			throw new IllegalStateException("Não tem motor");
	}

    /**
     * Retorna o objeto Carro construído.
     * Antes de retornar, realiza as validações de portas e motor.
     * 
     * @return Objeto Carro construído.
     */
	public Carro getCarro() {
		validarPortas();
		validarMotor();
		return carro; 
	}
}