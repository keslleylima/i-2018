package br.ufg.inf.es.atividade1.exercicio1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by aluno on 16/04/18.
 */
public class Main {
        public static void main(String [] args) {
                    Cliente cliente = new Cliente();
                   cliente.nome = "Keslley";
                   cliente.identificador = "K14";
                    try {
                        FileOutputStream fileOut = new FileOutputStream("/home/aluno/arquivo.ser");
                        ObjectOutputStream out = new ObjectOutputStream(fileOut);
                        out.writeObject(cliente);
                        out.close();
                        fileOut.close();
                        System.out.printf("arquivo serelizado e salvo em: /home/aluno/arquivo.ser");
                       } catch (IOException i) {
                           i.printStackTrace();
                    }
        }
    }

