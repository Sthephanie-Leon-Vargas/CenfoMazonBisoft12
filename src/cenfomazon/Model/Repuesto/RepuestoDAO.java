package cenfomazon.Model.Repuesto;


import cenfomazon.Creacional.Singleton.Conexion;
import java.util.ArrayList;

import cenfomazon.Estructural.PesoLigero.Extrinseco.Repuesto;
import cenfomazon.UI.TablaUI;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RepuestoDAO {

    DefaultTableModel _tablaModel = new DefaultTableModel();

    public ArrayList<RepuestoC> listarRepuestos(int codigo) {
        ArrayList<RepuestoC> listaRepuesto = new ArrayList<>();
        Conexion con = new Conexion();
        String sql;

        sql = "SELECT id_Repuesto, nombre, id_MarcaRespuesto FROM `jKM_Repuestos` WHERE id_MarcaRespuesto=" + codigo + "";

        con.conectarBD("GET", sql);

        

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

    public void registroRepuesto(Repuesto repuesto) {

        Conexion con = new Conexion();
        String sql;

        sql = "INSERT INTO jKM_Repuestos (id_TipoRepuesto, nombre, descripcion, categoria, precio, id_MarcaRespuesto) VALUES "
                + "(" + repuesto.getTipoRepuesto() + ",'" + repuesto.getNombre() + "','" + repuesto.getDescripcion() + "','" + repuesto.getCategoria() + "',"
                + repuesto.getPrecio() + "," + repuesto.getMarcaRepuesto() + ")";
        con.conectarBD("POST", sql);
        System.out.println("code status: " + con.getCodigoEstado());
        System.out.println("Response body: " + con.getResponse().body());
    }

    //Listar todos los Repuestos
    public ArrayList<RepuestoC> listarRepuestos(JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new TablaUI());
        _tablaModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ArrayList<RepuestoC> lista = new ArrayList<>();
        Conexion con = new Conexion();
        String sql;
        sql = "SELECT r.id_Repuesto, tr.Tipo ,r.nombre, r.descripcion,r.categoria,r.precio FROM jKM_Repuestos r, jKM_TipoRepuesto tr;";
        con.conectarBD("GET", sql);
        String jsonSql = con.getResponse().body();

        _tablaModel.addColumn("Id Repuesto");
        _tablaModel.addColumn("Tipo Repuesto");
        _tablaModel.addColumn("Nombre");
        _tablaModel.addColumn("Descripción");
        _tablaModel.addColumn("Categoría");
        _tablaModel.addColumn("Precio");

        try {
            JSONObject jsonResponse = new JSONObject(jsonSql);
            JSONArray jsonArray = jsonResponse.getJSONObject("data").getJSONArray("result");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObj = jsonArray.getJSONObject(i);
                int idRepuesto = jsonObj.getInt("id_Repuesto");
                String tipoRepuesto = jsonObj.getString("Tipo");
                String nombre = jsonObj.getString("nombre");
                String desc = jsonObj.getString("descripcion");
                String categoria = jsonObj.getString("categoria");
                double precio = jsonObj.getDouble("precio");

                RepuestoC r = new RepuestoC(idRepuesto, tipoRepuesto, nombre, desc, categoria, precio);

                Object fila[] = new Object[6];
                fila[0] = r.getIdRepuesto();
                fila[1] = r.getDescTipoRepuesto();
                fila[2] = r.getNombre();
                fila[3] = r.getDescripcion();
                fila[4] = r.getCategoria();
                fila[5] = r.getPrecio();

                _tablaModel.addRow(fila);

                lista.add(r);
            }

            tabla.setModel(_tablaModel);
            tabla.setRowHeight(35);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return lista;
    }

}
