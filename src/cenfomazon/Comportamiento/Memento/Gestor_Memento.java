/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenfomazon.Comportamiento.Memento;

import cenfomazon.Comportamiento.Memento.Caretaker;
import cenfomazon.Comportamiento.Memento.Originator;
import cenfomazon.Model.DetalleProforma.DetalleProforma;
import java.util.ArrayList;

public class Gestor_Memento {
        private Originator originator;
        private Caretaker caretaker;
        private ArrayList<DetalleProforma> detalles;

    public Gestor_Memento() {
        originator = new Originator(detalles);
        caretaker = new Caretaker();
    }
        
    public void guardarMemento(ArrayList<DetalleProforma> detalles) {
        //Crea el objeto originador/creador
        originator = new Originator(detalles);
        //Crea el objeto gestor/vigilante del Memento
        caretaker = new Caretaker();
        //Crea el Memento y asocia al objeto gestor
        caretaker.setMemento(originator.createMemento());
       
        //Muestra los datos del creador
        for (int i=0;i < originator.getDetalles().size();i++){
            DetalleProforma DP = originator.getDetalles().get(i);
           
        
        }
        
   
    }
    
    
    
    
    public ArrayList<DetalleProforma> restaurarMemento()    {
        
        originator.setMemento(caretaker.getMemento());
                

        ArrayList<DetalleProforma> detalles = originator.getDetalles();
        for (int i=0;i < originator.getDetalles().size();i++){
            DetalleProforma DP = originator.getDetalles().get(i);
            System.out.println(DP.toString());
        
        }
    return detalles;    
    }

}
