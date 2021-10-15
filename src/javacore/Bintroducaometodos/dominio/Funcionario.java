package javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double soma;

    //metodo de impressão dos salários em array
    public void impressão() {
        //testando erro
        if (salarios == null){
            return;
        }
            //responsável por imprimir os salários do array
           for (double salario: salarios){
               System.out.println(salario+ " ");
            }
        }
        //método de média dos salários
    public void media(){
        double soma = 0;
        //testando erro
        if (salarios == null){
            return;
        }
        for (double salario: salarios) {
            soma += salario;

        }
        //responsável por tirar a média
        soma /= salarios.length;
        System.out.println( "A media é: " + soma);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getSoma() {
        return soma;
    }




}
