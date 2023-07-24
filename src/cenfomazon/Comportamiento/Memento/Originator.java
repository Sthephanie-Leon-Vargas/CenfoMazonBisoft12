package cenfomazon.Comportamiento.Memento;
import cenfomazon.Model.DetalleProforma.DetalleProforma;
import java.util.ArrayList;

public class Originator {

    private ArrayList<DetalleProforma> detalles;

 
    public Originator(ArrayList<DetalleProforma> pdetalles) {
        this.detalles = pdetalles;
    }
   
    public void setMemento(Memento m) {
        this.detalles = m.getDetalles();
    }
  
    public Memento createMemento(){
        return new Memento(detalles);
    }

    public ArrayList<DetalleProforma> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<DetalleProforma> detalles) {
        this.detalles = detalles;
    }
    

}
    
    


