package javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void SomaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void SubtraiDoisNumeros() {

        System.out.println(15-10);
    }
    public void MultiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public double divideDoisNumeros (double num1, double num2){

        if (num2 != 0){
            return num1/num2;
        }
        System.out.println("Não existe divisão por zero");
        return 0;
    }

}
