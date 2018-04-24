package br.ufg.inf.es.exercicio2;

import java.io.Serializable;

/**
 * Created by aluno on 16/04/18.
 */
public class Pessoa implements Serializable {

    String nome;
    String sobrenome;
    int cpf;

    public Pessoa(String nome, String sobrenome, int cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
