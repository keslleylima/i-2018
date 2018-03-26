/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulaçãodearquivos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Keslley
 */
public class Exercicio3 {

    public static void main(String[] args) {
        String ArquivoNome;
        try (Scanner leitura = new Scanner(System.in)) {
            System.out.println("Insira o nome do arquivo:");
            ArquivoNome = leitura.nextLine();
            FileInputStream novoArquivo = new FileInputStream(ArquivoNome);
            InputStreamReader inReader = new InputStreamReader(novoArquivo, "UTF-8");
            InputStreamReader saida = inReader;
            System.out.println(saida);
        } catch (IOException excecao) {
            System.out.println("Desculpe, houve um erro. Tente novamente");
            excecao.getMessage();
        }
    }
}
