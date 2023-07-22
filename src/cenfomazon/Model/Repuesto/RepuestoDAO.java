package cenfomazon.Model.Repuesto;

import cenfomazon.Creacional.Singleton.Conexion;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RepuestoDAO {

    public ArrayList<RepuestoC> listarRepuestos(int codigo){
        ArrayList<RepuestoC> listaRepuesto = new ArrayList<>();
        Conexion con = new Conexion();
        String sql;
        

        sql = "SELECT id_Repuesto, nombre, id_MarcaRespuesto FROM `jKM_Repuestos` WHERE id_MarcaRespuesto="+codigo+"";

        con.conectarBD("GET",sql);

        
        

        try {
            JSONObject jsonResponse = new JSONObject(con.getResponse().body());
            JSONArray jsonArray = jsonResponse.getJSONObject("data").getJSONArray("result");
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonMarca = jsonArray.getJSONObject(i);
                    int idRepuesto = jsonMarca.getInt("id_Repuesto");
                    String pnombre = jsonMarca.getString("nombre");
                    int idMarca = jsonMarca.getInt("id_MarcaRespuesto");
                    RepuestoC repuesto = new RepuestoC(idRepuesto,pnombre,idMarca);
                    listaRepuesto.add(repuesto);
                }
             
            } catch (JSONException e) {
                e.printStackTrace();
        }      
         
        return  listaRepuesto;
    }

}
