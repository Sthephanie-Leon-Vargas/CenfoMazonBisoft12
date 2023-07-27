/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenfomazon.Model.Modelo;

import cenfomazon.Creacional.Singleton.Conexion;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Daniel Sandoval
 */
public class ModeloDAO {
    
     public ArrayList<Modelo> listarModelo() {
        ArrayList<Modelo> listaNavesMod = new ArrayList<>();
        
        String sql;

        sql = "select * from jKM_Modelo";
         Conexion con = Conexion.conectarBD("GET", sql);
        
        System.out.println("Llego " +con.getResponse().body());
        

        try {
            JSONObject jsonResponse = new JSONObject(con.getResponse().body());
            con.desconectar();
            JSONArray jsonArray = jsonResponse.getJSONObject("data").getJSONArray("result");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonNave = jsonArray.getJSONObject(i);
                int idModelo = jsonNave.getInt("idModelo");
                String Marca = jsonNave.getString("Marca");
                Modelo modelo = new Modelo(idModelo, Marca);
                listaNavesMod.add(modelo);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return listaNavesMod;
    }
    
    
}
