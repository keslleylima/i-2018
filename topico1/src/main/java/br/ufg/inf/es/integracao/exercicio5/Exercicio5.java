package br.ufg.inf.es.integracao.exercicio5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Programa (linha de comandos) que lê um arquivo texto e o converte em um
 * arquivo contendo uma sequência de bytes correspondente (formato detalhado
 * abaixo). O programa recebe dois argumentos: o nome do arquivo texto e o nome
 * do arquivo a ser criado e no qual será depositada a sequência de bytes
 * correspondente à entrada (arquivo texto), após a conversão.
 */
public class Exercicio5 {

    public static void main(String[] args) {
        try {
            converterEmBytes(args[0],args[1]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Esse metodo recebe dois argumentos e grava sequencia de bytes
     * correspondente ao primeiro parametro no segundo parametro.
     * @param arquivoIn é o o nome do arquivo texto.
     * @param arquivoOut o nome do arquivo a ser criado e no qual será
     *                  depositada a sequência de bytes correspondente à entrada (arquivo texto)
     * @throws IOException lançamento da exceçao caso seja necessario.
     */
    public static void converterEmBytes (String arquivoIn, String arquivoOut) throws IOException {

        if(validaNomeArquivoEntrada(arquivoIn) && validaNomeArquivoSaida(arquivoOut)){
            Charset utf8 = Charset.forName("UTF-8");
            Path file = Paths.get(arquivoIn);
            FileOutputStream arqBinario = new FileOutputStream(arquivoOut);
            DataOutputStream archive = new DataOutputStream(arqBinario);

            for (String line : Files.readAllLines(file, utf8)) {
                byte[] lineByte = line.getBytes(utf8);
                archive.writeInt(line.length());
                archive.write(lineByte, 0, line.length());
            }

            archive.close();
        }
    }

    /**
     * Esse método valide se o nome do arquivo entrada é válido, ou seja,
     * não é vazio.
     * @param arquivoIn parametro de entrada que é o nome do arquivo entrada;
     * @return retorna valor booleando (verdadeiro ou falso).
     */
    public static boolean validaNomeArquivoEntrada (String arquivoIn){
        if (arquivoIn.equals(null) || arquivoIn.equals("")) {
            return false;
        }else{
            return true;
        }
    }

    /**
     * Esse método valide se o nome do arquivo de saída é válido,
     * ou seja, não é vazio.
     * @param arquivoOut parametro de entrada que é o arquivo de saída.
     * @return retorna o valor booleano (true ou false).
     */
    public static boolean validaNomeArquivoSaida (String arquivoOut){
        if (arquivoOut.equals(null) || arquivoOut.equals("")) {
            return false;
        }else{
            return true;
        }
    }
}
