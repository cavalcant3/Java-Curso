package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Estudante;
import javacore.Bintroducaometodos.dominio.Impressora;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();


        estudante1.nome = "Leticia";
        estudante1.idade= 15;
        estudante1.sexo='F';

        estudante2.nome = "Lucas";
        estudante2.idade= 18;
        estudante2.sexo='m';

//        System.out.println(estudante1.nome);
//        System.out.println(estudante1.idade);
//        System.out.println(estudante1.sexo);
//        System.out.println("----------------- ");
//        System.out.println(estudante2.nome);
//        System.out.println(estudante2.idade);
//        System.out.println(estudante2.sexo);

        //impressão por referência
        Impressora saida = new Impressora();
        saida.imprime(estudante1);
        saida.imprime(estudante2);
    }
}
