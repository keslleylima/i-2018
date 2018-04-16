
package br.ufg.inf.es.manipulacaodearquivos;

import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author keslley
 */
public class Exercicio1 {

   public static void main(String[] args) throws FileNotFoundException, IOException {

            FileInputStream arquivo = new FileInputStream(args[0]);
            DataInputStream dataIn = new DataInputStream(arquivo);
            int valor = dataIn.readInt();
            System.out.println(Integer.toHexString(valor));
    }
}
