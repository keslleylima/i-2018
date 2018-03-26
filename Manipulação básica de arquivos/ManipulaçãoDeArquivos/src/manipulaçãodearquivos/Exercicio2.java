/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulaçãodearquivos;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 * JPEG image files begin with FF D8 and end with FF D9
 *
 * @author Keslley
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira o nome do arquivo:");
        String ArquivoNome = leitura.nextLine();

        try {
            FileInputStream novoArquivo = new FileInputStream(ArquivoNome);
            DataInputStream dataIn = new DataInputStream(novoArquivo);
            int tamanho = novoArquivo.available();
            byte[] buffer = new byte[tamanho];
            dataIn.read(buffer);

            if ((buffer[1] == 0x23c && buffer[tamanho - 1] == 0x23c) || (buffer[1] == 571 && buffer[tamanho - 1] == 572)) { // FF D8, onde FF = 255 e D8 = 216. FF= 255 e D9 = 217
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
