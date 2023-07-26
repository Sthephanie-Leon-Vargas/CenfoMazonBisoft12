/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cenfomazon.Creacional.Singleton;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sleon
 */
public class Conexion {

    private static Conexion conexionAPI = null;
    private static HttpClient httpClient;
    private static HttpRequest request;
    private static int codigoEstado;
    private static HttpResponse<String> response;
    private static String baseDatos = "BISOFT-12";
    private static String url = "http://eeds.club/" + baseDatos + "/";
    private static String usuario = "G02";
    private static String contrasenna = "BISOFT_jKM_G02";

    private Conexion(String url, String baseDatos) {
        setUrl(url);
        setBaseDatos(baseDatos);
    }

    public static Conexion conectarBD(String peticion, String query) {
        if (conexionAPI == null) {
            try {
                conexionAPI = new Conexion(url, baseDatos);
                httpClient = HttpClient.newHttpClient();
                String cadenaConexion = getUrl()
                        + "?usuario=" + URLEncoder.encode(getUsuario(), StandardCharsets.UTF_8)
                        + "&clave=" + URLEncoder.encode(getContrasenna(), StandardCharsets.UTF_8)
                        + "&query=" + URLEncoder.encode(query, StandardCharsets.UTF_8);

                ejecutarPeticion(peticion, cadenaConexion);

                response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
                codigoEstado = response.statusCode();

            } catch (IOException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return conexionAPI;
    }

    private static void ejecutarPost(String cadenaConexion) {
        request = HttpRequest.newBuilder()
                .uri(URI.create(cadenaConexion))
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .version(HttpClient.Version.HTTP_1_1) /*es importante para que no ocurra el error: java.io.IOException: protocol error: Frame type(80) length(4740180) exceeds MAX_FRAME_SIZE(16384)*/
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();
    }

    private static void ejecutarGet(String cadenaConexion) {

        request = HttpRequest.newBuilder()
                .uri(URI.create(cadenaConexion))
                .header("Content-Type", "application/text")
                .header("Accept", "application/json")
                .version(HttpClient.Version.HTTP_1_1)
                .GET()
                .build();
    }

    private static void ejecutarPeticion(String peticion, String cadenaConexion) {

        switch (peticion) {
            case "POST":
                ejecutarPost(cadenaConexion);
                break;

            case "GET":
                ejecutarGet(cadenaConexion);
                break;
        }
    }

    public static void desconectar() {
        conexionAPI = null;
    }

    public int getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(int codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    private HttpClient getHttpClient() {
        return httpClient;
    }

    private void setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    private HttpRequest getRequest() {
        return request;
    }

    private void setRequest(HttpRequest request) {
        this.request = request;
    }

    public HttpResponse<String> getResponse() {
        return response;
    }

    public void setResponse(HttpResponse<String> response) {
        this.response = response;
    }

    public static String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public static String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public static String getBaseDatos() {
        return baseDatos;
    }

    public static void setBaseDatos(String baseDatos) {
        Conexion.baseDatos = baseDatos;
    }

}
