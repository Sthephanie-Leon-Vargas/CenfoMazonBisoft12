package cenfomazon.Creacional.Singleton;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class ConexionBD {

    private Connection connection = null;

    /*public static List<JsonElement> getConnection(String query){
        List<JsonElement> results = new ArrayList<>();
        try {
            HttpClient httpClient = HttpClient.newHttpClient();

            // Datos de conexión
            String baseUrl = "http://eeds.club/BISOFT-12/";
            String usr = "G02";
            String pwd = "BISOFT_jKM_G02";

            // Codificar los parámetros de la URL
            String encodedUrl = baseUrl +
                    "?usuario=" + URLEncoder.encode(usr, StandardCharsets.UTF_8) +
                    "&clave=" + URLEncoder.encode(pwd, StandardCharsets.UTF_8) +
                    "&query=" + URLEncoder.encode(query, StandardCharsets.UTF_8);



            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(encodedUrl))
                    .header("Content-Type", "application/text")
                    .GET()
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = response.statusCode();
            String jsonResponse = response.body();

            /// Procesar la respuesta JSON
            if (statusCode == 200) {
                // Crear un objeto Gson
                Gson gson = new Gson();

                // Convertir la respuesta JSON en un JsonObject
                JsonObject jsonObject = gson.fromJson(jsonResponse, JsonObject.class);

                // Agregar cada elemento del JsonObject a la lista de resultados
                for (String key : jsonObject.keySet()) {
                    JsonElement jsonElement = jsonObject.get(key);
                    results.add(jsonElement);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return results;
    }*/

    public static void postConnection(String query) {
        try {
            HttpClient httpClient = HttpClient.newHttpClient();

            // Datos de conexión
            String baseUrl = "http://eeds.club/BISOFT-12/";
            String usr = "G02";
            String pwd = "BISOFT_jKM_G02";

            // Crear los parámetros de la URL codificados
            Map<String, String> parameters = new HashMap<>();
            parameters.put("usuario", usr);
            parameters.put("clave", pwd);
            parameters.put("query", query);

            StringBuilder queryParameters = new StringBuilder();
            for (Map.Entry<String, String> entry : parameters.entrySet()) {
                if (queryParameters.length() > 0) {
                    queryParameters.append("&");
                }
                queryParameters.append(URLEncoder.encode(entry.getKey(), StandardCharsets.UTF_8));
                queryParameters.append("=");
                queryParameters.append(URLEncoder.encode(entry.getValue(), StandardCharsets.UTF_8));
            }

            String encodedUrl = baseUrl + "?" + queryParameters.toString();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(encodedUrl))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.noBody())
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = response.statusCode();
            HttpHeaders headers = response.headers();
            String jsonResponse = response.body();

            System.out.println("Status code: " + statusCode);
            System.out.println("Response headers: " + headers);
            System.out.println("Response body: " + jsonResponse);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void desconectarDB(){
        try{
            connection.close();
        } catch (Exception e){}
    }

}
