package javacore.Aintroducaoclasses.Teste;

import javacore.Aintroducaoclasses.Dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Bruna";
        estudante.idade= 22;
        estudante.sexo='N';
        //------------------
        estudante2.nome = "marrone";
        estudante2.idade= 99;
        estudante2.sexo='p';

        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println("--------------------");
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);


    }
}
