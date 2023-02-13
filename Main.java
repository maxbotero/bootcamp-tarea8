package com.maxbotero;

public class Main {
    public static void main(String[] args) {
        SmartPhone motorolaE7plus = new SmartPhone("Snapdragon 460 Octa-Core de 1.8GHz",4,32,5000,12,8,5);
        SmartWatch galaxyWatch5 = new SmartWatch("Exynos W920 Dual-Core 1,18 GHz",1.5,16,284,null,true,true,false);
        System.out.println("Moto E7plus tiene un procesador " + motorolaE7plus.procesador + ", una RAM de " + motorolaE7plus.ram + " Gigas y una poderosa bateria de " + motorolaE7plus.bateria + " mAh, cuenta con una camara principal de " + motorolaE7plus.camaraPrincipal + " megapixeles y una frontal de: " + motorolaE7plus.camaraSelfie + " megapixeles y su pantalla es de " + motorolaE7plus.pantalla + " pulgadas");
        System.out.println("Galaxy Watch 5 tiene un procedador " + galaxyWatch5.procesador + ", una ram de " + galaxyWatch5.ram + " Gigas y una bateria de " + galaxyWatch5.bateria + " mAh");
        System.out.println("Altavoz: " + galaxyWatch5.altavoz);
        System.out.println("Microfono: " + galaxyWatch5.microfono);
        System.out.println("Camara: " + galaxyWatch5.camara);
        if(galaxyWatch5.camara){
            System.out.println("Cuenta con una camara de: " + galaxyWatch5.camaraSelfie + " megapixeles");
        }
    }
}

