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

   public void listarRepuestosTabla(JTable tabla) {
       tabla.setDefaultRenderer(Object.class, new TablaUI());
               _tablaModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //ArrayList<Repuesto> lista = new ArrayList<>();
        Conexion con = new Conexion();
        String sql;
        sql = "select R.id_Repuesto, R.nombre, R.descripcion, R.categoria, TR.Tipo, MR.Marca, \n" +
              "R.precio from jKM_Repuestos as R \n" +
              "INNER JOIN jKM_TipoRepuesto as TR ON R.id_TipoRepuesto = TR.idTipoRepuesto \n" +
              "INNER JOIN jKM_MarcaRespuesto as MR on R.id_MarcaRespuesto = MR.idMarcaRespuesto";
        con.conectarBD("GET", sql);
        String jsonSql = con.getResponse().body();
        
        _tablaModel.addColumn("Id Repuesto");
        _tablaModel.addColumn("Nombre");
        _tablaModel.addColumn("Descripcion");
        _tablaModel.addColumn("Categoria");
        _tablaModel.addColumn("Tipo Repuesto");
        _tablaModel.addColumn("Marca Repuesto");
        _tablaModel.addColumn("Precio");
        
        try {
           JSONObject jsonResponse = new JSONObject(jsonSql);
           JSONArray jsonArray = jsonResponse.getJSONObject("data").getJSONArray("result");
           for (int i = 0; i < jsonArray.length(); i++) {
               JSONObject jsonObj = jsonArray.getJSONObject(i);
               int idRepuesto = jsonObj.getInt("id_Repuesto");
               String nombre = jsonObj.getString("nombre");
               String descripcion = jsonObj.getString("descripcion");
               String categoria = jsonObj.getString("categoria");
               String tipoRepuesto = jsonObj.getString("Tipo");
               String marcaRepuesto = jsonObj.getString("Marca");
               double precio = jsonObj.getDouble("precio");
               
               Object fila[] = new Object[7];
               fila[0] = idRepuesto;
               fila[1] = nombre;
               fila[2] = descripcion;
               fila[3] = categoria;
               fila[4] = tipoRepuesto;
               fila[5] = marcaRepuesto;
               fila[6] = precio;
               
               _tablaModel.addRow(fila);
           }
           tabla.setModel(_tablaModel);
           tabla.setRowHeight(35);
           
       } catch (JSONException e) {
           e.printStackTrace();
       }
   }

}
