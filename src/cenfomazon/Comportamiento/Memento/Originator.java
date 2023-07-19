package cenfomazon.Comportamiento.Memento;
import cenfomazon.Comportamiento.Memento.auxiliar.Snapshoot;

public class Originator {

    private Snapshoot _Estado;

    public Originator() {
        _Estado = new Snapshoot();
    }

    public String nuevoEstado(String estado) {
        this._Estado.nuevaInstantanea(estado);

        return "Originador> nuevo estado [Estado: "+estado+"]";
    }

    public String obtenerEstado(int pIdx) {
        return this._Estado.obtenerInstantanea().get(pIdx);
    }

    public String obtenerEstado() {
        return "Originador> estado actual [" +
                this._Estado.obtenerInstantanea().get(0) + " ]";

    }
    /*==========================================================================
     *						 Seccion donde usamos el memento.
     ==========================================================================*/

    public void restaurarMemento(Memento m) {
        this._Estado.nuevaInstantanea (m.obtenerMemento(0));
    }

    public Memento crearMemento() {
        return new Memento(this._Estado.obtenerInstantanea().get(0));
    }

}


