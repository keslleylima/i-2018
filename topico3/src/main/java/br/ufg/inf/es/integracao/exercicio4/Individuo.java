/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.exercicio4;
import java.util.List;

/**
 *
 * Classe que representa instância de um indivíduo.
 */
class Individuo {

    private List<Vinculo> vinculos;
    private List<Identificador> identificadores;
    private List<Nome> nomes;
    private DadoDemografico dadoDemografico;
    private List<Endereco> enderecos;
    private List<Comunicacao> comunicacoes;

    /**
     * Metodo que acessa atirbutos de vinculos
     * @return 
     */
    public List<Vinculo> getVinculos() {
        return vinculos;
    }
    
    /**
     * Metodo que atualiza atirbutos de vinculos
     * @param vinculos 
     */
    public void setVinculos(List<Vinculo> vinculos) {
        this.vinculos = vinculos;
    }
    
    /**
     * Metodo que acessa atributos de identificadores
     * @return 
     */
    public List<Identificador> getIdentificadores() {
        return identificadores;
    }
    
    /**
     * Metodo que atualiza atributos de identificadores
     * @param identificadores 
     */
    public void setIdentificadores(List<Identificador> identificadores) {
        this.identificadores = identificadores;
    }
    
    /**
     * Metodo que acessa atributos de nomes
     * @return 
     */
    public List<Nome> getNomes() {
        return nomes;
    }
    
    /**
     * Metodo que atualiza atributos de nomes
     * @param nomes 
     */
    public void setNomes(List<Nome> nomes) {
        this.nomes = nomes;
    }
    
    /**
     * Metodo que acessa atributos de dados demograficos
     * @return 
     */
    public DadoDemografico getDadoDemografico() {
        return dadoDemografico;
    }
    
    /**
     * Metodo que atualiza atributos de dados demograficos
     * @param dadoDemografico 
     */
    public void setDadoDemografico(DadoDemografico dadoDemografico) {
        this.dadoDemografico = dadoDemografico;
    }
    
    /**
     * Metodo que acessa atributos de endereços
     * @return 
     */
    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    /**
     * Metodo que atualiza atributos de endereços
     * @param enderecos 
     */
    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
    
    /**
     * Metodo que acessa atributos de comunicacoes
     * @return 
     */
    public List<Comunicacao> getComunicacoes() {
        return comunicacoes;
    }
    
    /**
     * Metodo que atualiza atributos de comunicacoes
     * @param comunicacoes 
     */
    public void setComunicacoes(List<Comunicacao> comunicacoes) {
        this.comunicacoes = comunicacoes;
    }
}
