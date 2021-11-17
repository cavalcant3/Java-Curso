package javacore.Gassociacao.dominio;

public class SeminarioExercicio {
    private String local;
    private String titulo;




    public SeminarioExercicio(String local, String titulo) {
        this.local = local;
        this.titulo = titulo;
    }



    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
