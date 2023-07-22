package cenfomazon.Model.DetalleProforma;
import cenfomazon.Creacional.Singleton.Conexion;



public class DetalleProformaDAO {

    public void registroDetalleProforma(DetalleProforma detalleProforma) {
        Conexion con = new Conexion();
        String sql;


        int pidproforma = detalleProforma.get_id_proforma();
        int prepuesto = detalleProforma.get_id_repuesto();
        int prazonrechazo = 3;
        String pestado = "Pendiente";

        sql = "INSERT INTO jKM_DetalleProforma (id_proforma,id_repuesto,id_razonRechazo,estado) VALUES ("+pidproforma+","+prepuesto+","+prazonrechazo+","+pestado+")";
        System.out.println(sql);
        con.conectarBD("POST", sql);
       
    }
}
