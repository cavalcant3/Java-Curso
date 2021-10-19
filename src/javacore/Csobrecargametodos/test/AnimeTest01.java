package javacore.Csobrecargametodos.test;

import javacore.Csobrecargametodos.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
       anime.init("Akumana Drive", "TV",12);

       //getter e setters fazem perder muito tempo com alterações
        
        anime.imprime();
    }
}
