package cenfomazon.Model.Proforma;
import cenfomazon.Creacional.Singleton.Conexion;


public class ProformaDAO {
    public void registroProforma (Proforma proforma){

        Conexion con = new Conexion();
        String sql;
        int pidCliente= proforma.getId_Cliente();
        int pidVendedor= proforma.getId_Vendedor();
        String pestado= "'Nueva'";

        sql = "INSERT INTO jKM_Proformas (id_Cliente,id_Vendedor,estado) VALUES ("+pidCliente+","+pidVendedor+","+pestado+")";
        con.conectarBD("POST", sql);
       
    }

    /*public List<Proforma> listarProformas() {
        List<Proforma> proformas = new ArrayList<>();
        Conexion con = new Conexion();
        String sql;
        sql = "SELECT * jKM_Proformas";
        
        return proformas;
    }*/


}
