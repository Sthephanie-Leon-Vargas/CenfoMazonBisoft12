/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenfomazon.Model.Marca;

import cenfomazon.Creacional.Singleton.Conexion;
import cenfomazon.Model.Categoria.Categoria;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Daniel Sandoval
 */
public class MarcaDAO {

    public ArrayList<Marca> listarMarca() {
        ArrayList<Marca> listaNavesM = new ArrayList<>();

        String sql;

        sql = "select * from jKM_Marca";
        Conexion con = Conexion.conectarBD("GET", sql);

        try {
            JSONObject jsonResponse = new JSONObject(con.getResponse().body());
            con.desconectar();
            JSONArray jsonArray = jsonResponse.getJSONObject("data").getJSONArray("result");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonNave = jsonArray.getJSONObject(i);
                int idMarca = jsonNave.getInt("idMarca");
                String Marca = jsonNave.getString("Marca");
                Marca marca = new Marca(idMarca, Marca);
                listaNavesM.add(marca);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return listaNavesM;
    }

}
