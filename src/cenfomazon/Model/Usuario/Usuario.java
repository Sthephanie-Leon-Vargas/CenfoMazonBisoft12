/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenfomazon.Model.Usuario;

import cenfomazon.Model.Nave.Nave;
import java.util.ArrayList;

/**
 *
 * @author Daniel Sandoval
 */
public class Usuario {
      private int id_usuario;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String username;
    private String password;
    private int rol;
    private ArrayList<Nave> listaNaves;


    public Usuario() {
    }

    public void UsuarioCliente(int id_usuario, String nombre, String apellido1, String apellido2, String telefono, String username, String password, int rol, ArrayList<Nave> listaNaves) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.username = username;
        this.password = password;
        this.rol = rol;
        this.listaNaves = listaNaves;
    }


    public void UsuarioVendedor(int id_usuario, String nombre, String apellido1, String apellido2, String telefono, String username, String password, int rol) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.username = username;
        this.password = password;
        this.rol = rol;
    }

    public Usuario(int id_usuario,int rol, String nombre, String apellido1) {
        this.id_usuario = id_usuario;
        this.rol = rol;
        this.nombre = nombre;
        this.apellido1 = apellido1;
    }
    
    

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Nave> getListaNaves() {
        return listaNaves;
    }

    public void setListaNaves(ArrayList<Nave> listaNaves) {
        this.listaNaves = listaNaves;
    }

    @Override
    public String toString() {
        return  this.nombre + ' ' + this.apellido1 ;
               
             
    }

}
