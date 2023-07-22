package cenfomazon.Model.Proforma;

import cenfomazon.Creacional.Singleton.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ProformaDAO {
    public void registroProforma (Proforma proforma){

        Conexion con = new Conexion();
        String sql;
        int pidCliente= proforma.getId_Cliente();
        int pidVendedor= proforma.getId_Vendedor();
        String pestado= "'Nueva'";

        sql = "INSERT INTO jKM_Proformas (id_Cliente,id_Vendedor,estado) VALUES ("+pidCliente+","+pidVendedor+","+pestado+")";
        con.conectarBD("POST", sql);
       
    }
    
    public ArrayList<Proforma> listarProforma(JTable tabla) {
        ArrayList<Proforma> lista = new ArrayList<>();
        Conexion con = new Conexion();
        String sql;

//        sql = "SELECT estado,id_Cliente FROM  jKM_Proformas;";
        sql = "SELECT id_Cliente ,estado FROM  jKM_Proformas pro, jKM_Usuarios us WHERE pro.id_Cliente=us.id_usuario;";
        con.conectarBD("GET", sql);
        
        String jsonSql = con.getResponse().body();
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Id Cliente");
        model.addColumn("Estado");
        
        try {
            JSONObject jsonResponse = new JSONObject(jsonSql);
            JSONArray jsonArray = jsonResponse.getJSONObject("data").getJSONArray("result");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObj = jsonArray.getJSONObject(i);
                int idCliente = jsonObj.getInt("id_Cliente");
                String estado = jsonObj.getString("estado");

                Proforma proforma = new Proforma(idCliente,estado);
                
                Object fila[] = new Object[2];//31
                fila[0] = proforma.getId_Cliente();
                fila[1] = proforma.getEstado();
                
                model.addRow(fila);
                
                lista.add(proforma);
            }
            
            tabla.setModel(model);
            tabla.setRowHeight(35);
            
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public int ultimaProforma() {
        Conexion con = new Conexion();
        String sql;
        int codigo = 0;
        
        sql = "SELECT id_proforma FROM `jKM_Proformas` ORDER BY id_proforma DESC LIMIT 1;";
        con.conectarBD("GET",sql);
          try {
            JSONObject jsonResponse = new JSONObject(con.getResponse().body());
            JSONArray jsonArray = jsonResponse.getJSONObject("data").getJSONArray("result");
            
            JSONObject jsonMarca = jsonArray.getJSONObject(0);
            int idproforma = jsonMarca.getInt("id_proforma");
            codigo = idproforma + 1;
                } catch (JSONException e) {
                     e.printStackTrace();
                }        
     
        return codigo;       
    }
}
