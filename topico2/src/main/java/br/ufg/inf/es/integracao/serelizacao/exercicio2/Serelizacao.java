package topico2.src.main.java.br.ufg.inf.es.integracao.serelizacao.exercicio2;

import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;

/**
 * Esse programa realiza a serialização e desserialização de objetos
 * da classe Cliente.
 */
public class Serelizacao {

    /**
     * Esse método realiza a invocação dos métodos responśaveis pela
     * serelização e deserelização de uma instânica de CLiente;
     * @param args não é passado nenhum argumento.
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente("keslley","14");
        byte[] bytes;

        try {
            bytes = serelizar(cliente);
            Cliente objDeseralizado = deserializar(bytes);
            System.out.println(objDeseralizado.getNome());
            System.out.println(objDeseralizado.getIdentificador());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    /**
     * Esse método realiza a serelização de uma istância de cliente;
     * @param cliente é a intância da classe Cliente
     * @throws IOException lançamento de exceção caso necessário.
     * @return  retorna o objeto serelizado como um array de bytes;
     */
    public static byte[] serelizar(Cliente cliente) throws IOException {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream objectOut = new ObjectOutputStream(new BufferedOutputStream(baos));

            objectOut.writeObject(cliente);
            objectOut.close();

            byte[] bytes = baos.toByteArray();

            return bytes;
        }

    /**
     * Esse método realiza a deserelização de uma istância de cliente;
     * @param bytes é o parametro referente um array de bytes.
     * @return retorna a instância de cliente deserelizado.
     * @throws IOException lançamento de exceção caso necessário
     * @throws ClassNotFoundException lançamento de exceção caso não encontre
     * classe.
     */
    public static Cliente deserializar(byte[] bytes) throws IOException, ClassNotFoundException {
            ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(bais);

            Cliente cliente = null;
            cliente = (Cliente) ois.readObject();

            ois.close();

            return cliente;
    }
}
