package client;

import java.util.Random;

/**
 * Nome: Álvaro Lúcio Almeida Ribeiro
 * Matrícula: 163
 * Curso: Engenharia de Software
 * A classe Sensor simula a leitura de diferentes tipos de dados de sensores.
 */
public class Sensor {

    /**
     * Lê um valor aleatório de temperatura.
     * @return Um valor double que representa a temperatura, variando entre -40 e 80 graus Celsius.
     */
    public double readTemp() {
        double value = new Random().doubles(-40, 80)
                         .findAny()
                         .getAsDouble();
        return value;
    }

    /**
     * Lê um valor aleatório de voltagem.
     * @return Um valor double que representa a voltagem, variando entre 0 e 380 volts.
     */
    public double readVoltage() {
        return new Random().doubles(0, 380)
                           .findAny()
                           .getAsDouble();
    }

    /**
     * Lê um valor aleatório de corrente.
     * @return Um valor double que representa a corrente, variando entre 0 e 60 amperes.
     */
    public double readCurrent() {
        return new Random().doubles(0, 60)
                           .findAny()
                           .getAsDouble();
    }

}