package cenfomazon.Model.Cliente;

import cenfomazon.Model.Nave.Nave;

import java.util.ArrayList;

public class Cliente {

    private int id_usuario;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String rol;
    private ArrayList<Nave> listaNaves;

    public Cliente(int id_usuario, String nombre, String apellido1, String apellido2, String telefono, String rol, ArrayList<Nave> listaNaves) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.rol = rol;
        this.listaNaves = new ArrayList<Nave>();
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public ArrayList<Nave> getListaNaves() {
        return listaNaves;
    }

    public void setListaNaves(ArrayList<Nave> listaNaves) {
        this.listaNaves = listaNaves;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id_usuario=" + id_usuario +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", telefono='" + telefono + '\'' +
                ", rol='" + rol + '\'' +
                ", listaNaves=" + listaNaves +
                '}';
    }
}
