package br.ufg.inf.es.integracao;

public class Ctps {
    private String serie;
    private String estado;

    public Ctps() {
        super();
    }

    public String getSerie() {
        return serie;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Ctps(String serie, String estado) {
        super();
        this.serie = serie;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "\n ---Ctps [serie=" + serie + ", estado=" + estado + "]";
    }
}
