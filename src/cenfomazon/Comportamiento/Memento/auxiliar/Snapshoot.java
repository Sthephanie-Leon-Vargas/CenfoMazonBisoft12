package cenfomazon.Comportamiento.Memento.auxiliar;

import java.util.ArrayList;

public class Snapshoot {

    private int _id_detalle,_id_proforma,_id_repuesto,_id_razonRechazo;
    private  String _estado;
    /**************************************************************
     * Metodo:		Nueva Instantanea
     * Descripcion: Guarda el estado actual de la instantanea del
     *			    objeto DetalleProforma.
     *
    /**************************************************************/

    public void nuevaInstantanea(String _estado){

        this._estado = _estado;
    }
    /****************************************************************
     * Metodo:		Obtener Instantanea
     * Descripcion: 	Obtiene los estados guardados de la instantanea
     * 			  	del objeto DetalleProforma.
     * @return objeto
     ****************************************************************/
    public ArrayList<String>  obtenerInstantanea(){
        ArrayList<String> snapshoot = new ArrayList<String>();
        snapshoot.add(this._estado);
        return snapshoot;
    }
}
