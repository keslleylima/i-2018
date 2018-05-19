package topico2.src.main.java.br.ufg.inf.es.integracao.serelizacao.exercicio2;

import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;

/**
 *
 */
public class Serelizacao {

    public static void main(String[] args) {

    }

    /**
     *
     * @param nomeArq
     * @throws IOException
     */
    public static void serelizar(String nomeArq) throws IOException {
        if(validaNomeArquivo(nomeArq)){
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream objectOut = new ObjectOutputStream(new BufferedOutputStream(baos));
            objectOut.writeObject(nomeArq);
            objectOut.close();
        }
    }

    /**
     *
     * @param byteArray
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void deserializar(byte[] byteArray) throws IOException, ClassNotFoundException {
        ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Cliente cliente = null;
        cliente = (Cliente) ois.readObject();
        ois.close();
    }

    /**
     * Esse método verifica se o nome do arquivo é válido, ou seja, se o nome
     * passado não é vazio/null.
     * @param arq parametro que é o nome do arquivo.
     * @return retorna verdadeiro (caso nome seja valido) ou falso (caso o nome
     * não seja válido).
     */
    public static boolean validaNomeArquivo (String arq){
        if (arq.equals(null) || arq.equals("")) {
            return false;
        }else{
            return true;
        }
    }
}
