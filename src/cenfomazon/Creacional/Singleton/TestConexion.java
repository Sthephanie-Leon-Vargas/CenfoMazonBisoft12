/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cenfomazon.Creacional.Singleton;

/**
 *
 * @author sleon
 */
public class TestConexion {

    /**
     * @param args the command line arguments
     */
    private static Conexion con = new Conexion();

    public static void main(String[] args) {
        System.out.println("Ejecutando GET:");
        String sql = "SELECT * FROM  jKM_Usuarios;";
        con.conectarBD("GET", sql);
        System.out.println("code status: " + con.getCodigoEstado());
        System.out.println("Response body: " + con.getResponse().body());

        System.out.println("Ejecutando POST:");
        sql = "insert into jKM_Usuarios (id_rol,nombre,apellido1,apellido2,telefono,Username,Password) values(1,\"Michael\",\"Ng\",\"Zhao\",\"86276868\",\"mikey\",\"qwerty\");";
        con.conectarBD("POST", sql);
        System.out.println("code status: " + con.getCodigoEstado());
        System.out.println("Response body: " + con.getResponse().body());
    }

}
