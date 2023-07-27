/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenfomazon.Model.MarcaModelo;

import cenfomazon.Creacional.Singleton.Conexion;
import cenfomazon.Model.Marca.Marca;
import cenfomazon.Model.Modelo.Modelo;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Daniel Sandoval
 */
public class MarcaModeloDAO {

    public ArrayList<MarcaModelo> listarMarcaModelo() {
        ArrayList<MarcaModelo> listaNavesMM = new ArrayList<>();
        
        String sql;

        sql = "select * from jKM_MarcaModelo as MM inner join jKM_Marca AS M ON MM.id_Marca = "
                + "M.idMarca inner join jKM_Modelo as MO ON MM.id_Modelo = MO.idModelo";
        Conexion con = Conexion.conectarBD("GET", sql);

        try {
            JSONObject jsonResponse = new JSONObject(con.getResponse().body());
            con.desconectar();
            JSONArray jsonArray = jsonResponse.getJSONObject("data").getJSONArray("result");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonNave = jsonArray.getJSONObject(i);
                int id_MarcaModelo = jsonNave.getInt("id_MarcaModelo");
                int annno = jsonNave.getInt("annno");
                String Modelo = jsonNave.getString("Modelo");
                int idModelo = jsonNave.getInt("idModelo");
                String Marca = jsonNave.getString("Marca");
                int idMarca = jsonNave.getInt("idMarca");
                Modelo modelo = new Modelo(idModelo, Modelo);
                Marca marca = new Marca(idMarca, Marca);

                MarcaModelo marcaModelo = new MarcaModelo(id_MarcaModelo, annno, marca, modelo);
                listaNavesMM.add(marcaModelo);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return listaNavesMM;
    }

}
