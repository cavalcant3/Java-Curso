package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();


        estudante1.nome = "Leticia";
        estudante1.idade= 15;
        estudante1.sexo='F';

        estudante2.nome = "Lucas";
        estudante2.idade= 18;
        estudante2.sexo='m';


        //impressão por this
        estudante1.imprime();
        estudante2.imprime();
    }

}
