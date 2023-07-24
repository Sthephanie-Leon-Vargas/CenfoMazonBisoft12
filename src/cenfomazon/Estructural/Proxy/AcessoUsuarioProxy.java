/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cenfomazon.Estructural.Proxy;

import cenfomazon.Estructural.Proxy.InterfaceProxy.Acceso;
import cenfomazon.Estructural.Proxy.AccesoReal;
import cenfomazon.Model.Usuario.Usuario;
import cenfomazon.Model.Usuario.UsuarioDAO;



/**
 *
 * @author Daniel Sandoval
 */
public class AcessoUsuarioProxy implements Acceso{
    
    private AccesoReal accesoReal = new AccesoReal();
    private Usuario usuario = new Usuario();
    
    private boolean isAdmin;
    private boolean isUsuario;

        public AcessoUsuarioProxy(Usuario usuario) {
            // Assume role ID is fetched from a database or user repository.
            // For demonstration purposes, let's hardcode the role ID here based on the username and password.
           
            if (usuario.getRol()==1){
                isAdmin = true;
                this.accesoReal = new AccesoReal();
            }else if (usuario.getRol()==2){
                isUsuario = true;
            }
        }

        @Override
        public String analizarNivelAcceso() {
            if (isAdmin) {
                return accesoReal.analizarNivelAcceso();
            } else if (isUsuario) {
                return "MenuCliente";
            } else {
                return "false";
            }
        }
}

