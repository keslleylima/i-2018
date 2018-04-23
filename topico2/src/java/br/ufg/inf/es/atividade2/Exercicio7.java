/*
package br.ufg.inf.es.atividade2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;

*/
/**
 * Created by keslley
 *//*

public class Exercicio7 {

    public void RecuperaAvatar() {
        try {
            URL url = new URL(https://api.github.com/users/kyriosdata);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            conexao.setRequestMethod("GET");
            conexao.connect();

           leitor = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            StringBuilder tmp = new StringBuilder();
            String linnha = null;

           while (linha = leitor.readLine()) {
               tmp.append(line + "\n");
           }

            String tmp = tmp.toString();

          JsonParser parser = new JsonParser();
          JsonObject gitUser = parser.parse(tmp).getAsJsonObject();
          String avatar = gitUser.get("avatar_url").toString().replaceAll("\"", "");
          Files.copy(avatar);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

*/
