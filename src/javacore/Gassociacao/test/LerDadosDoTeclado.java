package javacore.Gassociacao.test;

import java.util.Scanner;
//inserir nome idade e sexo e apresentar dados
public class LerDadosDoTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite seu nome");
        String nome = teclado.nextLine();
        System.out.println("digite seua idade");
        int idade = teclado.nextInt();
        System.out.println("digite seu sexo M ou F");
        char sexo = teclado.next().charAt(0);

        System.out.println("----------------");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(sexo);

    }
}
