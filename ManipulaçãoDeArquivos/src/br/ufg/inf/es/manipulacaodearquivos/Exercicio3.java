
package br.ufg.inf.es.manipulacaodearquivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author keslley
 */
public class Exercicio3 {

    public static void main(String[] args) throws IOException {
    Charset uft8 = Charset.forName("UTF-8");
        String ArquivoNome = null;
            Path arquivoExibir = Paths.get(ArquivoNome);
            System.out.println(ArquivoNome);
            Charset utf8 = Charset.forName("UTF-8");
            BufferedReader br = Files.newBufferedReader(arquivoExibir, utf8);

            String linha;
            while ((linha = br.readLine()) != null) {
               System.out.println(linha);
            }
    }
}
