
package br.ufg.inf.es.manipulacaodearquivos;

import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author keslley
 */
public class Exercicio2 {

    public static void main(String[] args) throws IOException {
        try {
            FileInputStream novoArquivo = new FileInputStream(args[0]);
            DataInputStream dataIn = new DataInputStream(novoArquivo);
            int tamanho = novoArquivo.available();
            byte[] buffer = new byte[tamanho];
            dataIn.read(buffer);
            
           //Os arquivos de imagem JPEG começam FF D8e terminam com FF D9.
           
           if  ("FF".equals(String.format("%X", buffer[0])) &&
                "D8".equals(String.format("%X", buffer[1])) &&
                "FF".equals(String.format("%X", buffer[tamanho - 2])) &&
                "D9".equals(String.format("%X", buffer[tamanho - 1])) ){

                    System.out.println("A imagem em questão é do formato JPEG");
            } else {
                System.out.println("A imagem em questão não é do formato JPEG");
            }

        } catch (IOException excecao) {
            System.out.println("Desculpe, houve um erro. Tente novamente");
            excecao.getMessage();
        }
        
    }
}