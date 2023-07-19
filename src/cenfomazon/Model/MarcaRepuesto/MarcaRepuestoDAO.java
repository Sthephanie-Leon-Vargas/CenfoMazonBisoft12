/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenfomazon.Model.MarcaRepuesto;

import cenfomazon.Creacional.Singleton.Conexion;
import java.util.ArrayList;
 
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MarcaRepuestoDAO {
    
    public ArrayList<MarcaRepuesto> listarMarca(){
        ArrayList<MarcaRepuesto> listaMarcaR = new ArrayList<>();
        Conexion con = new Conexion();
        String sql;
        
        sql = "SELECT Marca FROM `jKM_MarcaRespuesto`";
        con.conectarBD("GET",sql);
        System.out.println("Response body: " + con.getResponse().body());
        

        try {
            JSONObject jsonResponse = new JSONObject(con.getResponse().body());
            JSONArray jsonArray = jsonResponse.getJSONObject("data").getJSONArray("result");
            for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonMarca = jsonArray.getJSONObject(i);
            String nombreMarca = jsonMarca.getString("Marca");
            MarcaRepuesto marca = new MarcaRepuesto(nombreMarca);
            listaMarcaR.add(marca);
        }
       
    } catch (JSONException e) {
        e.printStackTrace();
    }        
        return  listaMarcaR;
    }
    
}
