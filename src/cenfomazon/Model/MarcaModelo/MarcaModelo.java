/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenfomazon.Model.MarcaModelo;

import cenfomazon.Model.Marca.Marca;
import cenfomazon.Model.Modelo.Modelo;

/**
 *
 * @author Daniel Sandoval
 */
public class MarcaModelo {
    
    public int id_MarcaModelo;
    public int annno;
    private Marca marca;
    private Modelo modelo;

    public MarcaModelo() {
    }


    public MarcaModelo(int id_MarcaModelo, int annno, Marca marca, Modelo modelo) {
        this.id_MarcaModelo = id_MarcaModelo;
        this.annno = annno;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    

    public int getId_MarcaModelo() {
        return id_MarcaModelo;
    }

    public void setId_MarcaModelo(int id_MarcaModelo) {
        this.id_MarcaModelo = id_MarcaModelo;
    }

    public int getAnnno() {
        return annno;
    }

    public void setAnnno(int annno) {
        this.annno = annno;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

   @Override
    public String toString() {
        return getMarca().getMarca() + "-" + getModelo().getModelo() + "-" + annno  ;
    }
    

    
    

   
    
    
    
}
