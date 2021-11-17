package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Jogador;
import javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("cAFU");
        Time time = new Time("brasil");
        Jogador[] jogadores = {jogador};

        jogador.setTime(time);
        time.setJogadores(jogadores);
        System.out.println("---Jogador---");
        jogador.imprime();
        System.out.println("---Time---");
        time.imprime();
    }
}
