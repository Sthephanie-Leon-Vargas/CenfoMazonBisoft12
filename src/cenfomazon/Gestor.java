package cenfomazon;


import cenfomazon.Model.DetalleProforma.DetalleProforma;
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
import cenfomazon.Model.DetalleProforma.DetalleProformaDAO;
import cenfomazon.Model.TipoRepuesto.TipoRepuesto;
import cenfomazon.Model.TipoRepuesto.TipoRepuestoDAO;

import java.util.ArrayList;
import java.util.List;


public class Gestor {

    private final ProformaDAO proformaDAO;
    private final MarcaRepuestoDAO marcaRepuestoDAO;
    private final RepuestoDAO repuestoDAO;
    private final UsuarioDAO usuarioDAO;
    private final DetalleProformaDAO detalleproformaDAO;
    private final TipoRepuestoDAO tipoRepuestoDAO;



    

    public Gestor() {
        proformaDAO = new ProformaDAO();
        marcaRepuestoDAO = new MarcaRepuestoDAO();
        repuestoDAO = new RepuestoDAO();
        usuarioDAO = new UsuarioDAO();
        detalleproformaDAO = new DetalleProformaDAO();
        tipoRepuestoDAO = new TipoRepuestoDAO();


    }

    public void crearProforma(Proforma proforma){
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

    public void crearUsuario(Usuario usuario){
        usuarioDAO.registroCliente(usuario);

    }
    
    public ArrayList<Usuario> listarVendedor(){
        ArrayList<Usuario> listaVendedor = new ArrayList<>();
        listaVendedor = usuarioDAO.listarUsuarios();
        return listaVendedor;
    }
    
    
    public ArrayList<RepuestoC> listarRepuestos(int codigo){
        ArrayList<RepuestoC> listaRepuestos = new ArrayList<>();
        listaRepuestos = repuestoDAO.listarRepuestos(codigo);
        return listaRepuestos;
    }

    
    public int codigoVendedor (){
        return usuarioDAO.vendedorRamdom();
    }
    
    public int codigoProfroma(){
        return proformaDAO.ultimaProforma();
    }
    
    public void registrarDetalleProforma(DetalleProforma  detalleProforma){
        detalleproformaDAO.registroDetalleProforma(detalleProforma);


    public ArrayList<TipoRepuesto> listarTipoRepuestos(){
        return tipoRepuestoDAO.listarTiposR();
    }

    public void crearRepuesto(Repuesto repuesto) {
        repuestoDAO.registroRepuesto(repuesto);

    }
}
