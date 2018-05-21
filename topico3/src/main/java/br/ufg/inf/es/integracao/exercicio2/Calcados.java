/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.exercicio2;

import java.util.ArrayList;

/**
 * Essa classe representa a entidade tenis.
 */
public class Calcados {
    public ArrayList<Sapato> sapatos;
    public ArrayList<Tenis> tenis;

    /**
     * Método que pega o valor do atributo sapatos do objeto calcados.
     * @return array list de sapatos.
     */
    public ArrayList<Sapato> getSapatos() {
        return sapatos;
    }

    /**
     * Método que faz acesso e altera valor do atributo sapatos.
     * @param sapatos
     */
    public void setSapatos(ArrayList<Sapato> sapatos) {
        this.sapatos = sapatos;
    }

    /**
     * Método que pega o valor do atributo tenis do objeto calcados.
     * @return array list tenis
     */
    public ArrayList<Tenis> getTenis() {
        return tenis;
    }

    /**
     * Método que faz acesso e altera valor do atributo tenis.
     * @param tenis
     */
    public void setTenis(ArrayList<Tenis> tenis) {
        this.tenis = tenis;
    }
}
