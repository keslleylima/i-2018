package br.ufg.inf.es.integracao.exercicio3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Programa (linha de comandos) que exibe o conteúdo de arquivo texto, formato
 * UTF-8, na saída padrão.
 */
public class Exercicio3 {

    public static void main(String[] args) {
        try {
            if(verificaArquivoValido(args[0])){
                System.out.println(lerArquivo(args[0]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Esse  faz leitura de um arquivo e transforma contéudo em UTF-8.
     * @param file nome do arquivo que é parametro de entrada do metodo.
     * @return o conteúdo do arquivo no formato UTF-8.
     * @throws IOException
     */
    public static String lerArquivo (String  file) throws IOException {

        Charset utf8 = Charset.forName("UTF-8");
        Path arquivo = Paths.get(file);
        StringBuilder arq = new StringBuilder();
        for (String linha : Files.readAllLines(arquivo, utf8)) {
            arq.append(linha)
                    .append("\n");
        }

        return arq.toString();
    }

    /**
     *Esse método verifica se o nome do arquivo é válido, ou seja, senão está
     * Vazio ou null.
     */
    public static boolean verificaArquivoValido(String nomeArquivo) throws IOException {
        if (nomeArquivo.equals(null) || nomeArquivo.isEmpty()) {
            return false;
        }else{
            return true;
        }
    }
}
