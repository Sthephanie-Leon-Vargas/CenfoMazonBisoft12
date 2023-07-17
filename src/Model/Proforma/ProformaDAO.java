package Model.Proforma;
import cenfomazon.Creacional.Singleton.ConexionBD;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProformaDAO {
    public void registroProforma (Proforma proforma){

        ConexionBD con = new ConexionBD();
        String sql;
        int pidproforma= proforma.getId_proforma();
        int pidCliente= proforma.getId_Cliente();
        int pidVendedor= proforma.getId_Vendedor();
        String pestado= "Nueva";

        sql = "INSERT INTO jKM_Proformas (id_proforma,id_Cliente,id_Vendedor,estado) VALUES (9,1,1,'Nueva')";

        try {
            con.postConnection(sql);
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    /*public List<Proforma> listarProformas() {
        List<Proforma> proformas = new ArrayList<>();

        try {
            // Establecer la conexión con la base de datos
            ConexionBD con = new ConexionBD();

            // Crear la consulta SQL
            String query = "SELECT * FROM jKM_Proformas";


            // Ejecutar la consulta
            /*ResultSet resultSet = (ResultSet) con.getConnection(query);

            // Recorrer los resultados y crear los objetos Proforma
            while (resultSet.next()) {
                int idCliente = resultSet.getInt("id_Cliente");
                int idVendedor = resultSet.getInt("id_Vendedor");
                String estado = resultSet.getString("estado");

                Proforma proforma = new Proforma(idCliente, idVendedor, estado);
                proformas.add(proforma);
            }

            // Cerrar la conexión y liberar recursos
            resultSet.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return proformas;
    }*/


}
