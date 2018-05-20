package br.ufg.inf.es.integracao.serelizacao.exercicio7;

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


public class ApiGit {

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
     *
     * @param url_arg
     * @return
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
     *
     * @param url
     * @return
     * @throws IOException
     */
    public static String getJson(InputStream url) throws IOException {

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        byte[] dados = null;
        int aux;
        while ((aux = url.read(dados, 0, dados.length)) != -1) {
            buffer.write(dados, 0, aux);
        }

        buffer.flush();
        String json = new String(buffer.toByteArray(), StandardCharsets.UTF_8);

        return json;

    }

    /**
     *
     * @param gitUser
     * @param chave
     * @return
     */
    public static String pegarDadosPelaChave (JsonObject gitUser, String chave) {

        return gitUser.get(chave).toString().replaceAll("\"", "");
    }

    /**
     *
     * @param newString
     * @return
     */
    public static JsonObject getDadosUser(String newString) {
        JsonParser dados = new JsonParser();

        return dados.parse(newString).getAsJsonObject();
    }

    /**
     *
     * @param name
     * @param salvar
     * @throws IOException
     */
    public static void gravarArquivo(String name, InputStream salvar) throws IOException {

        Files.copy(salvar, Paths.get(name + ".jpg"));
    }

    /**
     *
     * @param avatar
     * @return
     * @throws IOException
     */
    public static InputStream getAvatar(String avatar) throws IOException {

        return new URL(avatar).openStream();
    }

}
