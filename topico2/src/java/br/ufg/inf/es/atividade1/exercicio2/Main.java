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
            ByteArrayOutputStream byt = new ByteArrayOutputStream();
            Pessoa pessoa = new Pessoa("Keslley","lima",839393);
            Serelizador serelizador = new Serelizador();
            serelizador.serializar(pessoa,byt);
            Pessoa pessoa1 = serelizador.deserializar(args[3]);
            System.out.println(pessoa.getCpf());
            System.out.println(pessoa.getSobrenome());
            System.out.println(pessoa.getNome());
        } catch (IOException i) {
            i.printStackTrace();
        }

    }
}
