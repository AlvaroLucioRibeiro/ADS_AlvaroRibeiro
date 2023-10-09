package Builder.Carro;

/**
 * Esta classe é responsável pelo Carro. 
 */
public class Carro {

	private Porta[] portas;
	private Motor motor;
	private ComputadorBordo computadorBordo;
	private FreioABS freioABS;

    /**
     * Obtém as portas do carro.
     * 
     * @return Array de objetos Porta que representam as portas do carro.
     */
	public Porta[] getPortas() {
		return portas;
	}

    /**
     * Define as portas do carro.
     * 
     * @param portas Array de objetos Porta para definir no carro.
     */
	public void setPortas(Porta[] portas) {
		this.portas = portas;
	}

    /**
     * Obtém o motor do carro.
     * 
     * @return Objeto Motor que representa o motor do carro.
     */
	public Motor getMotor() {
		return motor;
	}

    /**
     * Define o motor do carro.
     * 
     * @param motor Objeto Motor para definir no carro.
     */
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

    /**
     * Obtém o computador de bordo do carro.
     * 
     * @return Objeto ComputadorBordo que representa o computador de bordo do carro.
     */
	public ComputadorBordo getComputadorBordo() {
		return computadorBordo;
	}

    /**
     * Define o computador de bordo do carro.
     * 
     * @param computadorBordo Objeto ComputadorBordo para definir no carro.
     */
	public void setComputadorBordo(ComputadorBordo computadorBordo) {
		this.computadorBordo = computadorBordo;
	}

    /**
     * Obtém o sistema de freio ABS do carro.
     * 
     * @return Objeto FreioABS que representa o sistema de freio ABS do carro.
     */
	public FreioABS getFreioABS() {
		return freioABS;
	}

    /**
     * Define o sistema de freio ABS do carro.
     * 
     * @param freioABS Objeto FreioABS para definir no carro.
     */
	public void setFreioABS(FreioABS freioABS) {
		this.freioABS = freioABS;
	}
}