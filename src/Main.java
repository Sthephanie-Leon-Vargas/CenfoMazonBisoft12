import cenfomazon.Gestor;
import Model.Proforma.Proforma;

public class Main {
    public static void main(String[] args) {
        Gestor gestor = new Gestor();

        Proforma proforma = new Proforma (9,1,1,"Nueva");
        gestor.crearProforma(proforma);

        //gestor.listarProformas();


    }
}
