package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();


        pessoa.setNome("Matheus");
        pessoa.setIdade(20);
        pessoa.getNome();

    }
}
