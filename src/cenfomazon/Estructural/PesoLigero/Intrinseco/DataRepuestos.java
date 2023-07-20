package cenfomazon.Estructural.PesoLigero.Intrinseco;

public abstract class DataRepuestos {
    private String tipoRepuesto;
    private String categoria;
    private String marcaRepuesto;

    public DataRepuestos(String tipoRepuesto, String categoria, String marcaRepuesto) {
        this.tipoRepuesto = tipoRepuesto;
        this.categoria = categoria;
        this.marcaRepuesto = marcaRepuesto;
    }

    public String getTipoRepuesto() {
        return tipoRepuesto;
    }

    public void setTipoRepuesto(String tipoRepuesto) {
        this.tipoRepuesto = tipoRepuesto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarcaRepuesto() {
        return marcaRepuesto;
    }

    public void setMarcaRepuesto(String marcaRepuesto) {
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
