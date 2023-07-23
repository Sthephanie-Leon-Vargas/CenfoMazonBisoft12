package cenfomazon;

import cenfomazon.Model.MarcaRepuesto.MarcaRepuesto;
import cenfomazon.Model.MarcaRepuesto.MarcaRepuestoDAO;
import cenfomazon.Model.Proforma.Proforma;
import cenfomazon.Model.Proforma.ProformaDAO;
import cenfomazon.Model.Usuario.Usuario;
import cenfomazon.Model.Usuario.UsuarioDAO;
import cenfomazon.Estructural.Proxy.AccesoReal;
import cenfomazon.Estructural.Proxy.AcessoUsuarioProxy;
import cenfomazon.Estructural.Proxy.InterfaceProxy.Acceso;



import java.util.ArrayList;

import java.util.List;
import java.util.Objects;

public class Gestor {

    private final ProformaDAO proformaDAO;
    private final MarcaRepuestoDAO marcaRepuestoDAO;
    private final UsuarioDAO usuarioDAO;
    private Usuario UsuarioLogin;
    

    

    public Gestor() {
        proformaDAO = new ProformaDAO();
        marcaRepuestoDAO = new MarcaRepuestoDAO();
        usuarioDAO = new UsuarioDAO();
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
    
    public void crearUsuario(Usuario usuario){
        usuarioDAO.registroCliente(usuario);

    }
    
    
    public void  ValidarLogin(String username, String password){
            
        this.UsuarioLogin = usuarioDAO.consultarUsuario(username, password);
             
    }
    
    
    /*Esta seccion es para llevar el objeto a las diferentes partes del programa */
    public Usuario getUsuarioLogin() {
        return UsuarioLogin;
    }

    public Usuario retirarUsuario(String username, String password ){
        return usuarioDAO.consultarUsuario(username, password);
    }
    
    public String darNivelAcceso(Usuario usuario){
    Acceso acceso = new AcessoUsuarioProxy(usuario );
    String nivelAcceso = acceso.analizarNivelAcceso();
    return nivelAcceso;      
    }
}
