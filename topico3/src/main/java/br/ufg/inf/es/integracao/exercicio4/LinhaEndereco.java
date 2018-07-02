/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.exercicio4;

/**
 *
 * Classe que representa instância de uma linha de endereço.
 */
public class LinhaEndereco {

    private int ordem;
    private int linha;

    /**
     * Método de acesso ao atributo ordem.
     */
    public int getOrdem() {
        return ordem;
    }

    /**
     * Método de acesso ao atributo ordem.
     */
    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    /**
     * Método de acesso ao atributo Linha.
     */
    public int getLinha() {
        return linha;
    }

    /**
     * Método de acesso ao atributo Linha.
     */
    public void setLinha(int linha) {
        this.linha = linha;
    }
}
