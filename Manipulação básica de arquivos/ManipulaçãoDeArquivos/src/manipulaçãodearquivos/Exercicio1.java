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
 *
 * @author keslley
 */
public class Exercicio1 {

    public static void main(String[] args) {
        String ArquivoNome;
        try (Scanner leitura = new Scanner(System.in)) {
            System.out.println("Insira o nome do arquivo:");
            ArquivoNome = leitura.nextLine();
        }
        try {
            FileInputStream novoArquivo = new FileInputStream(ArquivoNome);

            int valorSaida;

            DataInputStream dataIn = new DataInputStream(novoArquivo);
            valorSaida = dataIn.readInt();

            System.out.println(Integer.toHexString(valorSaida));

        } catch (IOException excecao) {
            System.out.println("Desculpe, houve um erro. Tente novamente");
            excecao.getMessage();
        }
    }

}
