package javacore.Aintroducaoclasses.Teste;

import javacore.Aintroducaoclasses.Dominio.Carro;

import java.util.Scanner;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        Scanner entrada = new Scanner(System.in);
// RESOLUÇÃO DO PROFESSOR:
        carro.nome = "Mustang";
        carro.modelo= "gt 500";
        carro.ano=2001;

        carro2.nome = "Celta";
        carro2.modelo= "gt 900";
        carro2.ano=1999;

        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);
        System.out.println("\nCarro 02: ");
        System.out.println(carro2.nome);
        System.out.println(carro2.ano);
        System.out.println(carro2.modelo);

// feito por mim (complicando propositalmente):

//        System.out.println("Quantos carros vão ser cadastrados?");
//        int i = entrada.nextInt();
//
//        for (int j = 0; j < i; j++) {
//            System.out.println("Cadastre seu carro! ");
//            System.out.println("-----------------------");
//            System.out.println("Informe o nome: ");
//
//            carro.nome = entrada.next();
//            System.out.println("Informe o modelo: ");
//            carro.modelo = entrada.next();
//            System.out.println("Informe o ano: ");
//            carro.ano = entrada.nextInt();
//
//            for (int k = 0; k <= j ; k++) {
//                System.out.println("Dados cadastrados:");
//                System.out.println("NOme: " + carro.nome);
//                System.out.println("Ano: " + carro.ano);
//                System.out.println("Modelo: " + carro.modelo);
//
//            }
//        }
        // ------------------------------------------------------



    }
}
