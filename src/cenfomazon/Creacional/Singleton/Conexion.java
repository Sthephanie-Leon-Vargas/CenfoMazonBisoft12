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

    private Conexion con = null;
    private HttpClient httpClient;
    private HttpRequest request;
    private int codigoEstado;
    private HttpResponse<String> response;
    private String baseDatos = "BISOFT-12";
    private String url = "http://eeds.club/" + baseDatos + "/";
    private String usuario = "G02";
    private String contrasenna = "BISOFT_jKM_G02";

    public Conexion() {
    }

    public Conexion conectarBD(String peticion, String query) {
        if (con == null) {
            try {

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
        return con;
    }

    private void ejecutarPost(String cadenaConexion) {
        request = HttpRequest.newBuilder()
                .uri(URI.create(cadenaConexion))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();
    }

    private void ejecutarGet(String cadenaConexion) {

        request = HttpRequest.newBuilder()
                .uri(URI.create(cadenaConexion))
                .header("Content-Type", "application/text")
                .GET()
                .build();
    }

    private void ejecutarPeticion(String peticion, String cadenaConexion) {

        switch (peticion) {
            case "POST":
                ejecutarPost(cadenaConexion);
                break;

            case "GET":
                ejecutarGet(cadenaConexion);
                break;
        }
    }

//    public void desconectar() {
//        con = null;
//    }
    public int getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(int codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public HttpClient getHttpClient() {
        return httpClient;
    }

    public void setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public HttpRequest getRequest() {
        return request;
    }

    public void setRequest(HttpRequest request) {
        this.request = request;
    }

    public HttpResponse<String> getResponse() {
        return response;
    }

    public void setResponse(HttpResponse<String> response) {
        this.response = response;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

}
