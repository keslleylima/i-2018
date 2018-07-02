/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.exercicio4;
import java.util.Calendar;

/**
 *
 * Classe que representa instância de uma data.
 */
public class Data {
     private Calendar data;
    private String acuracia;

    /**
     * Método de acesso ao atributo data.
     */
    public Calendar getData() {
        return data;
    }

    /**
     * Método de acesso ao atributo data.
     */
    public void setData(Calendar data) {
        this.data = data;
    }

    /**
     * Método de acesso ao atributo acuracia.
     */
    public String getAcuracia() {
        return acuracia;
    }

    /**
     * Método de acesso ao atributo acuracia.
     */
    public void setAcuracia(String acuracia) {
        this.acuracia = acuracia;
    }
}
