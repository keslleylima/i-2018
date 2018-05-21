/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio2;

/**
 * Essa classe representa a entidade tenis
 */
public class Tenis extends Calcado {

    public String esporte;

    /**
     * Método que pega o valor do atributo esporte do objeto  tenis.
     * @return dados do atributo esporte.
     */
    public String getEsporte() {
        return esporte;
    }

    /**
     * Método que faz acesso e altera valor do atributo  esporte.
     */
    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }
}
