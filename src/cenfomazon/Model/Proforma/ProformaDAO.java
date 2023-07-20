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
        System.out.println("Response body: " + jsonSql);
        
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
                System.out.println("nombre: " + idCliente);
                System.out.println("estado: " + estado);
                
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
    /*public List<Proforma> listarProformas() {
        List<Proforma> proformas = new ArrayList<>();
        Conexion con = new Conexion();
        String sql;
        sql = "SELECT * jKM_Proformas";
        
        return proformas;
    }*/
}
