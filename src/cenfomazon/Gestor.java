package cenfomazon;

import cenfomazon.Estructural.PesoLigero.Extrinseco.Repuesto;
import cenfomazon.Model.MarcaRepuesto.MarcaRepuesto;
import cenfomazon.Model.MarcaRepuesto.MarcaRepuestoDAO;
import cenfomazon.Model.Proforma.Proforma;
import cenfomazon.Model.Proforma.ProformaDAO;
import cenfomazon.Model.Repuesto.RepuestoC;
import cenfomazon.Model.Repuesto.RepuestoDAO;
import cenfomazon.Model.Usuario.Usuario;
import cenfomazon.Model.Usuario.UsuarioDAO;
import cenfomazon.Model.Repuesto.RepuestoC;
import cenfomazon.Model.Repuesto.RepuestoDAO;
import cenfomazon.Model.TipoRepuesto.TipoRepuesto;
import cenfomazon.Model.TipoRepuesto.TipoRepuestoDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Gestor {

    private final ProformaDAO proformaDAO;
    private final MarcaRepuestoDAO marcaRepuestoDAO;
    private final RepuestoDAO repuestoDAO;
    private final UsuarioDAO usuarioDAO;
    private final TipoRepuestoDAO tipoRepuestoDAO;


    

    public Gestor() {
        proformaDAO = new ProformaDAO();
        marcaRepuestoDAO = new MarcaRepuestoDAO();
        repuestoDAO = new RepuestoDAO();
        usuarioDAO = new UsuarioDAO();
        tipoRepuestoDAO = new TipoRepuestoDAO();

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

    public void crearUsuario(Usuario usuario){
        usuarioDAO.registroCliente(usuario);

    }
    
    public ArrayList<Usuario> listarVendedor(){
        ArrayList<Usuario> listaVendedor = new ArrayList<>();
        listaVendedor = usuarioDAO.listarUsuarios();
        return listaVendedor;
    }
    
    
    public ArrayList<RepuestoC> listarRepuestos(int idMarcaRepuesto){
        ArrayList<RepuestoC> listaRepuestos = new ArrayList<>();
        listaRepuestos = repuestoDAO.listarRepuesto(idMarcaRepuesto);
        return listaRepuestos;
    }

    public ArrayList<TipoRepuesto> listarTipoRepuestos(){
        return tipoRepuestoDAO.listarTiposR();
    }

    public void crearRepuesto(Repuesto repuesto) {
        repuestoDAO.registroRepuesto(repuesto);
    }
}
