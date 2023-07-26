package cenfomazon.Model.Nave;

import cenfomazon.Model.Categoria.Categoria;
import cenfomazon.Model.MarcaModelo.MarcaModelo;
import cenfomazon.Model.Usuario.Usuario;

public class Nave {
    private int id_nave;
    private int id_usuario;
 
    private String codigoIdentificacion;
    private String color;
    
    private MarcaModelo marcamodelo;
    private Categoria categoria;
    
    private Usuario us;

    public Nave() {
    }

    public Nave(String codigoIdentificacion, String color, MarcaModelo marcamodelo, Categoria categoria) {
        this.codigoIdentificacion = codigoIdentificacion;
        this.color = color;
        this.marcamodelo = marcamodelo;
        this.categoria = categoria;
    }

    
        public Nave(int idNave,String codigoIdentificacion, String color, MarcaModelo marca, Categoria categoria, Usuario us) {
        this.id_nave = idNave;
        this.codigoIdentificacion = codigoIdentificacion;
        this.color = color;
        this.marcamodelo = marca;
        this.categoria = categoria;
        this.us = us;
    }

    
    public Nave(String codigoIdentificacion, String color) {
       
        this.codigoIdentificacion = codigoIdentificacion;
        this.color = color;
    }

  
    
    
    public Nave(int id_nave, int id_usuario, String codigoIdentificacion, String color) {
        this.id_nave = id_nave;
        this.id_usuario = id_usuario;
        this.codigoIdentificacion = codigoIdentificacion;
        this.color = color;
    }

   

    public int getId_nave() {
        return id_nave;
    }

    public void setId_nave(int id_nave) {
        this.id_nave = id_nave;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }


    public String getCodigoIdentificacion() {
        return codigoIdentificacion;
    }

    public void setCodigoIdentificacion(String codigoIdentificacion) {
        this.codigoIdentificacion = codigoIdentificacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public MarcaModelo getMarcamodelo() {
        return marcamodelo;
    }

    public void setMarcamodelo(MarcaModelo marcamodelo) {
        this.marcamodelo = marcamodelo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }
    
    

    @Override
    public String toString() {
        return "Nave{" +
                "id_nave=" + id_nave +
                ", id_usuario=" + id_usuario +
                ", codigoIdentificacion='" + codigoIdentificacion + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
