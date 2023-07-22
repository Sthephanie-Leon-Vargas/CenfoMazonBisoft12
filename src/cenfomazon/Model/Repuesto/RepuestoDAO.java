package cenfomazon.Model.Repuesto;

import cenfomazon.Creacional.Singleton.Conexion;
import java.util.ArrayList;

import cenfomazon.Estructural.PesoLigero.Extrinseco.Repuesto;
import cenfomazon.Model.Proforma.Proforma;
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

        System.out.println("Response body: " + con.getResponse().body());



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

    public void registroRepuesto (Repuesto repuesto){

        Conexion con = new Conexion();
        String sql;

        sql = "INSERT INTO jKM_Repuestos (id_TipoRepuesto, nombre, descripcion, categoria, precio, id_MarcaRespuesto) VALUES " +
                "("+repuesto.getTipoRepuesto()+",'"+repuesto.getNombre()+"','"+repuesto.getDescripcion()+"','"+repuesto.getCategoria()+"',"
                +repuesto.getPrecio()+","+repuesto.getMarcaRepuesto()+")";
        con.conectarBD("POST", sql);
        System.out.println("code status: " + con.getCodigoEstado());
        System.out.println("Response body: " + con.getResponse().body());
    }
}
