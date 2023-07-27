package cenfomazon.Model.Nave;

import cenfomazon.Creacional.Singleton.Conexion;
import cenfomazon.Model.Categoria.Categoria;
import cenfomazon.Model.Marca.Marca;
import cenfomazon.Model.MarcaModelo.MarcaModelo;
import cenfomazon.Model.Modelo.Modelo;

import cenfomazon.UI.TablaUI;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import cenfomazon.Model.Nave.NaveDAO;

import cenfomazon.UI.Login;

import cenfomazon.Model.Usuario.Usuario;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NaveDAO {

    DefaultTableModel _tablaModel = new DefaultTableModel();

    public ArrayList<Nave> listarNaves(JTable tabla, int rol, int idUsuario) {
        tabla.setDefaultRenderer(Object.class, new TablaUI());
        _tablaModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ArrayList<Nave> lista = new ArrayList<>();
        String sql = "";
        if (idUsuario != 0) {
            switch (rol) {
                case 1:
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
                    break;
                case 2:
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
                            + "	and mm.id_Marca=ma.idMarca and us.id_rol=2  and us.id_usuario=" + idUsuario;
                    break;

            }
            Conexion con = Conexion.conectarBD("GET", sql);
            String jsonSql = con.getResponse().body();
            con.desconectar();
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
                    String categoria = jsonObj.getString("Categoria");
                    String marca = jsonObj.getString("Marca");
                    String modelo = jsonObj.getString("Modelo");
                    String codIdentificacion = jsonObj.getString("codigo_identificacion");
                    String color = jsonObj.getString("color");

                    Usuario us = new Usuario(nombre);
                    Categoria ca = new Categoria(categoria);
                    Marca mar = new Marca(marca);
                    Modelo mo = new Modelo(modelo);
                    MarcaModelo ma = new MarcaModelo(mar, mo);
                    Nave nave = new Nave(idNave, codIdentificacion, color, ma, ca, us);

                    Object fila[] = new Object[7];
                    fila[0] = nave.getId_nave();
                    fila[1] = nave.getUs().getNombre();
                    fila[2] = nave.getCategoria().getCategoria();
                    fila[3] = nave.getMarcamodelo().getMarca().getMarca();
                    fila[4] = nave.getMarcamodelo().getModelo().getModelo();
                    fila[5] = nave.getCodigoIdentificacion();
                    fila[6] = nave.getColor();
                    _tablaModel.addRow(fila);
                    lista.add(nave);
                }
                tabla.setModel(_tablaModel);
                tabla.setRowHeight(35);

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return lista;
    }

    public void registroNave(Nave nave) {
        String sql;
        String codigoIdentificacion = nave.getCodigoIdentificacion();
        int id_MarcaModelo = nave.getMarcamodelo().getId_MarcaModelo();
        int id_categoria = nave.getCategoria().getId_Categoria();
        String color = nave.getColor();
        int Id_usuario = Login.getusuario().getId_usuario();

        sql = "insert into jKM_Naves (id_usuario,id_Categoria,id_MarcaModelo,codigo_identificacion,color) "
                + "values(" + Id_usuario + "," + id_categoria + "," + id_MarcaModelo + ",'" + codigoIdentificacion + "','" + color + "')";

        Conexion con = Conexion.conectarBD("POST", sql);
        con.desconectar();

    }

}
