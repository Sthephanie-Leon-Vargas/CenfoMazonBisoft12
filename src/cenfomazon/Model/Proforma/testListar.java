/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cenfomazon.Model.Proforma;

import cenfomazon.Creacional.Singleton.Conexion;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author sleon
 */
public class testListar {

    /**
     * @param args the command line arguments
     */
    private static Conexion con = new Conexion();
    private static ProformaDAO p = new ProformaDAO();
    static String json = "{\"success\":true,\"message\":\"Consulta ejecutada correctamente\",\"data\":{\"result\":[{\"id_usuario\":\"1\",\"id_rol\":\"1\",\"nombre\":\"Gia\",\"apellido1\":\"Montero\",\"apellido2\":\"Quiros\",\"telefono\":\"31321\",\"Username\":\"\",\"Password\":\"\"},{\"id_usuario\":\"2\",\"id_rol\":\"2\",\"nombre\":\"Stephanie\",\"apellido1\":\"Leon\",\"apellido2\":\"Vargas\",\"telefono\":\"888888\",\"Username\":\"\",\"Password\":\"\"},{\"id_usuario\":\"3\",\"id_rol\":\"1\",\"nombre\":\"Juan\",\"apellido1\":\"Perez\",\"apellido2\":\"Rodriguez\",\"telefono\":\"823456789\",\"Username\":\"\",\"Password\":\"\"},{\"id_usuario\":\"4\",\"id_rol\":\"2\",\"nombre\":\"Pepe\",\"apellido1\":\"Perez\",\"apellido2\":\"Castro\",\"telefono\":\"59632145\",\"Username\":\"\",\"Password\":\"\"},{\"id_usuario\":\"5\",\"id_rol\":\"1\",\"nombre\":\"Juanito\",\"apellido1\":\"Lopez\",\"apellido2\":\"Mercedes\",\"telefono\":\"1234567899\",\"Username\":\"\",\"Password\":\"\"},{\"id_usuario\":\"6\",\"id_rol\":\"1\",\"nombre\":\"Maria\",\"apellido1\":\"Gutierrez\",\"apellido2\":\"Castro\",\"telefono\":\"801546565\",\"Username\":\"\",\"Password\":\"\"},{\"id_usuario\":\"7\",\"id_rol\":\"1\",\"nombre\":\"Maria\",\"apellido1\":\"Gutierrez\",\"apellido2\":\"Castro\",\"telefono\":\"801546565\",\"Username\":\"\",\"Password\":\"\"},{\"id_usuario\":\"8\",\"id_rol\":\"1\",\"nombre\":\"Michael\",\"apellido1\":\"Ng\",\"apellido2\":\"Zhao\",\"telefono\":\"86276868\",\"Username\":\"mikey\",\"Password\":\"qwerty\"}]}}";

    static String json2 = "{\n"
            + "    \"success\": true,\n"
            + "    \"message\": \"Consulta ejecutada correctamente\",\n"
            + "    \"data\": \n"
            //            + "        \"result\": "
            + "[\n"
            + "            {\n"
            + "                \"id_proforma\": \"1\",\n"
            + "                \"id_Cliente\": \"2\",\n"
            + "                \"id_Vendedor\": \"1\",\n"
            + "                \"estado\": \"Nueva\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"id_proforma\": \"2\",\n"
            + "                \"id_Cliente\": \"2\",\n"
            + "                \"id_Vendedor\": \"1\",\n"
            + "                \"estado\": \"Nueva\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"id_proforma\": \"3\",\n"
            + "                \"id_Cliente\": \"2\",\n"
            + "                \"id_Vendedor\": \"1\",\n"
            + "                \"estado\": \"Nueva\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"id_proforma\": \"4\",\n"
            + "                \"id_Cliente\": \"2\",\n"
            + "                \"id_Vendedor\": \"1\",\n"
            + "                \"estado\": \"Nueva\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"id_proforma\": \"5\",\n"
            + "                \"id_Cliente\": \"2\",\n"
            + "                \"id_Vendedor\": \"1\",\n"
            + "                \"estado\": \"Nueva\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"id_proforma\": \"6\",\n"
            + "                \"id_Cliente\": \"2\",\n"
            + "                \"id_Vendedor\": \"1\",\n"
            + "                \"estado\": \"Nueva\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"id_proforma\": \"7\",\n"
            + "                \"id_Cliente\": \"2\",\n"
            + "                \"id_Vendedor\": \"1\",\n"
            + "                \"estado\": \"Complete\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"id_proforma\": \"8\",\n"
            + "                \"id_Cliente\": \"2\",\n"
            + "                \"id_Vendedor\": \"1\",\n"
            + "                \"estado\": \"Nueva\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"id_proforma\": \"9\",\n"
            + "                \"id_Cliente\": \"1\",\n"
            + "                \"id_Vendedor\": \"1\",\n"
            + "                \"estado\": \"Nueva\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"id_proforma\": \"10\",\n"
            + "                \"id_Cliente\": \"1\",\n"
            + "                \"id_Vendedor\": \"1\",\n"
            + "                \"estado\": \"Nueva\"\n"
            + "            },\n"
            + "            {\n"
            + "                \"id_proforma\": \"11\",\n"
            + "                \"id_Cliente\": \"1\",\n"
            + "                \"id_Vendedor\": \"1\",\n"
            + "                \"estado\": \"Nueva\"\n"
            + "            }\n"
            + "        ]\n"
            + "}";

    public static void main(String[] args) throws JSONException {
//        p.listarProforma();
        //Make a object 
//        JSONObject ob = new JSONObject(json2);
//
//        //getting first and last name
//        String firstName = ob.getJSONObject("data").getString("id_proforma");
//        String lastName = ob.getJSONObject("data").getString("id_Cliente");
//        System.out.println("FirstName " + firstName);
//        System.out.println("LastName " + lastName);
        //loop for printing the array as phoneNumber is stored as array.
//        JSONArray arr = ob.getJSONArray("data");
//        for (int i = 0; i < arr.length(); i++) {
//            String post_id = arr.getJSONObject(i).getString("id_usuario");
//            System.out.println(post_id);
//        }
    }

}
