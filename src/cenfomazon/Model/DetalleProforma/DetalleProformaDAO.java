package cenfomazon.Model.DetalleProforma;

import cenfomazon.Creacional.Singleton.Conexion;
import cenfomazon.Model.MarcaRepuesto.MarcaRepuesto;
import cenfomazon.Model.Repuesto.RepuestoC;
import cenfomazon.UI.TablaUI;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DetalleProformaDAO {

    DefaultTableModel _tablaModel = new DefaultTableModel();

    public void registroDetalleProforma(DetalleProforma detalleProforma) {
        Conexion con = new Conexion();
        String sql;

        int pidproforma = detalleProforma.get_id_proforma();
        int prepuesto = detalleProforma.get_id_repuesto();
        int prazonrechazo = 3;
        String pestado = "'Pendiente'";

        sql = "INSERT INTO jKM_DetalleProforma (id_proforma,id_repuesto,id_razonRechazo,estado) VALUES (" + pidproforma + "," + prepuesto + "," + prazonrechazo + "," + pestado + ")";
        con.conectarBD("POST", sql);

    }

    //Listar los detalle proforma
    public ArrayList<DetalleProforma> listarDetalleProformas(JTable tabla,
            int idProforma) {
        tabla.setDefaultRenderer(Object.class, new TablaUI());
        _tablaModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ArrayList<DetalleProforma> lista = new ArrayList<>();
        Conexion con = new Conexion();
        String sql;
        sql = "SELECT r.id_Repuesto,dp.id_detalle, \n"
                + "		r.nombre as nombre_repuesto, \n"
                + "		mr.Marca, mr.idMarcaRespuesto,\n"
                + "		r.precio \n"
                + "FROM 	jKM_DetalleProforma dp, \n"
                + "		jKM_Repuestos r, \n"
                + "		jKM_TipoRepuesto tr, \n"
                + "		jKM_MarcaRespuesto mr,\n"
                + "		jKM_Proformas p		\n"
                + "where \n"
                + "	dp.id_proforma	= p.id_proforma\n"
                + "	and dp.id_repuesto=dp.id_Repuesto  \n"
                + "	and dp.id_repuesto=r.id_Repuesto\n"
                + "	and r.id_TipoRepuesto=tr.idTipoRepuesto \n"
                + "	and r.id_MarcaRespuesto=mr.idMarcaRespuesto\n"
                + "	and dp.id_proforma=" + idProforma + ";";
        con.conectarBD("GET", sql);
        String jsonSql = con.getResponse().body();

        _tablaModel.addColumn("Id Detalle");
        _tablaModel.addColumn("Nombre Repuesto");
        _tablaModel.addColumn("Marca");
        _tablaModel.addColumn("precio");
        _tablaModel.addColumn("Id Repuesto");
        System.out.println(sql);
        try {
            JSONObject jsonResponse = new JSONObject(jsonSql);
            JSONArray jsonArray = jsonResponse.getJSONObject("data").getJSONArray("result");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObj = jsonArray.getJSONObject(i);
                int idRepuesto = jsonObj.getInt("id_Repuesto");
                int idDetalle = jsonObj.getInt("id_detalle");
                String nombre = jsonObj.getString("nombre_repuesto");
                String marca = jsonObj.getString("Marca");
                int idMarcaRepuesto = jsonObj.getInt("idMarcaRespuesto");
                double precio = jsonObj.getDouble("precio");
                MarcaRepuesto marcaO = new MarcaRepuesto(idMarcaRepuesto,marca);
                RepuestoC repuesto = new RepuestoC(idRepuesto, nombre, idMarcaRepuesto,marcaO,precio);

                DetalleProforma dp = new DetalleProforma(idDetalle, repuesto);

                Object fila[] = new Object[5];
                fila[0] = dp.get_id_detalle();
                fila[1] = dp.getRepuesto().getNombre();
                fila[2] = dp.getRepuesto().getMarcaNombre().getMarca();
                fila[3] = dp.getRepuesto().getPrecio();
                fila[4] = dp.getRepuesto().getIdRepuesto();
                

                _tablaModel.addRow(fila);

                lista.add(dp);
            }

            tabla.setModel(_tablaModel);
            tabla.setRowHeight(35);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    
    public ArrayList<DetalleProforma> listarDetalleProformasRaw(int codigo){
    ArrayList<DetalleProforma> lp = new ArrayList<>();
        Conexion con = new Conexion();
        String sql;

        sql = "SELECT * FROM `jKM_DetalleProforma` WHERE id_proforma=" + codigo + "";

        con.conectarBD("GET", sql);

        

        try {
            JSONObject jsonResponse = new JSONObject(con.getResponse().body());
            JSONArray jsonArray = jsonResponse.getJSONObject("data").getJSONArray("result");

                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonMarca = jsonArray.getJSONObject(i);
                    int idRepuesto = jsonMarca.getInt("id_detalle");
                    int idProforma = jsonMarca.getInt("id_proforma");
                    int idRepuestos = jsonMarca.getInt("id_repuesto");
                    int idRazon = jsonMarca.getInt("id_razonRechazo");
                    String pestado = jsonMarca.getString("estado");
                    DetalleProforma dp = new DetalleProforma(idRepuesto,idProforma,idRepuestos,idRazon,pestado);
                    lp.add(dp);
                }
             
            } catch (JSONException e) {
                e.printStackTrace();
        }      
        return  lp;
    }
    
    
    public void borrarDatos(int idProforma) {
        Conexion con = new Conexion();
        String sql;

        sql = "DELETE FROM `jKM_DetalleProforma` WHERE id_proforma=" + idProforma + "";

        con.conectarBD("GET", sql);

        
    }
    
}
