import cenfomazon.Comportamiento.Memento.Gestor_Memento;
import cenfomazon.Estructural.PesoLigero.Extrinseco.Repuesto;
import cenfomazon.Gestor;
import cenfomazon.Model.DetalleProforma.DetalleProforma;
import cenfomazon.Model.Proforma.Proforma;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gestor gestor = new Gestor();

        //Proforma proforma = new Proforma (1,1,"Nueva");
       // gestor.crearProforma(proforma);
       
       //gestor.listaMarcaR();
        //gestor.listarProformas();
        
        DetalleProforma dp1 = new DetalleProforma(1,1,1,1,"Pendiente");
        DetalleProforma dp2 = new DetalleProforma(2,2,2,2,"Pendiente");
        DetalleProforma dp3 = new DetalleProforma(3,3,3,3,"Pendiente");
        
        ArrayList<DetalleProforma> LDP = new ArrayList<DetalleProforma>();
            LDP.add(dp1);
            LDP.add(dp2);
            LDP.add(dp3);
            
        Gestor_Memento gestorM = new Gestor_Memento();
        gestorM.actualizarDetalleProforma();

    }
}
