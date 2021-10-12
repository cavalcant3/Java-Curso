package javacore.Aintroducaoclasses.Teste;

import javacore.Aintroducaoclasses.Dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
//        atribuindo valores a variavel por referência
        estudante.nome = "MAtheus";
        estudante.idade = 20;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
