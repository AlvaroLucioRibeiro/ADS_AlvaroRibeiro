package singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * Classe de teste para o LogManager.
 * Ela verifica o comportamento do padrão Singleton implementado no LogManager.
 */
class LogManagerTest {

	/**
     * Testa se, ao obter duas instâncias do LogManager, elas referenciam o mesmo objeto.
     */
	@Test
	void dada2Instancias_quandoGetInstance_entaoSeraAMesmaReferencia() {
	    LogManager instance1 = LogManager.getInstance();
	    assertNotNull( instance1 );

	    LogManager instance2 = LogManager.getInstance();
	    assertNotNull( instance2 );

	    assertEquals(instance1, instance2);
	}

}
