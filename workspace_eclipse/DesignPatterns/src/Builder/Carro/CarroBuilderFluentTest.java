package Builder.Carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Esta classe é responsável por testar a construção de Carro usando o CarroBuilderFluentTest.
 **/
class CarroBuilderFluentTest {


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
			Carro carroPronto = new CarroBuilderFluente()
					.buildMotor(motorVTEC)
					.buildPortas(portas)
					.buildComputadorBordo(computadorBordoSiemens)
					.buildFreioABS(freioBosch)
					.getCarro();

			//validando carro
			assertNotNull(carroPronto);
			assertNotNull(carroPronto.getMotor());
			assertNotNull(carroPronto.getPortas().length == 2);
			assertNotNull(carroPronto.getComputadorBordo());
			assertNotNull(carroPronto.getFreioABS());
		}
}