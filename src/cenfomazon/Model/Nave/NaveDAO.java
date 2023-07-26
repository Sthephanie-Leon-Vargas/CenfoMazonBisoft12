package cenfomazon.Model.Nave;

import cenfomazon.Creacional.Singleton.Conexion;

import cenfomazon.UI.TablaUI;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import cenfomazon.Model.Nave.NaveDAO;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NaveDAO {


    DefaultTableModel _tablaModel = new DefaultTableModel();

    public ArrayList<Nave> listarProforma(JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new TablaUI());
        _tablaModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ArrayList<Nave> lista = new ArrayList<>();
        Conexion con = new Conexion();
        String sql;
        sql = "select n.id_nave, \n"
                + "	   us.nombre, \n"
                + "	   ca.Categoria, \n"
                + "	   ma.Marca, \n"
                + "	   mo.Modelo, \n"
                + "	   codigo_identificacion,\n"
                + "	   color \n"
                + "from jKM_Naves n, \n"
                + "	 jKM_Usuarios us, \n"
                + "	 jKM_Categoria ca, \n"
                + "	 jKM_MarcaModelo mm, \n"
                + "	 jKM_Marca ma, \n"
                + "	 jKM_Modelo mo \n"
                + "where n.id_usuario=us.id_usuario \n"
                + "	and n.id_Categoria=ca.id_Categoria \n"
                + "	and n.id_MarcaModelo=mm.id_MarcaModelo \n"
                + "	and mm.id_Modelo=mo.idModelo \n"
                + "	and mm.id_Marca=ma.idMarca";
        con.conectarBD("GET", sql);
        String jsonSql = con.getResponse().body();

        _tablaModel.addColumn("Id Nave");
        _tablaModel.addColumn("Nombre Usuario");
        _tablaModel.addColumn("Categoria");
        _tablaModel.addColumn("Marca");
        _tablaModel.addColumn("Modelo");
        _tablaModel.addColumn("Codigo Identificación");
        _tablaModel.addColumn("Color");
        try {
            JSONObject jsonResponse = new JSONObject(jsonSql);
            JSONArray jsonArray = jsonResponse.getJSONObject("data").getJSONArray("result");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObj = jsonArray.getJSONObject(i);
                int idNave = jsonObj.getInt("id_nave");
                String nombre = jsonObj.getString("nombre");
                String marca = jsonObj.getString("Marca");
                String modelo = jsonObj.getString("Modelo");
                String codIdentificacion = jsonObj.getString("codigo_identificacion");
                String color = jsonObj.getString("color");

//              Nave nave= new Nave();

                Object fila[] = new Object[6];
//                fila[0] = proforma.getId_proforma();
//                fila[1] = proforma.getId_Vendedor();
//                fila[2] = proforma.getUser().getNombre();
//                fila[3] = proforma.getUser().getApellido1();
//                fila[4] = proforma.getEstado();
                
                _tablaModel.addRow(fila);

//                lista.add(nave);
            }

            tabla.setModel(_tablaModel);
            tabla.setRowHeight(35);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return lista;

    public void registroNave(Nave nave) {

        Conexion con = new Conexion();
        String sql;
        String codigoIdentificacion = nave.getCodigoIdentificacion();
        int id_MarcaModelo = nave.getMarcamodelo().getId_MarcaModelo();
        int id_categoria = nave.getCategoria().getId_Categoria();
        String color = nave.getColor();

        sql = "insert into jKM_Naves (id_usuario,id_Categoria,id_MarcaModelo,codigo_identificacion,color) \n" +
"values(12,3,2,\"poaoa\",\"blue\");";

        con.conectarBD("POST", sql);
        System.out.println("code status: " + con.getCodigoEstado());
        System.out.println("Response body: " + con.getResponse().body());


    }

}
