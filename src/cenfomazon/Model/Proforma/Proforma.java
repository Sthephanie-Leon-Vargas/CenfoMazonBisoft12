/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cenfomazon.Model.Proforma;



/**
 *
 * @author sleon
 */
public class Proforma {

    private int _id_proforma;
    private int _id_Cliente;

    private int _id_Vendedor;
    private String _estado;



    public int getId_proforma() {
        return _id_proforma;
    }

    public int getId_Vendedor() {
        return _id_Vendedor;
    }

    public void setId_Vendedor(int _id_Vendedor) {
        this._id_Vendedor = _id_Vendedor;
    }

    public void setId_proforma(int _id_proforma) {
        this._id_proforma = _id_proforma;
    }

    public int getId_Cliente() {
        return _id_Cliente;
    }

    public void setId_Cliente(int _id_Cliente) {
        this._id_Cliente = _id_Cliente;
    }

    public String getEstado() {
        return _estado;
    }

    public void setEstado(String _estado) {
        this._estado = _estado;
    }

    public Proforma(int id_Cliente, int id_Vendedor, String estado) {
        this._id_Cliente = id_Cliente;
        this._id_Vendedor = id_Vendedor;
        this._estado = estado;

    }

    public Proforma(int idCliente, String estado) {
//        this.cliente.setNombre(nombreCliente);
//        setCliente(nombreCliente);
        this._id_Cliente = idCliente;
        this._estado = estado;

    }

    public Proforma(int _id_proforma, int _id_Cliente, int _id_Vendedor, String _estado) {
        this._id_proforma = _id_proforma;
        this._id_Cliente = _id_Cliente;
        this._id_Vendedor = _id_Vendedor;
        this._estado = _estado;
    }

    public Proforma(int id_Cliente, int id_Vendedor) {
        this._id_Cliente = id_Cliente;
        this._id_Vendedor = id_Vendedor;

    }

    public Proforma(int id_Cliente) {
        this._id_Cliente = id_Cliente;
    }

    public Proforma() {
    }
}
