/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenfomazon.Model.Categoria;

/**
 *
 * @author Daniel Sandoval
 */
public class Categoria {
    
    public int id_Categoria;
    public String Categoria; 

    public Categoria() {
    }

    public Categoria(int id_Categoria, String Categoria) {
        this.id_Categoria = id_Categoria;
        this.Categoria = Categoria;
    }

    public Categoria(int id_Categoria) {
        this.id_Categoria = id_Categoria;
    }

    

    public int getId_Categoria() {
        return id_Categoria;
    }

    public void setId_Categoria(int id_Categoria) {
        this.id_Categoria = id_Categoria;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    @Override
    public String toString() {
        return getCategoria();
    }
    
    
    
}
