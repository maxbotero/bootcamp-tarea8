package com.maxbotero;

public class SmartWatch extends SmartDevice {
    boolean altavoz;
    boolean microfono;
    boolean camara;

    public SmartWatch(){}
    public SmartWatch(String procesador, double ram, double almacenamiento, int bateria, Integer camaraSelfie, boolean altavoz, boolean microfono, boolean camara) {
        super(procesador, ram, almacenamiento, bateria, camaraSelfie);
        this.altavoz = altavoz;
        this.microfono = microfono;
        this.camara = camara;
    }
}
