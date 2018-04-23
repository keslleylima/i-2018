package br.ufg.inf.es.atividade1.exercicio1;

/**
 * Created by keslley
 */
import java.io.Serializable;

public class Cliente {

    String nome;
    String identificador;

    public String getNome() {
        return nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return new StringBuffer(" nome : ")
                .append(this.nome)
                .append(" id : ")
                .append(this.identificador).toString();
    }
}