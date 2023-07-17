package cenfomazon.Comportamiento.Memento;
import cenfomazon.Comportamiento.Memento.auxiliar.Snapshoot;

import java.util.ArrayList;

public class Memento {

    private Snapshoot _Snapshoot;
    /****************************************************************
     * Metodo:		get_Snapshoot
     * Descripcion: Obtener la instancia de  _Snapshoot
     ****************************************************************/
    private Snapshoot get_Snapshoot() {
        return _Snapshoot;
    }
    /****************************************************************
     * Metodo:		Constructor
 	 * Descripcion: 	Constructor con parametros, crea una instancia
	 * 				nueva de _Snapshoot.
 	 *
    ****************************************************************/
    public Memento(String pestado) {
        this._Snapshoot = new Snapshoot();
        this.get_Snapshoot().nuevaInstantanea(pestado);
    }
    /****************************************************************
     * Metodo:		obtener Memento
     * Descripcion: 	Obtiene un arraylist con el memento guardado
     *
     * @return _Snapshoot [ArrayList<String>]
     *****************************************************************/
    public ArrayList<String> obtenerMemento() {
        return _Snapshoot.obtenerInstantanea();
    }

    /****************************************************************
     * Metodo:		obtener Memento
     * Descripcion: 	Obtiene un valor especifico del venctor que
     * 				contiene con el memento guardado
     *
     * @param	pIndex [int]
     * @return 	_Snapshoot [ArrayList<String>]
     *****************************************************************/
    public String obtenerMemento(int pIndex) {
        return _Snapshoot.obtenerInstantanea().get(pIndex);
    }


}
