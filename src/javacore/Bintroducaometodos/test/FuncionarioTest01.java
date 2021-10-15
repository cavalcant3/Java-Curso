package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalarios(new double[] {1200, 900, 500});
        funcionario.setIdade(22);
        funcionario.setNome("teste");

        funcionario.impressão();
        funcionario.getSoma();
        System.out.println("-------------------");
        System.out.println("O nome é: " + funcionario.getNome());
        System.out.println("A idade é: " +funcionario.getIdade());


    }
}
