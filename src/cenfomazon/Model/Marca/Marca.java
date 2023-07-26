/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenfomazon.Model.Marca;

/**
 *
 * @author Daniel Sandoval
 */
public class Marca {
    
    public int idMarca;
    public String Marca;

    public Marca() {
    }

    public Marca(int idMarca, String Marca) {
        this.idMarca = idMarca;
        this.Marca = Marca;
    }

    public Marca(String Marca) {
        this.Marca = Marca;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    @Override
    public String toString() {
        return "Marca{" + "idMarca=" + idMarca + ", Marca=" + Marca + '}';
    }
    
    
    
}
