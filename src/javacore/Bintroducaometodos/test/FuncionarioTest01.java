package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.salarios = new double[] {1200, 900, 500};
        funcionario.idade = 22;
        funcionario.nome = "teste";

        funcionario.impressão();
        funcionario.media();
        System.out.println("-------------------");
        System.out.println("O nome é: " + funcionario.nome);
        System.out.println("A idade é: " +funcionario.idade);


    }
}
