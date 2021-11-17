package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("pelé");
        Jogador jogador2 = new Jogador("pelé2");
        Jogador jogador3 = new Jogador("pelé3");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
    //    jogador1.imprime();
  //      jogador2.imprime();
     //   jogador3.imprime();
        for (Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
