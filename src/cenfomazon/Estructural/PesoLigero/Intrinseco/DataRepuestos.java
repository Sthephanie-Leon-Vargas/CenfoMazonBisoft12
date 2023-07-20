package cenfomazon.Estructural.PesoLigero.Intrinseco;

public abstract class DataRepuestos {
    private int tipoRepuesto;
    private String categoria;
    private int marcaRepuesto;

    public DataRepuestos(int tipoRepuesto, String categoria, int marcaRepuesto) {
        this.tipoRepuesto = tipoRepuesto;
        this.categoria = categoria;
        this.marcaRepuesto = marcaRepuesto;
    }

    public int getTipoRepuesto() {
        return tipoRepuesto;
    }

    public void setTipoRepuesto(int tipoRepuesto) {
        this.tipoRepuesto = tipoRepuesto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getMarcaRepuesto() {
        return marcaRepuesto;
    }

    public void setMarcaRepuesto(int marcaRepuesto) {
        this.marcaRepuesto = marcaRepuesto;
    }

    public String MostrarCaracteristicas(String pDatosExtra) {
        return "DataRepuestos{" +
                "tipoRepuesto='" + this.getTipoRepuesto() + '\'' +
                ", catagoria='" + this.getCategoria() + '\'' +
                ", marcaRepuesto='" + this.getMarcaRepuesto() + '\'' +
                pDatosExtra + "\n" +
                '}';
    }
}
