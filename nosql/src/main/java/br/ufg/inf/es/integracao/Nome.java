package br.ufg.inf.es.integracao;

public class Nome {
    private int surrogateKey;
    private String titulos;
    private String nomes;
    private String sobrenomes;
    private String sufixos;
    private String prefixos;
    private String usoCondicional;
    private Utilizacao utilizacao;
    private Representacao representacao;

    public Nome() {
        super();
    }

    public int getSurrogateKey() {
        return surrogateKey;
    }
    public void setSurrogateKey(int surrogateKey) {
        this.surrogateKey = surrogateKey;
    }

    public String getTitulos() {
        return titulos;
    }
    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getNomes() {
        return nomes;
    }
    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    public String getSobrenomes() {
        return sobrenomes;
    }
    public void setSobrenomes(String sobrenomes) {
        this.sobrenomes = sobrenomes;
    }

    public String getSufixos() {
        return sufixos;
    }
    public void setSufixos(String sufixos) {
        this.sufixos = sufixos;
    }

    public String getPrefixos() {
        return prefixos;
    }
    public void setPrefixos(String prefixos) {
        this.prefixos = prefixos;
    }

    public String getUsoCondicional() {
        return usoCondicional;
    }
    public void setUsoCondicional(String usoCondicional) {
        this.usoCondicional = usoCondicional;
    }

    public Utilizacao getUtilizacao() {
        return utilizacao;
    }
    public void setUtilizacao(Utilizacao utilizacao) {
        this.utilizacao = utilizacao;
    }

    public Representacao getRepresentacao() {
        return representacao;
    }
    public void setRepresentacao(Representacao representacao) {
        this.representacao = representacao;
    }

    public Nome(int surrogateKey, String titulos, String nomes, String sobrenomes, String sufixos, String prefixos,
                String usoCondicional) {
        super();
        this.surrogateKey = surrogateKey;
        this.titulos = titulos;
        this.nomes = nomes;
        this.sobrenomes = sobrenomes;
        this.sufixos = sufixos;
        this.prefixos = prefixos;
        this.usoCondicional = usoCondicional;
    }

    @Override
    public String toString() {
        String output = "\n --Nome [surrogateKey=" + surrogateKey + ", titulos=" + titulos + ", nomes=" + nomes + ", sobrenomes="
                + sobrenomes + ", sufixos=" + sufixos + ", prefixos=" + prefixos + ", usoCondicional=" + usoCondicional;

        if(this.utilizacao != null) {
            output += ", utilizacao=" + utilizacao.toString();
        }

        if(this.representacao != null) {
            output += ", representacao=" + representacao.toString();
        }

        output += "]";
        return output;
    }
}
