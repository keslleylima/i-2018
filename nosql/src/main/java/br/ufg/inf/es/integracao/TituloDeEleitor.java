package br.ufg.inf.es.integracao;

public class TituloDeEleitor {
    rivate String secao;
    private String zona;

    public TituloEleitoral() {
        super();
    }

    public String getSecao() {
        return secao;
    }
    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getZona() {
        return zona;
    }
    public void setZona(String zona) {
        this.zona = zona;
    }

    public TituloEleitoral(String secao, String zona) {
        super();
        this.secao = secao;
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "\n ---TituloEleitoral [secao=" + secao + ", zona=" + zona + "]";
    }
}
