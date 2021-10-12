package javacore.Aintroducaoclasses.Teste;

import javacore.Aintroducaoclasses.Dominio.Professor;

import java.util.Scanner;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome do professor: ");
        professor.nomeProfessor = entrada.next();

        System.out.println("Informe o sexo do professor: ");
        //pegando primeira letra da entrada
        professor.sexoProfessor = entrada.next().charAt(0);

        System.out.println("Informe a idade do professor: ");
        professor.idadeProfessor = entrada.nextInt();

        System.out.println("Professor cadastrado!");
        System.out.println("Dados salvos:");
        System.out.println("Nome: " + professor.nomeProfessor );
        System.out.println("Idade: " + professor.idadeProfessor );
        System.out.println("Sexo: " + professor.sexoProfessor );

    }
}
