/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenfomazon.Model.Modelo;

/**
 *
 * @author Daniel Sandoval
 */
public class Modelo {
    public int idModelo;
    public String Modelo;

    public Modelo() {
    }

    public Modelo(int idModelo, String Modelo) {
        this.idModelo = idModelo;
        this.Modelo = Modelo;
    }

    public Modelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public String toString() {
        return "Modelo{" + "idModelo=" + idModelo + ", Modelo=" + Modelo + '}';
    }
    
    
}
