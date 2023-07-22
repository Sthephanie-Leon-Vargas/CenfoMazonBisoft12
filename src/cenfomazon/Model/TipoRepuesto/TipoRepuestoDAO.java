package cenfomazon.Model.TipoRepuesto;

import cenfomazon.Creacional.Singleton.Conexion;
import cenfomazon.Model.MarcaRepuesto.MarcaRepuesto;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class TipoRepuestoDAO {
    public ArrayList<TipoRepuesto> listarTiposR(){
        ArrayList<TipoRepuesto> listaTipoR = new ArrayList<>();
        Conexion con = new Conexion();
        String sql;

        sql = "SELECT * FROM `jKM_TipoRepuesto`";
        con.conectarBD("GET",sql);



        try {
            JSONObject jsonResponse = new JSONObject(con.getResponse().body());
            JSONArray jsonArray = jsonResponse.getJSONObject("data").getJSONArray("result");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonRepuesto = jsonArray.getJSONObject(i);
                int idRepuesto = jsonRepuesto.getInt("idTipoRepuesto");
                String nombreRepuesto = jsonRepuesto.getString("Tipo");
                TipoRepuesto repuesto = new TipoRepuesto(idRepuesto,nombreRepuesto);
                listaTipoR.add(repuesto);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return  listaTipoR;
    }
}
