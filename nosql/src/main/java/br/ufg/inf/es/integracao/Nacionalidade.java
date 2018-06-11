package br.ufg.inf.es.integracao;

public class Nacionalidade {
    private String municipio;
    private String estado;
    private String pais;
    private Calendar dataEntradaPais;

    public Nacionalidade() {
        super();
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Calendar getDataEntradaPais() {
        return dataEntradaPais;
    }

    public void setDataEntradaPais(Calendar dataEntradaPais) {
        this.dataEntradaPais = dataEntradaPais;
    }

    public Nacionalidade(String municipio, String estado, String pais, Calendar dataEntradaPais) {
        super();
        this.municipio = municipio;
        this.estado = estado;
        this.pais = pais;
        this.dataEntradaPais = dataEntradaPais;
    }

    @Override
    public String toString() {
        return "\n --Nacionalidade [municipio=" + municipio + ", estado=" + estado + ", pais=" + pais + ", dataEntradaPais="
                + dataEntradaPais.toString() + "]";
    }
}
