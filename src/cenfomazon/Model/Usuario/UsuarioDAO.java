/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenfomazon.Model.Usuario;

import cenfomazon.Creacional.Singleton.Conexion;


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
}
