package br.ufg.inf.es.atividade1.exercicio2;

import java.io.*;

/**
 * Created by aluno on 16/04/18.
 */
public class Serelizador {

    public int TamanhoEmBytes(Serializable s) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        oos.writeObject(s);
        oos.close();

        return baos.toByteArray().length;
    }


}
