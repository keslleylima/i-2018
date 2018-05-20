/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Classe que implementa um programa (linha de comandos) que recebe como único argumento um nome de
 * arquivo e exibe os 4 primeiros bytes (inteiro de 32 bits) em formato
 * hexadecimal na saída padrão.
 */
public class Exercicio1 {

    /**
     * Este método exibe o resultado do método returnHexadecimal para ou usuário.
     * @param args nome do arquivo.
     */
    public static void main(String[] args) {
        try {
            System.out.println(Integer.toHexString(returnHexadecimal(args[0])));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Esse método recebe como parametro o nome de um arquivo qualquer e
     * retorna os 4 primeiros bytes (inteiro de 32 bits) em formato.
     * @param nomeArquivo parametro que é o nome do arquivo.
     * @return retorna o 4 primeiro byte do arquivo em hexadecimal.
     * @throws IOException lançamento de excessões caso seja necesário.
     */
    public static int returnHexadecimal(String nomeArquivo)throws IOException {

        if(validarNome(nomeArquivo)) {

            FileInputStream arquivo = new FileInputStream(nomeArquivo);
            DataInputStream dataIn = new DataInputStream(arquivo);
            int valor = dataIn.readInt();
            return valor;
        }else{
            throw new  IllegalArgumentException("O nome do arquivo não é válido");
        }
    }

    /**
     * Esse método recebe o nome do arquivo e válido se é valido, ou seja,
     * se está vazio ou null.
     * @param nomeArquivo parametro que é o nome do arquivo
     * @return falso se o nome não é válido e  verdadeiro caso seja válido.
     */
    private static boolean validarNome(String nomeArquivo) {
        if( nomeArquivo.equals(null) || nomeArquivo.equals("")){
            return  false;
        }else {
            return true;
        }
    }
}