package com.maxbotero;

public class SmartDevice {
    String procesador;
    double ram;
    double almacenamiento;
    int bateria;
    Integer camaraSelfie;

    public SmartDevice(){}

    public SmartDevice(String procesador, double ram, double almacenamiento, int bateria, Integer camaraSelfie) {
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.bateria = bateria;
        this.camaraSelfie = camaraSelfie;
    }
}
