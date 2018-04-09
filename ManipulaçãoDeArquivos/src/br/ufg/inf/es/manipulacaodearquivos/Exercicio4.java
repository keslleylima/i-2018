
package br.ufg.inf.es.manipulacaodearquivos;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Keslley
 */
public class Exercicio4 {

    public static void main(String[] args) {
        try (Scanner leitura = new Scanner(System.in)) {

            PrintWriter arquivo = new PrintWriter(args[0], "UTF-8");
            arquivo.write(args[1]);
            arquivo.write("\n");
            arquivo.close();
            
        } catch (IOException excecao) {
            System.out.println("Desculpe, houve um erro. Tente novamente");
            excecao.getMessage();
        }
    }
}