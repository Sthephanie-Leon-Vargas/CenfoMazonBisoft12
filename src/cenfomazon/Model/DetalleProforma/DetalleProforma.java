package cenfomazon.Model.DetalleProforma;

import cenfomazon.Model.Repuesto.RepuestoC;

public class DetalleProforma {


    private int _id_detalle;
    private int _id_proforma;
    private int _id_repuesto;
    private int _id_razonRechazo;
    private String razon;
    private String _estado;
    private RepuestoC repuesto;

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public int get_id_detalle() {
        return _id_detalle;
    }

    public void set_id_detalle(int _id_detalle) {
        this._id_detalle = _id_detalle;
    }

    public int get_id_proforma() {
        return _id_proforma;
    }

    public void set_id_proforma(int _id_proforma) {
        this._id_proforma = _id_proforma;
    }

    public int get_id_repuesto() {
        return _id_repuesto;
    }

    public void set_id_repuesto(int _id_repuesto) {
        this._id_repuesto = _id_repuesto;
    }

    public int get_id_razonRechazo() {
        return _id_razonRechazo;
    }

    public void set_id_razonRechazo(int _id_razonRechazo) {
        this._id_razonRechazo = _id_razonRechazo;
    }

    public String get_estado() {
        return _estado;
    }

    public void set_estado(String _estado) {
        this._estado = _estado;
    }

    public RepuestoC getRepuesto() {
        return repuesto;
    }

    public void setRepuesto(RepuestoC repuesto) {
        this.repuesto = repuesto;
    }

    public DetalleProforma(int _id_detalle, RepuestoC repuesto) {
        this._id_detalle = _id_detalle;
        this.repuesto = repuesto;
    }

        public DetalleProforma(int _id_detalle, RepuestoC repuesto, int id_razon, String razon, String estado) {
        this._id_detalle = _id_detalle;
        this.repuesto = repuesto;
        this._id_razonRechazo=id_razon;
        this.razon=razon;
        this._estado=estado;
        
    }

    
    public DetalleProforma(int _id_proforma, int _id_repuesto, int _id_razonRechazo, String _estado) {
       
        this._id_proforma = _id_proforma;
        this._id_repuesto = _id_repuesto;
        this._id_razonRechazo = _id_razonRechazo;
        this._estado = _estado;
    }

    public DetalleProforma(int _id_proforma, int _id_repuesto) {
        this._id_proforma = _id_proforma;
        this._id_repuesto = _id_repuesto;
    }
    
    public DetalleProforma(int id_detalle, int id_proforma, int id_repuesto) {
        this._id_detalle = id_detalle;
        this._id_proforma = id_proforma;
        this._id_repuesto = id_repuesto;
    }

    public DetalleProforma() {
    }

    @Override
    public String toString() {
        return "DetalleProforma{" + "_id_detalle=" + _id_detalle + ", _id_proforma=" + _id_proforma + ", _id_repuesto=" + _id_repuesto + ", _id_razonRechazo=" + _id_razonRechazo + ", _estado=" + _estado + '}';
    }

    public DetalleProforma(int _id_detalle, int _id_proforma, int _id_repuesto, int _id_razonRechazo, String _estado) {
        this._id_detalle = _id_detalle;
        this._id_proforma = _id_proforma;
        this._id_repuesto = _id_repuesto;
        this._id_razonRechazo = _id_razonRechazo;
        this._estado = _estado;
    }


}
