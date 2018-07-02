/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.inf.es.integracao.exercicio4;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;

/**
 * classes (Java) correspondentes a tal modelo e implemente dois métodos, um
 * para serializar uma instância de Individuo e outra para fazer a operação
 * inversa, ou seja, a partir do conteúdo de um documento XML, recebido como
 * String produz a instância correspondente de Individuo. Em tempo, além da
 * classe Individuo outras poderão ser criadas.
 */
public class Exercicio4 {

    /**
     * Metodo principal do programa.
     */
    public static void main(String[] args) {

        Individuo individuo = new Individuo();
        String xml = null;
        try {
            individuo = deserializar(args[0]);
            xml = serializar(individuo);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Método que deserializar uma string e retorna um objeto do tipo individuo.
     */
    public static Individuo deserializar(String xml) throws IOException {

        if (nomeValido(xml)) {
            XmlMapper mapper = new XmlMapper();

            return mapper.readValue(xml, Individuo.class);
        } else {
            throw new IllegalArgumentException("Ops, xml em branco!");
        }
    }

    /**
     * Método que verifica se o nome de um arquivo é valido.
     * @param string nomr do arquivo xml.
     * @return True (verdadeiro) se o arquivo não estiver em branco.
     */
    private static boolean nomeValido(String string) {
        return !(string == null || string.trim().isEmpty());
    }
    
    /**
     * Método que serializar o objeto individuo.
     */
    public static String serializar(Individuo individuo) throws JsonProcessingException {
        ObjectMapper objectMapper = new XmlMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        return objectMapper.writeValueAsString(individuo);
    }  
}