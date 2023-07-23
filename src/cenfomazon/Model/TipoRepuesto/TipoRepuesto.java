package cenfomazon.Model.TipoRepuesto;

public class TipoRepuesto {
    private int idTipoRepuesto;
    private String Tipo;

    public TipoRepuesto(int idTipoRepuesto, String tipo) {
        this.idTipoRepuesto = idTipoRepuesto;
        Tipo = tipo;
    }

    public int getIdTipoRepuesto() {
        return idTipoRepuesto;
    }

    public void setIdTipoRepuesto(int idTipoRepuesto) {
        this.idTipoRepuesto = idTipoRepuesto;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    
    
    
    @Override
    public String toString() {
        return getTipo();
    }
}
