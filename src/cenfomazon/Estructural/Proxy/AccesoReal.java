/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenfomazon.Estructural.Proxy;

import cenfomazon.Estructural.Proxy.InterfaceProxy.Acceso;
/**
 *
 * @author Daniel Sandoval
 */
public class AccesoReal implements Acceso {
    
     public AccesoReal() {
    }

    public String analizarNivelAcceso() {
        return "MenuVendedor";
    }
       
        
}
