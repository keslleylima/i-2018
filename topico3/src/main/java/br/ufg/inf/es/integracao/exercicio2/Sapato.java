/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio2;

/**
 * Essa classe representa a entidade sapato
 */
public class Sapato extends Calcado {
    public int vermelho;
    public int verde;
    public int azul;

    /**
     * Método que pega o valor do atributo vermelho do objeto sapato.
     * @return valor de vermelho
     */
    public int getVermelho() {
        return vermelho;
    }

    /**
     * Esse método altera valor do atributo vermelho do objeto sapato.
     * @param vermelho
     */
    public void setVermelho(int vermelho) {
        this.vermelho = vermelho;
    }

    /**
     * Método que pega o valor do atributo verde do objeto sapato.
     * @return
     */
    public int getVerde() {
        return verde;
    }

    /**
     *Esse método altera valor do atributo verde do objeto sapato.
     * @param verde
     */
    public void setVerde(int verde) {
        this.verde = verde;
    }

    /**
     * Método que pega o valor do atributo azul do objeto sapato.
     * @return
     */
    public int getAzul() {
        return azul;
    }

    /**
     *Esse método altera valor do atributo azul do objeto sapato.
     * @param azul
     */
    public void setAzul(int azul) {
        this.azul = azul;
    }
}
