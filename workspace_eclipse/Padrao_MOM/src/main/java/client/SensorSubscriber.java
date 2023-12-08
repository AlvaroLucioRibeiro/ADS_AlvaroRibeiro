package client;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * Classe responsável por assinar e receber mensagens de leituras de sensores de um broker MQTT.
 */
public class SensorSubscriber {

    public static void main(String[] args) {
        try {
            // 1.criar o subscriber
            String subscriberId = "Subscriber_163"; // Substitua 163 pela sua matrícula real
            MqttClient subscriber = new MqttClient(MyConstants.URI_BROKER, subscriberId);

            // 2.conectar ao broker
            MqttConnectOptions opts = new MqttConnectOptions();
            opts.setAutomaticReconnect(true);
            opts.setCleanSession(true);
            opts.setConnectionTimeout(10);
            subscriber.connect(opts);

            // Definir um callback para quando mensagens forem recebidas
            subscriber.setCallback(new MqttCallback() {
                @Override
                public void connectionLost(Throwable cause) {
                    // Código para lidar com a perda de conexão
                }

                @Override
                public void messageArrived(String topic, MqttMessage message) throws Exception {
                    // 3.assinar e esperar por mensagens
                    System.out.println("Mensagem recebida: [" + new String(message.getPayload()) + "] do tópico: " + topic);
                }

                @Override
                public void deliveryComplete(IMqttDeliveryToken token) {
                    // Código para lidar com a conclusão da entrega
                }
            });

            // Assinar o tópico
            subscriber.subscribe(MyConstants.TOPIC_SENSOR);

            // O programa irá continuar rodando até que você o feche manualmente
            // Isso é necessário para que continue ouvindo por mensagens chegando
            while (true) {
                // Mantém o programa rodando
            }

        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
}
