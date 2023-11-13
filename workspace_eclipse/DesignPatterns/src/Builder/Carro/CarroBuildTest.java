package Builder.Carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Esta classe é responsável por testar a construção de Carro usando o CarroBuilder.
 **/

class CarroBuildTest {

	 /**
     * Este caso de teste valida a construção de um objeto Carro quando fornecido com partes válidas.
     * Utiliza o CarroBuilder para definir as partes e, em seguida, verifica se o Carro foi construído corretamente.
     */
	@Test
	public void dadoPartesValidas_quandoGetCarro_entaoCarroEhConstruido() {
		//partes validas
		Motor motorVTEC = new Motor();
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = {portaMotorista, portaPassageiro};
		ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
		FreioABS freioBosch = new FreioABS();

		//invocando CarroBuilder
		CarroBuilder builder = new CarroBuilder();
		builder.buildMotor(motorVTEC);
		builder.buildPortas(portas);
		builder.buildComputadorBordo(computadorBordoSiemens);
		builder.buildFreioABS(freioBosch);
		Carro carroPronto = builder.getCarro();

		//validando carro
		assertNotNull(carroPronto);
		assertNotNull(carroPronto.getMotor());
		assertNotNull(carroPronto.getPortas().length == 2);
		assertNotNull(carroPronto.getComputadorBordo());
		assertNotNull(carroPronto.getFreioABS());

	}
	
	/**
     * Este caso de teste valida o comportamento do CarroBuilder quando um Carro é construído sem um motor.
     * Espera-se que uma exceção seja lançada indicando a falta do motor.
     */
	@Test
	public void CarroSemMotor_quandoGetCarro_entaoLancaException() {
	    Motor motorVTEC = new Motor();
	    Porta portaMotorista = new Porta();
	    Porta portaPassageiro = new Porta();
	    Porta[] portas = {portaMotorista, portaPassageiro};
	    ComputadorBordo computadorBordoSiemens = new ComputadorBordo();
	    FreioABS freioBosch = new FreioABS();

	    // Invocando CarroBuilder
	    CarroBuilder builder = new CarroBuilder();
	    builder.buildPortas(portas);
	    builder.buildComputadorBordo(computadorBordoSiemens);
	    builder.buildFreioABS(freioBosch);

	    try {
	        Carro carroPronto = builder.getCarro();
	        fail("Deveria ser lançado Exception!");
	    } catch (IllegalStateException e) {
	       System.out.println("Lançou exception como Esperado");
	    }
	}
}