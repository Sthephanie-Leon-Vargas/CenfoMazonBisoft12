package cenfomazon.Comportamiento.Memento.auxiliar;

import cenfomazon.Model.DetalleProforma.DetalleProforma;
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

    public void nuevaInstantanea(int id_detalle,int id_proforma, int id_repuesto, int id_razonRechazo, String estado){
        this._id_detalle = id_detalle;
        this._id_proforma = id_proforma;
        this._id_repuesto = id_repuesto;
        this._id_razonRechazo = id_razonRechazo;
        this._estado = estado;                
    }
    /****************************************************************
     * Metodo:		Obtener Instantanea
     * Descripcion: 	Obtiene los estados guardados de la instantanea
     * 			  	del objeto DetalleProforma.
     * @return ArrayList
     ****************************************************************/
    public ArrayList<String>  obtenerInstantanea(){
        ArrayList<String> snapshoot = new ArrayList<String>();
        snapshoot.add(Integer.toString(this._id_detalle));
        snapshoot.add(Integer.toString(this._id_proforma));
        snapshoot.add(Integer.toString(this._id_repuesto));
        snapshoot.add(Integer.toString(this._id_razonRechazo));
        snapshoot.add(this._estado);                

        return snapshoot;
    }
}
