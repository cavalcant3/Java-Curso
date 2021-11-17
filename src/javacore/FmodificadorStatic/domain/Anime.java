package javacore.FmodificadorStatic.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
   static {
       //bloco de inicialização é executado quando a jvm carregar a classe
        // 1 - Alocado espaco em memória pro objeto
        // 2 - Cada atributo de classe é criado e inicializado com valores default ou o quer for passado
        // 3 - Bloco de inicialização é executado
        // 4 - Construtor é executado
        System.out.print("dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;

        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        System.out.println(episodios);

        for (int episodios: Anime.episodios) {
            System.out.print(episodios + " ");

        }

    }


}
