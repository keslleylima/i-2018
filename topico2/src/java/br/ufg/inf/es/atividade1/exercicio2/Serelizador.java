package br.ufg.inf.es.atividade1.exercicio2;

import java.io.*;

/**
 * Created by aluno on 16/04/18.
 */
public class Serelizador {

    public byte[] serializar(Object objeto) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(objeto);
        oos.close();
        byte[] bytes = baos.toByteArray();
        return  bytes;

    }


    public  Pessoa deserializar(byte[] bytes) throws IOException, ClassNotFoundException {

        ByteArrayInputStream baos = new ByteArrayInputStream(bytes);
        ObjectInputStream obj = new ObjectInputStream(baos);
        Pessoa p;
        p = null;
        p = (Pessoa) obj.readObject();
        obj.close();
        return p;
    }


}
