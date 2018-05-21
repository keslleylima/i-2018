/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio1;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "aluno")

/**
 * Essa classe represente aluno, posusindo os atributos/caracteristicas nome
 * e email.
 */
public class Aluno {

    String nome;
    String email;

    /**
     *  Esse metodo pega o nome no objeto aluno.
     * @return nome do aluno
     */
    public String getNome() {
        return nome;
    }

    /**
     * Esse método altera o valor do atributo nome de aluno.
     * @param nome parametro referente valor nome.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Esse método pega o email do objeto aluno.
     * @return retorna o email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Esse método altera o valor do atributo email de aluno.
     * @param email parametro referente ao novo valor para email.
     */
    public void setEmail(String email) {
        this.email = email;
    }


}
