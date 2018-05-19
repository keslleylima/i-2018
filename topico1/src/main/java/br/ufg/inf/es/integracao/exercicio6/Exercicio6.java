package br.ufg.inf.es.integracao.exercicio6;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

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
            exibirTexto(args[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Esse método recebe o nome de um arquivo e exibi o contéudo
     * correspondente em UTF-8;
     * @param arq é o parametro referente ao nome do arquivo binário.
     * @throws IOException lançamento de excessão caso sejá necessário.
     */
    public static void exibirTexto(String arq) throws IOException {
        if(validaNomeArquivo(arq)){

            FileInputStream tmp = new FileInputStream(arq);
            DataInputStream tmpfile = new DataInputStream(tmp);
            int aux;

            while((aux = tmpfile.read()) != -1) {
                System.out.print((char) aux);
            }
        }
    }

    /**
     * Esse método valide se  o arquivo é válido.
     * @param arquivoByte parametro de entrada que é o nome do arquivo binario.
     * @return retorna o valor booleano (true ou false).
     */
    public static boolean validaNomeArquivo (String arquivoByte){
        if (arquivoByte.equals(null) || arquivoByte.equals("")) {
            return false;
        }else{
            return true;
        }
    }
}
