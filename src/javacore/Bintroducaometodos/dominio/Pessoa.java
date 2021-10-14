package javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
        if (idade > 0) {
            System.out.println("Idade invalida");
        }

        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}




