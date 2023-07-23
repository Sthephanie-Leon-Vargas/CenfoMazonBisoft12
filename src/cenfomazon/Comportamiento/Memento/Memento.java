package cenfomazon.Comportamiento.Memento;
import cenfomazon.Comportamiento.Memento.auxiliar.Snapshoot;
import cenfomazon.Model.DetalleProforma.DetalleProforma;

import java.util.ArrayList;

public class Memento {

    private Snapshoot _Snapshoot;
    
    /******************************************
     * Metodo: get_Snapshoot;
     * Obtener la instancia de _Snapshoot
     ******************************************/
   
    private Snapshoot getSnapshoot(){
        return _Snapshoot;
    }
     /**********************************************************************
     * Metodo: Constructor;
     * Constructor con parametros, crea una instancia nueva de _Snapchoot
     ***********************************************************************/
    
   public Memento(int id_detalle,int id_proforma, int id_repuesto, int id_razonRechazo, String estado){
     this._Snapshoot = new Snapshoot();
     this.getSnapshoot().nuevaInstantanea(id_detalle,id_proforma,id_repuesto,id_razonRechazo,estado);
   
   }
   
     /**********************************************************************
     * Metodo: obtener_Memento;
     * Obtiene un arraylist de objetos con el memento guardado
     ***********************************************************************/
    public ArrayList<String> obtenerMementoLista(){
       return _Snapshoot.obtenerInstantanea();
    }
    
    
    
}
