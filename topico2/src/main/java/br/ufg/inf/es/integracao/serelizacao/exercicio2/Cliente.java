/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.serelizacao.exercicio2;

import java.io.Serializable;

public class Cliente implements Serializable {
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
