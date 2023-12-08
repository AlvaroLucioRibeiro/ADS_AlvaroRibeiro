package client;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import java.util.Random;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe responsável por publicar leituras de sensores para um broker MQTT.
 */
public class SensorPublisher{

    /**
     * Cria uma nova mensagem MQTT com base em um valor de sensor.
     *
     * @param value O valor da leitura do sensor.
     * @return Uma nova mensagem MQTT contendo o valor.
     */
    private static MqttMessage createMessage(double value) {
        byte[] payload = String.format("T:%04.2f", value).getBytes();
        return new MqttMessage(payload);
    }

    /**
     * Método principal que executa o publisher MQTT.
     *
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) throws Exception {
        // 1. Criar o publisher:
        String publisherId = "Publicador_163"; // Substitua 163 pela sua matrícula real
        MqttClient publisher = new MqttClient(MyConstants.URI_BROKER, publisherId);

        // 2. Conectar ao broker:
        MqttConnectOptions opts = new MqttConnectOptions();
        opts.setAutomaticReconnect(true);
        opts.setCleanSession(true);
        opts.setConnectionTimeout(10);
        publisher.connect(opts);

        // 3. Criar mensagem com leitura do sensor:
        Sensor sensor = new Sensor();
        double temperatura = sensor.readTemp();
        MqttMessage message = createMessage(temperatura);

        // 4. Publicar no tópico:
        publisher.publish(MyConstants.TOPIC_SENSOR, message);

        // 5. Desconectar:
        publisher.disconnect();
    }
}
