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
        System.out.println("Se crea el memento y se muestra");
        //Muestra los datos del creador
        for (int i=0;i < originator.getDetalles().size();i++){
            DetalleProforma DP = originator.getDetalles().get(i);
            System.out.println(DP.toString());
        
        }
        
        /*===========================
        System.out.println("Se modifican los datos y se muestra");
        // Agrego datos nuevos
        detalles.add(new DetalleProforma(1,1,1,"Nueva3"));
        
        //Muestro los datos del creador de nuevo
            for (int i=0;i < creador.getDetalles().size();i++){
                DetalleProforma DP = creador.getDetalles().get(i);
                System.out.println(DP.toString());
        
             }
        //Restauro el memento
        System.out.println("Se restaura el objeto inicial");
        creador.setMemento(vigilante.getMemento());
        
       
        //Muestro los datos del creador de restaurados
                for (int i=0;i < creador.getDetalles().size();i++){
            DetalleProforma DP = creador.getDetalles().get(i);
            System.out.println(DP.toString());
        
        }*/
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
