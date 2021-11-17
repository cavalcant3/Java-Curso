package javacore.FmodificadorStatic.test;

import javacore.FmodificadorStatic.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("bmw", 280);
        Carro c2 = new Carro("2bmw", 380);
        Carro c3 = new Carro("1bmw", 480);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
