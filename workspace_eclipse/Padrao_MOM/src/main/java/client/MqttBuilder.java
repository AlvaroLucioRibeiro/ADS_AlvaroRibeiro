package client;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe que fornece métodos para construir um cliente MQTT e construir mensagens MQTT.
 */
public class MqttBuilder {

    /**
     * Constrói e retorna um cliente MQTT conectado.
     *
     * @return MqttClient um cliente MQTT conectado.
     * @throws Exception se houver um erro durante a conexão.
     */
    public static MqttClient buildClient() throws Exception {
        String clientId = "client_163"; // Substitua 163 pela sua matrícula real
        MqttClient connectedClient = new MqttClient(MyConstants.URI_BROKER, clientId);
        MqttConnectOptions opts = new MqttConnectOptions();
        opts.setAutomaticReconnect(true);
        opts.setCleanSession(true);
        opts.setConnectionTimeout(10);
        connectedClient.connect(opts);
        return connectedClient;
    }

    /**
     * Constrói uma mensagem MQTT com base em uma chave e um valor.
     *
     * @param key A chave da mensagem.
     * @param value O valor da leitura do sensor.
     * @return MqttMessage uma mensagem MQTT pronta para ser publicada.
     */
    public static MqttMessage buildMessage(String key, double value) {
        String valueStr = String.format("%04.2f", value);
        byte[] payload = String.format("%s:%s", key, valueStr).getBytes();
        return new MqttMessage(payload);
    }
}
