package client;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe que simula um publisher MQTT para o projeto Smart Campus.
 */
public class SmartCampusPublisher {

    public static void main(String[] args) throws Exception {
        // 1. publisher
        MqttClient publisher = MqttBuilder.buildClient();

        // 2. sensor
        Sensor sensor = new Sensor();

        // 3. postes
        final String TOPIC_POSTE1_TENSAO = "smartcampus/poste/1/tensao";
        final String TOPIC_POSTE2_TENSAO = "smartcampus/poste/2/tensao";
        final String TOPIC_POSTE3_TENSAO = "smartcampus/poste/3/tensao";
        final String TOPIC_POSTE1_CORRENTE = "smartcampus/poste/1/corrente";
        final String TOPIC_POSTE2_CORRENTE = "smartcampus/poste/2/corrente";
        final String TOPIC_POSTE3_CORRENTE = "smartcampus/poste/3/corrente";

        // 4. loop de publicações
        for (int i = 0; i < 1000; i++) {
            double valorTensao = sensor.readVoltage();
            MqttMessage msgTensao = MqttBuilder.buildMessage("Tensao", valorTensao);
            publisher.publish(TOPIC_POSTE1_TENSAO, msgTensao);
            publisher.publish(TOPIC_POSTE2_TENSAO, msgTensao);
            publisher.publish(TOPIC_POSTE3_TENSAO, msgTensao);
            Thread.sleep(1000);

            double valorCorrente = sensor.readCurrent();
            MqttMessage msgCorrente = MqttBuilder.buildMessage("Corrente", valorCorrente);
            publisher.publish(TOPIC_POSTE1_CORRENTE, msgCorrente);
            publisher.publish(TOPIC_POSTE2_CORRENTE, msgCorrente);
            publisher.publish(TOPIC_POSTE3_CORRENTE, msgCorrente);
            Thread.sleep(1000);
        }

        publisher.disconnect();
    }
}
