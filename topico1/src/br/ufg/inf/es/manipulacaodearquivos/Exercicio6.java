
package br.ufg.inf.es.manipulacaodearquivos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

/**
 *
 * @author keslley
 */
public class Exercicio6 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream file = new FileInputStream(args[0]);
        try (DataInputStream dataIn = new DataInputStream(file)) {
            int tamanho = 4;
            int lineByteAmount;
            byte[] intByte = new byte[tamanho];
            
            while ((lineByteAmount = dataIn.read(intByte)) != -1) {
            
                lineByteAmount = ByteBuffer.wrap(intByte).getInt();
                byte[] byteArray = new byte[lineByteAmount];
                dataIn.read(byteArray);
                String str = new String(byteArray, "UTF-8");
                System.out.println(str);

            }
        }

    }

}
