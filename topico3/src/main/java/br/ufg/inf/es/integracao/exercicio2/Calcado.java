
/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio2;

public class Calcado {

    public String marca;
    public float preco;
    /**
     * Método que pega o valor do atributo nome do objeto calçados.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método que faz acesso e altera valor do atributo nome.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método que pega o valor do atributo preço do objeto calçados.
     */
    public float getPreco() {
        return preco;
    }

    /**
     * Método que faz acesso e altera valor do atributo preço.
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }
}
