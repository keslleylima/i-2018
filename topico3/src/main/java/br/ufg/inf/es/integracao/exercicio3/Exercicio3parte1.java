/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Programa que  dada uma instância da classe Turma, gera o documento XML
 * correspondente (serializa a instância) e persiste  a sequência de
 * caracteres (documento XML), em um arquivo (UTF-8).
 */
public class Exercicio3parte1 {
    /**
     * Método responsável por chamado dos métodos "serializarXml" e "EscreverNoArquivo".
     * @param args sequencia de caracteres
     * @param turma instância de turma
     * @throws IOException
     */
    public static void main(String[] args, Turma turma) throws IOException {
        String xmlString = serializarXml(turma);
        escreverNoArquivo(xmlString, args[0]);
    }

    /**
     * Esse método é responsável pela realização da serelização de turma.
     * @param turma parametro de entrada referente instância de uma turma.
     * @return retorna um xml
     * @throws IOException
     */
    private static String serializarXml(Turma turma) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(turma);

        return xml;
    }

    /**
     * Esse método realiza a insercão das informações referente sequência
     * da string em um arquivo xml no formato UTF-8.
     * da string em um arquivo xml no formato UTF-8.
     * @param xmlString
     * @param pathname
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException
     */
    private static void escreverNoArquivo(String xmlString, String pathname) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter file = new PrintWriter(pathname,"UTF-8" );
        file.write(xmlString);
        file.close();
    }
}
