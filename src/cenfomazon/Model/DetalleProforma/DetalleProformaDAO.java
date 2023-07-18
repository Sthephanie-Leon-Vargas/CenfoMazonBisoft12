package cenfomazon.Model.DetalleProforma;
import cenfomazon.Creacional.Singleton.ConexionBD;

public class DetalleProformaDAO {

    public void registroDetalleProforma(DetalleProforma detalleProforma) {
        ConexionBD con = new ConexionBD();
        String sql;

        int piddetalle = detalleProforma.get_id_detalle();
        int pidproforma = detalleProforma.get_id_proforma();
        int prepuesto = detalleProforma.get_id_repuesto();
        int prazonrechazo = detalleProforma.get_id_razonRechazo();
        String pestado = detalleProforma.get_estado();

        sql = "INSERT INTO jKM_Proformas (id_Cliente,id_Vendedor,estado) VALUES ("+piddetalle+","+pidproforma+","+prepuesto+","+prazonrechazo+","+pestado+")";
        System.out.println(sql);
        try {
            con.postConnection(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
