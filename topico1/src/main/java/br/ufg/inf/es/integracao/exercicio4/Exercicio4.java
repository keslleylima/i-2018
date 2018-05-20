/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Esse  programa (linha de comandos) cujo primeiro argumento é o nome
 * de um arquivo e cujo segundo argumento é uma
 * sequência de caracteres. Quando executado, a sequência de caracteres
 * fornecida como o segundo argumento é persistida
 * (em UTF-8) no arquivo cujo nome é fornecido como primeiro argumento.
 */
public class Exercicio4 {

    /**
     * Metodo principal que chama para execução da persistência dos dados;
     * @param args argumentos.
     */
    public static void main(String[] args) {
    try {
        persistirconteudo(args[0],args[1]);

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    }

    /**
     * Esse método realiza a perisistência de dados (sequência de caracteres)
     * em um arquivo no formato UTF-8.
     * @param arquivo é o nome de um arquivo, primeiro parametro de entrada.
     * @param conteudo é o contéudo, que é o segundo parametro de entrada.
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException
     */
    public static void persistirconteudo(String arquivo, String conteudo) throws FileNotFoundException, UnsupportedEncodingException {

        if (validaNomeArquivo(arquivo) && validaNomeConteudo(conteudo)) {
            PrintWriter pw = new PrintWriter(arquivo, "UTF-8");
            pw.write(conteudo);
            pw.close();
        }
    }

    /**
     * Esse método valide se o nome do arquivo é válido, ou seja, não é vazio.
     * @param arquivo parametro de entrada que é o nome do arquivo;
     * @return retorna valor booleando (verdadeiro ou falso).
     */
    public static boolean validaNomeArquivo (String arquivo){
        if (arquivo.equals(null) || arquivo.equals("")) {
            return false;
        }else{
            return true;
        }
    }

    /**
     * Esse método valide se o contéudo é válido, ou seja, não é vazio.
     * @param conteudo parametro de entrada que é a seq. de caracteres
     * @return retorna o valor booleano (true ou false).
     */
    public static boolean validaNomeConteudo (String conteudo){
        if (conteudo.equals(null) || conteudo.equals("")) {
            return false;
        }else{
            return true;
        }
    }

}
