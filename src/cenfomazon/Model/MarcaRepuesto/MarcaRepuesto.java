/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenfomazon.Model.MarcaRepuesto;

/**
 *
 * @author rociomontero
 */
public class MarcaRepuesto {
     private int idMarcaRepuesto;
     private String Marca;

    public int getIdMarcaRepuesto() {
        return idMarcaRepuesto;
    }

    public void setIdMarcaRepuesto(int idMarcaRepuesto) {
        this.idMarcaRepuesto = idMarcaRepuesto;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public MarcaRepuesto(int idMarcaRepuesto, String Marca) {
        this.idMarcaRepuesto = idMarcaRepuesto;
        this.Marca = Marca;
    }

    public MarcaRepuesto() {
    }

    public MarcaRepuesto(int idMarcaRepuesto) {
        this.idMarcaRepuesto = idMarcaRepuesto;
    }

    public MarcaRepuesto(String Marca) {
        this.Marca = Marca;
    }

    
        
}
