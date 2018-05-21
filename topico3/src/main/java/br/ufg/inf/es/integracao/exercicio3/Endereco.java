/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio3;

/**
 * Essa classe implementa a entidade endereço
 */
public class Endereco {
    public String cep;
    public String logradouro;
    public int numero;
    public String complemento;

    /**
     * Método que pega o valor do atributo cep do objeto endereço.
     * @return
     */
    public String getCep() {
        return cep;
    }

    /**
     * Método que faz acesso e altera valor do atributo cep
     * @param cep valor de entrada
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * Método que pega o valor do atributo logradouro do objeto endereço.
     * @return
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * Método que faz acesso e altera valor do atributo logradouro
     * @param logradouro
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * Método que pega o valor do atributo numero do objeto endereço.
     * @return
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Método que faz acesso e altera valor do atributo numero
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Método que pega o valor do atributo complemento do objeto endereço.
     * @return
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Método que faz acesso e altera valor do atributo complemento.
     * @param complemento
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Endereco(String cep, String logradouro, int numero, String complemento) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }
}
