/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)

/**
 * Essa clase represente um conjunto de alunos.
 */
public class Alunos {
    @XmlElementWrapper(name = "alunos")
    @XmlElement(name = "aluno")
    public ArrayList<Aluno> alunos;

    /**
     * Esse método pega os alunos.
     * @return
     */
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * Esse metodo altera valor de alunos.
     * @param alunos
     */
    public void setAlunos(ArrayList <Aluno> alunos) {
        this.alunos = alunos;
    }
}
