package br.ufg.inf.es.integracao.exercicio7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.DataOutputStream;

/**
 * Essa classe converte um arquivo texto em um arquivo binario.
 */
public class Exercicio7 {

    /**
     * Esse metodo realiza a chamado do método responsável pela conversão
     * do texto em binário.
     * @param args recebe os argumentos (nome arquivo texto e nome arquivo
     *            binário)
     */
    public static void main(String[] args) {
        try {
            converteTextParaBinario(args[0],args[1]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Esse método de uma otimizada, ou seja, consumido menor número de recurso
     * converte os dados de um arquivo texto em arquivo binário.
     * @param arqTexto nome do arquivo texto.
     * @param arqBinario nome do arquivo binário.
     */
    public static void converteTextParaBinario (String arqTexto, String arqBinario) throws IOException {
        if(validaNomeArqBin(arqBinario) && validaNomeArqText(arqTexto)){
            Charset utf8 = Charset.forName("UTF-8");
            Path file = Paths.get(arqTexto);

            FileOutputStream tmpBinary = new FileOutputStream(arqBinario);
            DataOutputStream archive = new DataOutputStream(tmpBinary);
            int index = 0;

            for (String line : Files.readAllLines(file, utf8)) {
                byte[] lineByte = line.getBytes(utf8);
                archive.writeInt(index);
                archive.writeInt(line.length());
                archive.write(lineByte, 0, line.length());
                index ++;
            }

        }
    }

    /**
     * Esse método valide se o nome do arquivo binario é válido,
     * ou seja, não é vazio.
     * @param ArqBin parametro de entrada que é o nome do arquivo binário.
     * @return retorna valor booleando (verdadeiro ou falso).
     */
    public static boolean validaNomeArqBin (String ArqBin){
        if (ArqBin.equals(null) || ArqBin.equals("")) {
            return false;
        }else{
            return true;
        }
    }

    /**
     * Esse método valide se o nome do arquivo texto é válido,
     * ou seja, não é vazio.
     * @param arqText parametro de entrada que é nome do arquivo de texto
     * @return retorna o valor booleano (true ou false).
     */
    public static boolean validaNomeArqText (String arqText){
        if (arqText.equals(null) || arqText.equals("")) {
            return false;
        }else{
            return true;
        }
    }
}

