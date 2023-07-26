package cenfomazon.Model.Nave;

import cenfomazon.Creacional.Singleton.Conexion;
import cenfomazon.Model.Nave.NaveDAO;
import cenfomazon.UI.Login;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NaveDAO {

    public void registroNave(Nave nave) {

        Conexion con = new Conexion();
        String sql;
        String codigoIdentificacion = nave.getCodigoIdentificacion();
        int id_MarcaModelo = nave.getMarcamodelo().getId_MarcaModelo();
        int id_categoria = nave.getCategoria().getId_Categoria();
        String color = nave.getColor();
        int Id_usuario = Login.getusuario().getId_usuario();

        sql = "insert into jKM_Naves (id_usuario,id_Categoria,id_MarcaModelo,codigo_identificacion,color) "
                + "values("+Id_usuario+","+id_categoria+","+id_MarcaModelo+",'"+codigoIdentificacion+"','"+color+"')";

        con.conectarBD("POST", sql);
        System.out.println("code status: " + con.getCodigoEstado());
        System.out.println("Response body: " + con.getResponse().body());

    }

}
