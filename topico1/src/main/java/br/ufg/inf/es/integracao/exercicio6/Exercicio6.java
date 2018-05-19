package br.ufg.inf.es.integracao.exercicio6;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * Porgrama que recebe um único argumento correspondente ao nome de um arquivo
 * binário e exibe o conteúdo (texto) correspondente na saída padrão.
 */
public class Exercicio6 {

    /**
     * Método que chama execução do método "converteParaArquivo".
     * @param args parametor referente ao nome do arquivo binário.
     */
    public static void main(String[] args) {
        try {
            converteParaArquivo(args[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Esse método recebe o nome de um arquivo e exibi o contéudo
     * correspondente em UTF-8;
     * @param seqByte é o parametro referente ao nome do arquivo binário.
     * @throws IOException lançamento de excessão caso sejá necessário.
     */
    public static void converteParaArquivo(String seqByte) throws IOException {
        if(validaBytes(seqByte)){
            FileInputStream file = new FileInputStream(seqByte);
            DataInputStream dis = new DataInputStream(file);

            byte[] intByte = new byte[4];
            int lineByteAmount;


            while ((lineByteAmount = dis.read(intByte)) != -1) {

                lineByteAmount = ByteBuffer.wrap(intByte).getInt();
                byte[] byteArray = new byte[lineByteAmount];
                dis.read(byteArray);
                String str = new String(byteArray, "UTF-8");
                System.out.printf(str);
            }
        }


    }

    /**
     * Esse método valide se  o arquivo é válido.
     * @param arquivoByte parametro de entrada que é o arquivo de saída.
     * @return retorna o valor booleano (true ou false).
     */
    public static boolean validaBytes (String arquivoByte){
        if (arquivoByte.equals(null) || arquivoByte.equals("")) {
            return true;
        }else{
            return false;
        }
    }
}
