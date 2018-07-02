/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.exercicio4;

/**
 *
 * Classe que representa instância de um titulo eleitoral.
 */
public class TituloEleitoral {

    private int secao;
    private int zona;

    /**
     * Método de acesso ao atributo seção.
     */
    public int getSecao() {
        return secao;
    }

    /**
     * Método de acesso ao atributo seção.
     */
    public void setSecao(int secao) {
        this.secao = secao;
    }

    /**
     * Método de acesso ao atributo zona.
     */
    public int getZona() {
        return zona;
    }

    /**
     * Método de acesso ao atributo zona.
     */
    public void setZona(int zona) {
        this.zona = zona;
    }
}
