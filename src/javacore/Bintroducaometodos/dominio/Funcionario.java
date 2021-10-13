package javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    //metodo de impressão dos salários em array
    public void impressão() {
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
        if (salarios == null){
            return;
        }
        for (double salario: salarios) {
            soma += salario;

        }
        //tirando a média
        soma /= salarios.length;
        System.out.println( "A media é: " + soma);
    }

}
