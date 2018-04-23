package br.ufg.inf.es.atividade1.exercicio2;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by aluno on 16/04/18.
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Pessoa pessoa = new Pessoa("Keslley","lima",839393);
            Serelizador serelizador = new Serelizador();
            byte[] bytes = serelizador.serializar(pessoa);
            Pessoa pessoa1 = serelizador.deserializar(bytes);
        } catch (IOException i) {
            i.printStackTrace();
        }

    }
}
