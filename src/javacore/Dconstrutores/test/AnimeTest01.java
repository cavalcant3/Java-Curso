package javacore.Dconstrutores.test;


import javacore.Dconstrutores.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Ação", "Production IG");
        anime.imprime();
    }
}
