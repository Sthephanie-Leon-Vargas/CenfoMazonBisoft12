package cenfomazon;

import cenfomazon.Model.MarcaRepuesto.MarcaRepuesto;
import cenfomazon.Model.MarcaRepuesto.MarcaRepuestoDAO;
import cenfomazon.Model.Proforma.Proforma;
import cenfomazon.Model.Proforma.ProformaDAO;
import java.util.ArrayList;

import java.util.List;
import java.util.Objects;

public class Gestor {

    private final ProformaDAO proformaDAO;
    private final MarcaRepuestoDAO marcaRepuestoDAO;
    

    public Gestor() {
        proformaDAO = new ProformaDAO();
        marcaRepuestoDAO = new MarcaRepuestoDAO();
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

}
