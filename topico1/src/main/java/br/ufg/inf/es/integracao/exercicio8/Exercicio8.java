package br.ufg.inf.es.integracao.exercicio8;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;


/**
 * O programa recebe dois argumentos: o nome de um arquivo binário
 * e um inteiro correspondente à ordem de uma linha de texto.
 * De posse desses dois argumentos, o programa exibi o texto da linha
 * em questão, e apenas este texto, sem a necessidade de percorrer as
 * linhas anteriores ao fazer uso das metainformações acrescentadas
 * no arquivo binário.
 */
public class Exercicio8 {
    /** Esse método chama a execução do metodo "ExibirLinhaEmTexto".
     * @param args os parametros são nome do arquivo binário e um inteiro que é
     *             ordem de uma linha de texto.
     */
    public static void main(String[] args) {
        try {
            exibirLinhaEmTexto(args[0], Integer.parseInt(args[1]));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * O método exibe uma determinada linha de um arquivo binário no formato
     * texto.
     * @param arqBin é o parametro referente ao nome do arquivo binário.
     * @param ordemLinha é o interio referente a sequência/ordem da linha.
     * @throws IOException lançado quando necessário.
     */
    public static void exibirLinhaEmTexto ( String arqBin, int ordemLinha) throws IOException {
        if (validaLinha(ordemLinha) && validaNomeArqBin(arqBin)){
            FileInputStream tmp = new FileInputStream(arqBin);
            DataInputStream tmpfile = new DataInputStream(tmp);
            byte[] intByte = new byte[4];
            int Index;
            int lineByte;
            int amountSkip = 0;

            while ((Index = tmpfile.read(intByte)) != -1) {
                Index = ByteBuffer.wrap(intByte).getInt();

                if (Index == ordemLinha) {
                    lineByte = tmpfile.read(intByte);
                    lineByte = ByteBuffer.wrap(intByte).getInt();

                    byte[] byteArray = new byte[lineByte];
                    tmpfile.read(byteArray);
                    String str = new String(byteArray, "UTF-8");
                    System.out.println(str);
                } else {
                    amountSkip = tmpfile.read(intByte);
                    amountSkip = ByteBuffer.wrap(intByte).getInt();
                    tmpfile.skipBytes(amountSkip);
                }

            }
        }
    }

    /**
     * Esse método valide se o nome do arquivo binário é válido,
     * ou seja, não é vazio.
     * @param arqBin parametro de entrada que é nome do arquivo binário
     * @return retorna o valor booleano (true ou false).
     */
    public static boolean validaNomeArqBin (String arqBin){
        if (arqBin.equals(null) || arqBin.equals("")) {
            return false;
        }else{
            return true;
        }
    }

    /**
     * Esse método valide se a ordem da linha do texto é válido
     * ou seja, não é negativo.
     * @param ordemLinha parametro de entrada que é ordem da linha do texto
     * @return retorna o valor booleano (true ou false).
     */
    public static boolean validaLinha (int ordemLinha){
        if (ordemLinha<0) {
            return false;
        }else{
            return true;
        }
    }

}
