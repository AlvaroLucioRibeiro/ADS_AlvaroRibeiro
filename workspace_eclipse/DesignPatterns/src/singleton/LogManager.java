package singleton;

/**
 * Representa um gerenciador de logs utilizando o padrão de projeto Singleton.
 */
public class LogManager {
	
	private static LogManager instance;

	// Construtor privado para evitar a criação de instâncias externamente.
	private LogManager() {}
	
	/**
	 * Retorna a única instância do LogManager. Se ainda não existe, cria uma nova.
	 * 
	 * @return A única instância do LogManager.
	 */
	public static LogManager getInstance() {
		if(instance == null)
			instance = new LogManager();
		return instance;
	}
	
	/**
	 * Registra uma mensagem de informação no log.
	 * 
	 * @param msg Mensagem a ser registrada.
	 */
	public void info(String msg) {
		System.out.println("info: " + msg);
	}
	
	/**
	 * Registra uma mensagem de erro no log.
	 * 
	 * @param msg Mensagem a ser registrada.
	 */
	public void error(String msg) {
		System.out.println("error: " + msg);
	}
	
	/**
	 * Registra uma mensagem de aviso no log.
	 * 
	 * @param msg Mensagem a ser registrada.
	 */
	public void warn(String msg) {
		System.out.println("warn: " + msg);
	}
}
