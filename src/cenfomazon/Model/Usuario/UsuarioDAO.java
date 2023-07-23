/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenfomazon.Model.Usuario;

import cenfomazon.Creacional.Singleton.Conexion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 *
 * @author Daniel Sandoval
 */
public class UsuarioDAO {
    
    public void registroCliente (Usuario usuario){

        Conexion con = new Conexion();
        String sql;
        int id_rol = usuario.getRol();
        String nombre = usuario.getNombre();
        String apellido1 = usuario.getApellido1();
        String apellido2 = usuario.getApellido2();
        String telefono = usuario.getTelefono();
        String username = usuario.getUsername();
        String password = usuario.getPassword();

        sql = "insert into jKM_Usuarios (id_rol,nombre,apellido1,apellido2,telefono,username,password) values (2,'"+nombre+"', '"+apellido1+"', '"+apellido2+"', '"+telefono+"', '"+username+"', '"+password+"')";

        con.conectarBD("POST", sql);
        System.out.println("code status: " + con.getCodigoEstado());
        System.out.println("Response body: " + con.getResponse().body());

    }
    
    
   
        public Usuario consultarUsuario(String username, String password) {
            Usuario usuario = new Usuario(); 
        Conexion con = new Conexion();
        String sql;
       
        sql = "select * from jKM_Usuarios WHERE username='"+username+"' && password='"+password+"'";

        con.conectarBD("GET", sql);
        System.out.println("code status: " + con.getCodigoEstado());
        String JsonSql = con.getResponse().body();
        System.out.println("Response body: " + con.getResponse().body());
        
       try{
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

        }catch(JSONException e){
            e.printStackTrace();
            
        }
        
        return usuario;
        }
        
    
}
