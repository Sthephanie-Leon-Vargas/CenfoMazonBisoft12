package cenfomazon.Model.Proforma;

import cenfomazon.Creacional.Singleton.Conexion;
import cenfomazon.Model.Usuario.Usuario;
import cenfomazon.UI.TablaUI;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ProformaDAO {

    DefaultTableModel _tablaModel = new DefaultTableModel();

    public void registroProforma(Proforma proforma) {

        Conexion con = new Conexion();
        String sql;
        int pidCliente = proforma.getId_Cliente();
        int pidVendedor = proforma.getId_Vendedor();
        String pestado = "'Nueva'";

        sql = "INSERT INTO jKM_Proformas (id_Cliente,id_Vendedor,estado) VALUES (" + pidCliente + "," + pidVendedor + "," + pestado + ")";
        con.conectarBD("POST", sql);

    }

    public ArrayList<Proforma> listarProforma(JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new TablaUI());
        _tablaModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ArrayList<Proforma> lista = new ArrayList<>();
        Conexion con = new Conexion();
        String sql;
        sql = "SELECT pro.id_Proforma,pro.id_Vendedor, us.nombre, us.apellido1, pro.estado "
            + "FROM  jKM_Proformas pro, jKM_Usuarios us WHERE pro.id_Vendedor=us.id_usuario;";
        con.conectarBD("GET", sql);
        String jsonSql = con.getResponse().body();
      
        _tablaModel.addColumn("Id Proforma");
        _tablaModel.addColumn("Id Vendedor");
        _tablaModel.addColumn("Nombre");
        _tablaModel.addColumn("Apellido 1");
        _tablaModel.addColumn("Estado Proforma");
        _tablaModel.addColumn("Actualizar");
        JButton btnEditar = new JButton("Editar");
        btnEditar.setName("btn_editar");
        try {
            JSONObject jsonResponse = new JSONObject(jsonSql);
            JSONArray jsonArray = jsonResponse.getJSONObject("data").getJSONArray("result");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObj = jsonArray.getJSONObject(i);
                int idProforma = jsonObj.getInt("id_Proforma");
                int idVendedor = jsonObj.getInt("id_Vendedor");
                String nombre = jsonObj.getString("nombre");
                String apellido1 = jsonObj.getString("apellido1");
                String estado = jsonObj.getString("estado");
              
                Usuario user = new Usuario(nombre, apellido1);
                Proforma proforma = new Proforma(idProforma, idVendedor, user, estado);

                Object fila[] = new Object[6];
                fila[0] = proforma.getId_proforma();
                fila[1] = proforma.getId_Vendedor();
                fila[2] = proforma.getUser().getNombre();
                fila[3] = proforma.getUser().getApellido1();
                fila[4] = proforma.getEstado();
                if ("Nueva".equals(proforma.getEstado())) {
                    fila[5] = btnEditar;
                } else {
                    fila[5] = "No Editable";
                }

                _tablaModel.addRow(fila);

                lista.add(proforma);
            }

            tabla.setModel(_tablaModel);
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
