package javacore.Gassociacao.dominio;

public class Jogador {
    public void imprime(){
        System.out.println(this.nome);
    }
    private String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
