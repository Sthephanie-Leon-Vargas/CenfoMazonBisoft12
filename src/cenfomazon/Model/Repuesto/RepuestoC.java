package cenfomazon.Model.Repuesto;

public class RepuestoC {
    private int idRepuesto;
    private String tipoRepuesto;
    private String nombre;
    private String descripcion;
    private String categoria;
    private double precio;
    private String marcaRepuesto;

    public RepuestoC(int idRepuesto, String tipoRepuesto, String nombre, String descripcion, String categoria, double precio, String marcaRepuesto) {
        this.idRepuesto = idRepuesto;
        this.tipoRepuesto = tipoRepuesto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
        this.marcaRepuesto = marcaRepuesto;
    }
    
     public RepuestoC(String nombre) {
        this.nombre = nombre;
    }

    public int getIdRepuesto() {
        return idRepuesto;
    }

    public void setIdRepuesto(int idRepuesto) {
        this.idRepuesto = idRepuesto;
    }

    public String getTipoRepuesto() {
        return tipoRepuesto;
    }

    public void setTipoRepuesto(String tipoRepuesto) {
        this.tipoRepuesto = tipoRepuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarcaRepuesto() {
        return marcaRepuesto;
    }

    public void setMarcaRepuesto(String marcaRepuesto) {
        this.marcaRepuesto = marcaRepuesto;
    }

   

   
    

    @Override
    public String toString() {
        return "Repuesto{" +
                "idRepuesto=" + idRepuesto +
                ", tipoRepuesto='" + tipoRepuesto + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", marcaRepuesto='" + marcaRepuesto + '\'' +
                '}';
    }
}
