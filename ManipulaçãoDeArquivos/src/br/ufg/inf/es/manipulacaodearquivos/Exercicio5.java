
package br.ufg.inf.es.manipulacaodearquivos;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author keslley
 */
public class Exercicio5 {

    public static void main(String[] args) {
      
        try {
            
            Path arquivo = Paths.get(args[0]);
            Charset utf8 = Charset.forName("UTF-8");
            BufferedReader buffer = Files.newBufferedReader(arquivo, utf8);

            FileOutputStream fos = new FileOutputStream(args[1]);
            DataOutputStream arquivoBinario = new DataOutputStream(fos);

            String auxiliar;
            while ((auxiliar = buffer.readLine()) != null) {
               byte[] linha = auxiliar.getBytes(utf8);
               arquivoBinario.writeInt(auxiliar.length());
               arquivoBinario.write(linha, 0, auxiliar.length());
            }
            
            arquivoBinario.close(); 
        
        } catch (IOException excecao) {
            System.out.println("Desculpe, houve um erro. Tente novamente");
            excecao.getMessage();
        }
    }
}