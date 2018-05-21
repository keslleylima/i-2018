/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio3;

/**
 * Classe que representa a entidade estudante.
 */
public class Estudante {
    public String nome;
    public int matricula;
    public Endereco endereco;

    /**
     * Método que pega o valor do atributo nome do objeto estudante.
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método que faz acesso e altera valor do atributo nome.
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método que pega o valor do atributo matricula do objeto estudante.
     * @return
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * Método que faz acesso e altera valor do atributo matricula.
     * @param matricula
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * Método que pega o valor do atributo endereco do objeto estudante.
     * @return
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * Método que faz acesso e altera valor do atributo endereço.
     * @param endereco
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
