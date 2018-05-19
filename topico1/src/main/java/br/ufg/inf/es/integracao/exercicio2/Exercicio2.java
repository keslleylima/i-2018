package br.ufg.inf.es.integracao.exercicio2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * O Programa faz a verificaçao pra saber se o nome de um arquivo e JPEG
 * o portal http://en.wikipedia.org/wiki/Magic_number_%28programming%29
 * diz que um arquivo JPEG se inicia por um par de bytes específico,
 * assim como termina com outro par de bytes específico. Estes bytes são
 * empregados como “marcadores” para indicar que o arquivo
 * é um arquivo JPEG.
 * Programa (linha de comandos) que recebe como argumento o nome de um
 * arquivo JPEG e que verifica se esta restrição é satisfeita ou não.
 */
public class Exercicio2 {

    /**
     * Esse método exibe o resultado se o arquivo de entrada é ou não JPEG.
     * @param args parametro que é o nome do arquivo.
     */
    public static void main(String[] args) {

        try {
            if (verificaNomeArqJpeg(args[0]) && verificaArquivoValido(args[0])) {
                System.out.println("É um arquivo JPEG");
            } else {
                System.out.println("Não é um arquivo JPEG");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     *Esse método verifica se o nome do arquivo é válido, ou seja, senão está
     * Vazio ou null.
     */
    public static boolean verificaArquivoValido(String nomeArquivo) throws IOException {
        if (nomeArquivo.equals(null) || nomeArquivo.trim().isEmpty()) {
            return false;
        }else{
            return true;
        }
    }

    /**
     * Esse método verifica se o nome de um arquivo é um arquivo JPEG.
     * @param nomeArquivo é o nome de um arquivo.
     * @return Baseado na verificação é retornado verdadeiro caso seja JPEG
     * e retornado falso caso o arquivo não seja do formato JPEG.
     * @throws IOException lançamento de excessões caso seja necesário.
     */
    public static boolean verificaNomeArqJpeg (String nomeArquivo) throws IOException {

        if (nomeArquivo.equals(null) || nomeArquivo.trim().isEmpty()) {
            throw new IllegalArgumentException("Arquivo é inválido");
        }

        File file = new File(nomeArquivo);
        RandomAccessFile randomAccess = new RandomAccessFile(file, "r");

        byte[] byteArray = new byte[4];

        randomAccess.seek(0);
        randomAccess.read(byteArray, 0, 2);

        randomAccess.seek(randomAccess.length() - 2);
        randomAccess.read(byteArray, 2, 2);

        String firstPair = Integer.toHexString(byteArray[0] & 0xFF) +
                Integer.toHexString(byteArray[1] & 0xFF);

        String lastPair = Integer.toHexString(byteArray[2] & 0xFF) +
                Integer.toHexString(byteArray[3] & 0xFF);

        if (firstPair.equals("ffd8") && lastPair.equals("ffd9")) {
            return true;
        }else{
            return false;
        }
    }
}
