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

    private DetalleProforma _DetalleProforma;
    private Originator _Creador;
    private Caretaker _Vigilante;
    
    public Gestor_Memento(){
        this._Creador = new Originator();
        this._Vigilante = new Caretaker();
    
    }
    
public String nuevaDetalle(ArrayList<DetalleProforma> objetosDetalle){
    for (int i=0; i <objetosDetalle.size() ;i++) {
        DetalleProforma dp = objetosDetalle.get(i);
        System.out.println(dp.toString());
        this._DetalleProforma = new DetalleProforma(dp.get_id_detalle(),dp.get_id_proforma(),dp.get_id_repuesto(),dp.get_id_razonRechazo(),dp.get_estado());
        
        _Creador.nuevoEstado(dp.get_id_detalle(),dp.get_id_proforma(),dp.get_id_repuesto(),dp.get_id_razonRechazo(),dp.get_estado());
        
        
    }
    return "El objeto DetalleProforma fie instanciada y 'mementada'";
}


/*========SECCION DONDE USAMOS EL MEMENTO============*/


    public String actualizarDetalleProforma(){


        Actualizar_Memento();
        
    return "Memento Actualizado";
    }

    private void Actualizar_Memento(){
      _Vigilante.setMemento(_Creador.crearMemento());
    }


    public void Restaurar_Memento(){
        _Creador.restaurarMemento(_Vigilante.getMemento());
    }
}
