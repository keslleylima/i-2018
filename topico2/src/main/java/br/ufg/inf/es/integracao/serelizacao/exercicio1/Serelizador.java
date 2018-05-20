/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.serelizacao.exercicio1;

import java.io.*;

/**
 * Esse programa provoca a geração da exceção NotSerializableException quando
 * se tenta serializar um objeto.
 */
public class Serelizador {

    /**
     * Esse método é responsável por chama execução do método "persistirDados".
     * @param args são três parametros: nome do cliente, identificador (CPF,
     *             por exemplo) e nome do arquivo no qual os dados serão
     *             persistidos.
     * @throws FileNotFoundException exceção gerada caso o arquivo não seja
     * encontrado.
     */
    public static void main(String [] args) throws FileNotFoundException {
        try {
            persistirDados(args[0],args[1],args[2]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Esse método é responsável pela serelização dos dados (nome, id);
     * @param nome parametro passado referente nome do cliente.
     * @param id parametro passado referente ao identificador do cliente.
     * @param nomeArquivo parametro passado referente nome do arquivo no qual
     *                    os dados serão persistidos.
     */
    public static void persistirDados (String nome, String id, String nomeArquivo) throws IOException {
        if(validaNomeArquivo(nomeArquivo)){
            Cliente cliente = new Cliente(nome,id);
            Cliente[] clientes = {cliente};

            ObjectOutputStream objectOut = new ObjectOutputStream(new
                    BufferedOutputStream(new FileOutputStream(nomeArquivo)));
            objectOut.writeObject(clientes);
            objectOut.close();
        }
    }

    /**
     * Esse método verifica se o nome do arquivo é válido, ou seja, se o nome
     * passado não é vazio/null.
     * @param arq parametro que é o nome do arquivo.
     * @return retorna verdadeiro (caso nome seja valido) ou falso (caso o nome
     * não seja válido).
     */
    public static boolean validaNomeArquivo (String arq){
        if (arq.equals(null) || arq.equals("")) {
            return false;
        }else{
            return true;
        }
    }

}
