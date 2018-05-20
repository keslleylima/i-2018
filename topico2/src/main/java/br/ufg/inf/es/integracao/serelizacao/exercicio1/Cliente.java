package br.ufg.inf.es.integracao.serelizacao.exercicio1;

public class Cliente {

    String nome;
    String identificador;

    public String getNome() {
        return nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Cliente(String nome, String identificador) {
        this.nome = nome;
        this.identificador = identificador;
    }
}
