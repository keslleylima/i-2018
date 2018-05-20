/**
 * Copyright (c) 2018.
 * Keslley Lima da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.exercicio7;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Essa clase realiza requisição get na API do git para exportar imagem
 * do perfil do usário que seja passado as informações necessárias.
  */
public class ApiGit {
    /**
     * Esse método é o principal, no qual chama execução dos outros métodos,
     * sua função é essa.
     * @param args esse parametro é a URL do usuário no Git.
     */
    public static void main (String[] args) {
        try{
            InputStream url = gerarConexao(args[0]);
            String string = getJson(url);

            JsonObject gitUsuario = getDadosUser(string);

            String login = pegarDadosPelaChave(gitUsuario, "login");
            String dados = pegarDadosPelaChave(gitUsuario, "avatar_url");
            InputStream avatar = getAvatar(dados);
            gravarArquivo(login, avatar);

        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * ESse método é o responsável por estabelecer conexão no caminho passado.
     * @param url_arg esse parametro é a URLL do perfil do git.
     * @return retorna a conexão gerada.
     * @throws IOException
     */
    public static InputStream gerarConexao (String url_arg) throws IOException {

        URL url = new URL(url_arg);
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

        conexao.setRequestMethod("GET");
        conexao.setReadTimeout(15*1000);
        conexao.connect();

        return conexao.getInputStream();

    }

    /**
     * Esse método é responsável por retornar um arquivo no formato Json por
     * meio da URL/caminho fornecido.
     * @param url é parametro que é a URL/caminho de acesso.
     * @return esse m
     * @throws IOException
     */
    public static String getJson(InputStream url) throws IOException {

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        byte[] dados = new byte[16384];
        int aux;
        while ((aux = url.read(dados, 0, dados.length)) != -1) {
            buffer.write(dados, 0, aux);
        }

        buffer.flush();
        String json = new String(buffer.toByteArray(), StandardCharsets.UTF_8);

        return json;

    }

    /**
     * Esse método é responsável por dividir as informações do usuário git da
     * url/caminho fornecido.
     * @param gitUser é o parametro passado referente ao usuário do git (Login).
     * @param chave é o parametro passado referente a chave para coleta dos dados.
     * @return retorna as informações de forma separada/dividida.
     */
    public static String pegarDadosPelaChave (JsonObject gitUser, String chave) {

        return gitUser.get(chave).toString().replaceAll("\"", "");
    }

    /**
     * Esse método coleta as informações do usuário.
     * @param string é o parametro pasado para realizar coleta dos dados
     * @return retorna os dados coletados
     */
    public static JsonObject getDadosUser(String string) {
        JsonParser dados = new JsonParser();

        return dados.parse(string).getAsJsonObject();
    }

    /**
     * Esse método  realiza a gravação da imagem/avatar do usuário, no caso no
     * no formato jpeg
     * @param name
     * @param salvar
     * @throws IOException
     */
    public static void gravarArquivo(String name, InputStream salvar) throws IOException {

        Files.copy(salvar, Paths.get(name + ".jpeg"));
    }

    /**
     * Esse metodo pega o  avatar do usuário git em questão.
     * @param avatar parametro referente ao avatar do usuário git
     * @return retorna o avatar
     * @throws IOException
     */
    public static InputStream getAvatar(String avatar) throws IOException {

        return new URL(avatar).openStream();
    }

}
