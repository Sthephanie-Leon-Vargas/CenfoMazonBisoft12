package cenfomazon;

import cenfomazon.Model.MarcaRepuesto.MarcaRepuesto;
import cenfomazon.Model.MarcaRepuesto.MarcaRepuestoDAO;
import cenfomazon.Model.Proforma.Proforma;
import cenfomazon.Model.Proforma.ProformaDAO;
import cenfomazon.Model.Repuesto.RepuestoC;
import cenfomazon.Model.Repuesto.RepuestoDAO;
import cenfomazon.Model.Vendedor.Vendedor;
import java.util.ArrayList;

import java.util.List;
import java.util.Objects;

public class Gestor {

    private final ProformaDAO proformaDAO;
    private final MarcaRepuestoDAO marcaRepuestoDAO;
    private final RepuestoDAO repuestoDAO;
  

    public Gestor() {
        proformaDAO = new ProformaDAO();
        marcaRepuestoDAO = new MarcaRepuestoDAO();
        repuestoDAO = new RepuestoDAO();

    }

    public void crearProforma(Proforma proforma){

        if (Objects.equals(proforma.getId_Vendedor(), null)){
            System.out.println(("Aqui falta formula ramdom de vendedor"));
            proforma.setId_Vendedor(1);
        }
        proformaDAO.registroProforma(proforma);

    }

    public List<Proforma> listarProformas(){

        //return proformaDAO.listarProformas();
        return null;
    }
    
    
    public ArrayList<MarcaRepuesto> listaMarcaR(){
        ArrayList<MarcaRepuesto> listaMarcaR = new ArrayList<>();
        listaMarcaR= marcaRepuestoDAO.listarMarca();
        return listaMarcaR;
    }
    
    
     public ArrayList<RepuestoC> listaRepuesto(){
        ArrayList<RepuestoC> listaRepuestos = new ArrayList<>();
        
        listaRepuestos= repuestoDAO.listarRepuesto(1);
        return listaRepuestos;
    }
     
     

}
