package cenfomazon.Model.Repuesto;

import cenfomazon.Creacional.Singleton.Conexion;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RepuestoDAO {

    
    
    public ArrayList<RepuestoC> listarRepuesto(int id_MarcaRepuesto){
        ArrayList<RepuestoC> listaRepuesto = new ArrayList<>();
        Conexion con = new Conexion();
        String sql;
        
        sql = "SELECT * FROM `jKM_Repuestos`";
        con.conectarBD("GET",sql);
        System.out.println("Response body: " + con.getResponse().body());
        

        try {
            JSONObject jsonResponse = new JSONObject(con.getResponse().body());
            JSONArray jsonArray = jsonResponse.getJSONObject("data").getJSONArray("result");
            for (int i = 0; i < jsonArray.length(); i++) {    
                JSONObject jsonObj = jsonArray.getJSONObject(i);
                int idRepuesto = jsonObj.getInt("id_Repuesto");
                String nombreRepuesto = jsonObj.getString("nombre");
                String idMarcaRepuesto= jsonObj.getString("id_MarcaRespuesto");
                RepuestoC repuesto = new RepuestoC(idRepuesto,nombreRepuesto,idMarcaRepuesto);
                listaRepuesto.add(repuesto);
             }
       
            } catch (JSONException e) {
                e.printStackTrace();
        }        
        return  listaRepuesto;
    }

}
