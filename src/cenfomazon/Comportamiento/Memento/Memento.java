package cenfomazon.Comportamiento.Memento;
import cenfomazon.Model.DetalleProforma.DetalleProforma;

import java.util.ArrayList;

public class Memento {

    private ArrayList<DetalleProforma> detalles;

    public Memento(ArrayList<DetalleProforma> detalles) {
        this.detalles = new ArrayList<>(detalles);
    }

    public ArrayList<DetalleProforma> getDetalles() {
        return new ArrayList<>(detalles);
    }

    public void setDetalles(ArrayList<DetalleProforma> detalles) {
        this.detalles = detalles;
    }
    
    
    
}
