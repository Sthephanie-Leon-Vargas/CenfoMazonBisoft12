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
        
        sql = "SELECT Nombre FROM `jKM_Repuesto` WHERE id_MarcaRepuesto="+id_MarcaRepuesto+";";
        con.conectarBD("GET",sql);
        System.out.println("Response body: " + con.getResponse().body());
        

        try {
            JSONObject jsonResponse = new JSONObject(con.getResponse().body());
            JSONArray jsonArray = jsonResponse.getJSONObject("data").getJSONArray("result");
            for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonMarca = jsonArray.getJSONObject(i);
            String nombreRepuesto = jsonMarca.getString("Nombre");
            RepuestoC repuesto = new RepuestoC(nombreRepuesto);
            listaRepuesto.add(repuesto);
        }
       
    } catch (JSONException e) {
        e.printStackTrace();
    }        
        return  listaRepuesto;
    }

}
