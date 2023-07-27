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
      
        String sql;
        
        sql = "SELECT * FROM `jKM_MarcaRespuesto`";
        Conexion con = Conexion.conectarBD("GET", sql);

        try {
            JSONObject jsonResponse = new JSONObject(con.getResponse().body());
            con.desconectar();
            JSONArray jsonArray = jsonResponse.getJSONObject("data").getJSONArray("result");
            for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonMarca = jsonArray.getJSONObject(i);
            int idMarca = jsonMarca.getInt("idMarcaRespuesto");
            String nombreMarca = jsonMarca.getString("Marca");
            MarcaRepuesto marca = new MarcaRepuesto(idMarca,nombreMarca);
            listaMarcaR.add(marca);
        }
       
    } catch (JSONException e) {
        e.printStackTrace();
    }        
        return  listaMarcaR;
    }
    
    public MarcaRepuesto Buscar_MarcaRepuesto(int codigo){
        String sql;
        MarcaRepuesto resultado= new MarcaRepuesto();
       
        sql = "SELECT * FROM `jKM_MarcaRespuesto` WHERE idMarcaRespuesto="+ codigo +"";                                                                                     
        Conexion con = Conexion.conectarBD("GET", sql);
        try {
            JSONObject jsonResponse = new JSONObject(con.getResponse().body());
            con.desconectar();
            JSONArray jsonArray = jsonResponse.getJSONObject("data").getJSONArray("result");
            JSONObject jsonMarca= jsonArray.getJSONObject(0);
                int idMarcaR = jsonMarca.getInt("idMarcaRespuesto");
                String marca = jsonMarca.getString("Marca");
                resultado = new MarcaRepuesto(idMarcaR,marca);
        } catch (JSONException e) {
            e.printStackTrace();
        }  
        return resultado;
    }
    
}
