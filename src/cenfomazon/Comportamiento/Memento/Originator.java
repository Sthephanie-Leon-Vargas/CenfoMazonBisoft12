package cenfomazon.Comportamiento.Memento;
import cenfomazon.Comportamiento.Memento.auxiliar.Snapshoot;

public class Originator {

    private Snapshoot _Estado;

    public Originator() {
        _Estado = new Snapshoot();
    }

    public String nuevoEstado(int iddetalle,int idproforma, int idrepuesto, int idrazonRechazo, String estado) {
        this._Estado.nuevaInstantanea(iddetalle,idproforma,idrepuesto,idrazonRechazo,estado);

        return "Guardo mi objeto de detallepersona";
    }

    public String obtenerEstado(int pIdx) {
        return null;//this._Estado.obtenerInstantanea().get(pIdx);
    }

    public String obtenerEstado() {
        return "Originador> estado actual [" +
                this._Estado.obtenerInstantanea().get(0) + " ]";

    }
    /*==========================================================================
     *		 Seccion donde usamos el memento.
     ==========================================================================*/

    public void restaurarMemento(Memento m) {
        //this._Estado.nuevaInstantanea(0, 0, 0, 0, estado);
    }

    public Memento crearMemento() {
        return new Memento(Integer.parseInt(this._Estado.obtenerInstantanea().get(0)),Integer.parseInt(this._Estado.obtenerInstantanea().get(1)),Integer.parseInt(this._Estado.obtenerInstantanea().get(2)),Integer.parseInt(this._Estado.obtenerInstantanea().get(3)),this._Estado.obtenerInstantanea().get(4));
    }

}


