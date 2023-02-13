package com.maxbotero;

public class SmartPhone extends SmartDevice{
    int camaraPrincipal;
    //int camaraSelfie;
    int pantalla;

    public SmartPhone(){}
    public SmartPhone(String procesador, double ram, double almacenamiento, int bateria, int camaraPrincipal, Integer camaraSelfie, int pantalla) {
        super(procesador, ram, almacenamiento, bateria, camaraSelfie);
        this.camaraPrincipal = camaraPrincipal;
        this.camaraSelfie = camaraSelfie;
        this.pantalla = pantalla;
    }
}
