package javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grandde software de previsão do futuro");
        System.out.println("Digite sua pergunta e responderei sim ou não");
        String pergunta = input.nextLine();
      if(pergunta.charAt(0) == ' '){
          System.out.println("Sim");
      } else {
          System.out.println("não");
      }
    }
}