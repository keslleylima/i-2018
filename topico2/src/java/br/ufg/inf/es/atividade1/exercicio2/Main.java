package br.ufg.inf.es.atividade1.exercicio2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by aluno on 16/04/18.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Pessoa pessoa = new Pessoa();
            Serelizador serelizador = new Serelizador();
            serelizador.TamanhoEmBytes(pessoa);

             ObjectOutputStream out = new ObjectOutputStream();
            out.close();
            fileOut.close();
            System.out.printf("arquivo serelizado e salvo em: /home/aluno/arquivo.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

    }
}
