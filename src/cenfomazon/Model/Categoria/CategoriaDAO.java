/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenfomazon.Model.Categoria;

import cenfomazon.Creacional.Singleton.Conexion;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Daniel Sandoval
 */
public class CategoriaDAO {

    public ArrayList<Categoria> listarCategoria() {
        ArrayList<Categoria> listaNavesC = new ArrayList<>();
        Conexion con = new Conexion();
        String sql;

        sql = "select * from jKM_Categoria";
        con.conectarBD("GET", sql);
        
        System.out.println("Llego " +con.getResponse().body());
        

        try {
            JSONObject jsonResponse = new JSONObject(con.getResponse().body());
            JSONArray jsonArray = jsonResponse.getJSONObject("data").getJSONArray("result");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonNave = jsonArray.getJSONObject(i);
                int id_Categoria = jsonNave.getInt("id_Categoria");
                String Categoria = jsonNave.getString("Categoria");
                Categoria categoria = new Categoria(id_Categoria, Categoria);
                listaNavesC.add(categoria);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return listaNavesC;
    }

}
