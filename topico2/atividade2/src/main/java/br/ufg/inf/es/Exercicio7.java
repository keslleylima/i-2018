
package br.ufg.inf.es.atividade2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;


public class Exercicio7 {

    public static void main(String[] args) throws IOException {
        String url = "https://api.github.com/users/kyriosdata";
        URL object = new URL(url);
        HttpURLConnection con = (HttpURLConnection) object.openConnection(); //O objeto de conexão é criado.
        //con.setDoOutput(true); // alter a "DoOutput para "true" se o programa usa conexão com URL para saída, senão use "false".
        //con.setDoInput(true);
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/json");
        con.setRequestMethod("GET");
        JSONObject cred = new JSONObject();
        JSONObject auth = new JSONObject();
        JSONObject parent = new JSONObject();

        cred.put("username", "adm");
        cred.put("password", "pwd");

        auth.put("tenantName", "adm");

        OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
        wr.write(url.toString());
        wr.flush();

//display what returns the post request

        StringBuilder sb = new StringBuilder();
        int HttpResult = con.getResponseCode();
        if (HttpResult == HttpURLConnection.HTTP_OK) {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), "utf-8"));
            String line = null;
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            br.close();
            System.out.println("" + sb.toString());
        } else {
            System.out.println(con.getResponseMessage());
        }
    }
}
