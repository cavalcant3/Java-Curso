package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int num1 = 4;
        int num2 = 3;

        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println(num1);
        System.out.println(num2);
    }
}
