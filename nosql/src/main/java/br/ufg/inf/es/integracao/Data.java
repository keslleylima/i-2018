package br.ufg.inf.es.integracao;

public class Data {
    private Calendar data;
    private String acuracia;

    public Data() {
        super();
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getAcuracia() {
        return acuracia;
    }

    public void setAcuracia(String acuracia) {
        this.acuracia = acuracia;
    }

    public Data(Calendar data, String acuracia) {
        super();
        this.data = data;
        this.acuracia = acuracia;
    }

    @Override
    public String toString() {
        return "\n ---Data [data=" + data + ", acuracia=" + acuracia + "]";
    }
}
