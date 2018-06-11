package br.ufg.inf.es.integracao;

public class Identificador {
    private int surrogateKey;
    private String designacao;
    private String area;
    private String emissor;
    private Calendar data;
    private String tipo;
    private CTPS ctps;
    private Certidao certidao;
    private TituloEleitoral tituloEleitoral;

    public Identificador() {
        super();
    }

    public int getSurrogateKey() {
        return surrogateKey;
    }
    public void setSurrogateKey(int surrogateKey) {
        this.surrogateKey = surrogateKey;
    }

    public String getDesignacao() {
        return designacao;
    }
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    public String getEmissor() {
        return emissor;
    }
    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public Calendar getData() {
        return data;
    }
    public void setData(Calendar data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public CTPS getCtps() {
        return ctps;
    }
    public void setCtps(CTPS ctps) {
        this.ctps = ctps;
    }

    public Certidao getCertidao() {
        return certidao;
    }
    public void setCertidao(Certidao certidao) {
        this.certidao = certidao;
    }

    public TituloEleitoral getTituloEleitoral() {
        return tituloEleitoral;
    }
    public void setTituloEleitoral(TituloEleitoral tituloEleitoral) {
        this.tituloEleitoral = tituloEleitoral;
    }

    public Identificador(int surrogateKey, String designacao, String area, String emissor, Calendar data, String tipo) {
        super();
        this.surrogateKey = surrogateKey;
        this.designacao = designacao;
        this.area = area;
        this.emissor = emissor;
        this.data = data;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String output = "\n --Identificador [surrogateKey=" + surrogateKey + ", designacao=" + designacao + ", area=" + area
                + ", emissor=" + emissor + ", data=" + data + ", tipo=" + tipo;

        if(this.ctps != null) {
            output += ", ctps=" + ctps;
        }

        if(this.certidao != null){
            output += ", certidao=" + certidao;
        }

        if(this.tituloEleitoral != null) {
            output += ", tituloEleitoral=" + tituloEleitoral;
        }

        output += "]";
        return output;
    }
}
