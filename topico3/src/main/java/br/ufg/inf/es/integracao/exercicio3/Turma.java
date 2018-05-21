/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.exercicio3;

import java.util.List;

/**
 * Classe que representa a entidade turma.
 */
public class Turma {

    public String disciplina;
    private List<Estudante> estudantes;

    /**
     * Método que pega o valor do atributo disciplina do objeto turma.
     * @return
     */
    public String getDisciplina() {
        return disciplina;
    }

    /**
     * Método que faz acesso e altera valor do atributo disciplina
     * @param disciplina
     */
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    /**
     * Método que pega o valor do atributo estudantes do objeto turma.
     * @return
     */
    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    /**
     * Método que faz acesso e altera valor do atributo estudantes
     * @param estudantes
     */
    public void setEstudantes(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }
}
