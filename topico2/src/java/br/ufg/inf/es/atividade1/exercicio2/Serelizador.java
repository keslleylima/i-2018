package br.ufg.inf.es.atividade1.exercicio2;

import java.io.*;

/**
 * Created by aluno on 16/04/18.
 */
public class Serelizador {

    public  boolean serializar(Object objeto, ByteArrayOutputStream outputStream) throws IOException {

        ObjectOutputStream objectOut = new ObjectOutputStream(new BufferedOutputStream(outputStream));
        objectOut.writeObject(objeto);
        return true;


    }


    public  Pessoa deserializar(String nomeArq) throws IOException, ClassNotFoundException {

        if (nomeArq.equals(null) || nomeArq.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome invalido!");
        }

        FileInputStream inFile = new FileInputStream(nomeArq);
        ObjectInputStream ObjectIn = new ObjectInputStream(inFile);
        Pessoa objeto = (Pessoa)ObjectIn.readObject();
        return objeto;
    }


}
