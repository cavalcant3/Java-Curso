package javacore.Csobrecargametodos.Dominio;

public class Anime {
    private String tipo;
    private String nome;
    private int episodios;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
    }

   public void init (String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
   }
}
