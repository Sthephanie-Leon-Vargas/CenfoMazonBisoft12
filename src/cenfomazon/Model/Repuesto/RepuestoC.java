package cenfomazon.Model.Repuesto;

public class RepuestoC {

    private int idRepuesto;
    private int tipoRepuesto;
    private String nombre;
    private String descripcion;
    private String categoria;
    private double precio;
    private int marcaRepuesto;

    public RepuestoC(int idRepuesto, int tipoRepuesto, String nombre, String descripcion, String categoria, double precio, int marcaRepuesto) {
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
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
    }
    
    public RepuestoC(String nombreRepuesto){
        this.nombre = nombreRepuesto;
    }

    public String getDescTipoRepuesto() {
        return descTipoRepuesto;
    }

    public void setDescTipoRepuesto(String descTipoRepuesto) {
        this.descTipoRepuesto = descTipoRepuesto;
    }

    public int getIdRepuesto() {
        return idRepuesto;
    }

    public void setIdRepuesto(int idRepuesto) {
        this.idRepuesto = idRepuesto;
    }

    public int getTipoRepuesto() {
        return tipoRepuesto;
    }

    public void setTipoRepuesto(int tipoRepuesto) {
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

    public int getMarcaRepuesto() {
        return marcaRepuesto;
    }

    public void setMarcaRepuesto(int marcaRepuesto) {
        this.marcaRepuesto = marcaRepuesto;
    }

    public RepuestoC(int idRepuesto, String nombre, int marcaRepuesto) {
        this.idRepuesto = idRepuesto;
        this.nombre = nombre;
        this.marcaRepuesto = marcaRepuesto;

    }

    public RepuestoC(int idRepuesto, String nombre, int marcaRepuesto, double precio) {
        this.idRepuesto = idRepuesto;
        this.nombre = nombre;
        this.marcaRepuesto = marcaRepuesto;
        this.precio = precio;
    }

    public RepuestoC() {
    }

    @Override
    public String toString() {
        return nombre;
    }
}
