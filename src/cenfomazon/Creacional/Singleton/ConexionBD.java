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

    /*public static void postConnection(String query) {
      
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

    }*/

    

}
