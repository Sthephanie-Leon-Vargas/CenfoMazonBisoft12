package cenfomazon.Model.Usuario;

import cenfomazon.Creacional.Singleton.Conexion;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class UsuarioDAO {

    public void registroCliente(Usuario usuario) {

        String sql;
        int id_rol = usuario.getRol();
        String nombre = usuario.getNombre();
        String apellido1 = usuario.getApellido1();
        String apellido2 = usuario.getApellido2();
        String telefono = usuario.getTelefono();
        String username = usuario.getUsername();
        String password = usuario.getPassword();

        sql = "insert into jKM_Usuarios (id_rol,nombre,apellido1,apellido2,telefono,username,password) values (2,'" + nombre + "', '" + apellido1 + "', '" + apellido2 + "', '" + telefono + "', '" + username + "', '" + password + "')";

        Conexion con = Conexion.conectarBD("POST", sql);

        con.desconectar();

    }

    public Usuario consultarUsuario(String username, String password) {
        Usuario usuario = new Usuario();

        String sql;

        sql = "select * from jKM_Usuarios WHERE username='" + username + "' && password='" + password + "'";

        Conexion con = Conexion.conectarBD("GET", sql);

        String JsonSql = con.getResponse().body();

        con.desconectar();
        try {
            JSONObject object = new JSONObject(JsonSql);
            JSONArray jsonArray = object.getJSONObject("data").getJSONArray("result");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonobj = jsonArray.getJSONObject(i);
                usuario.setId_usuario(jsonobj.getInt("id_usuario"));
                usuario.setRol(jsonobj.getInt("id_rol"));
                usuario.setNombre(jsonobj.getString("nombre"));
                usuario.setApellido1(jsonobj.getString("apellido1"));
                usuario.setApellido2(jsonobj.getString("apellido2"));
                usuario.setTelefono(jsonobj.getString("telefono"));
                usuario.setUsername(jsonobj.getString("Username"));
                usuario.setPassword(jsonobj.getString("Password"));

            }

        } catch (JSONException e) {
            e.printStackTrace();

        }

        return usuario;
    }

    public ArrayList<Usuario> listarUsuarios() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        String sql;

        sql = "SELECT * FROM `jKM_Usuarios` WHERE id_rol=2";
        Conexion con = Conexion.conectarBD("GET", sql);

        try {
            JSONObject jsonResponse = new JSONObject(con.getResponse().body());
            con.desconectar();
            JSONArray jsonArray = jsonResponse.getJSONObject("data").getJSONArray("result");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonMarca = jsonArray.getJSONObject(i);
                int idusuario = jsonMarca.getInt("id_usuario");
                int idrol = jsonMarca.getInt("id_rol");
                String nombre = jsonMarca.getString("nombre");
                String apellido1 = jsonMarca.getString("apellido1");
                Usuario usuario = new Usuario(idusuario, idrol, nombre, apellido1);
                listaUsuarios.add(usuario);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return listaUsuarios;
    }

    public int vendedorRamdom() {

        String sql;
        int codigo = 1;

        sql = "SELECT id_usuario FROM `jKM_Usuarios` WHERE id_rol=2 ORDER BY RAND() LIMIT 1;";
        Conexion con = Conexion.conectarBD("GET", sql);
        try {
            JSONObject jsonResponse = new JSONObject(con.getResponse().body());
            con.desconectar();
            JSONArray jsonArray = jsonResponse.getJSONObject("data").getJSONArray("result");

            JSONObject jsonMarca = jsonArray.getJSONObject(0);
            int idusuario = jsonMarca.getInt("id_usuario");
            codigo = idusuario;
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return codigo;
    }

}
