package client;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Interface que contém as constantes usadas na configuração de conexão com o broker MQTT e na definição do tópico dos sensores.
 */
public interface MyConstants {

    /**
     * URI do broker MQTT ao qual os clientes devem se conectar.
     */
    String URI_BROKER = "tcp://localhost:1883";

    /**
     * Tópico no qual as leituras dos sensores devem ser publicadas.
     */
    String TOPIC_SENSOR = "sensor";
}
