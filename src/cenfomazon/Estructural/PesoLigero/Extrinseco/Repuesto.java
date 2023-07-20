package cenfomazon.Estructural.PesoLigero.Extrinseco;

import cenfomazon.Estructural.PesoLigero.Intrinseco.DataRepuestos;
import cenfomazon.Estructural.PesoLigero.RepuestoFactory;

public class Repuesto {
    private DataRepuestos datosIntrinsecos;
    private int idRepuesto;
    private String nombre;
    private String descripcion;
    private double precio;

    public Repuesto(int idRepuesto, String nombre, String descripcion, double precio, int tipoRepuesto, String categoria, int marcaRepuesto) {
        datosIntrinsecos = RepuestoFactory.obtenerRepuesto(tipoRepuesto, categoria, marcaRepuesto);
        setDatosExtrinsecos(idRepuesto, nombre, descripcion, precio);
    }

    public String MostrarCaracteristicas() {
        return datosIntrinsecos.MostrarCaracteristicas(getRepuestoKey());
    }
    public String getRepuestoKey() {
        return datosIntrinsecos.getTipoRepuesto() + "-"
                + datosIntrinsecos.getCategoria() + "-"
                + datosIntrinsecos.getTipoRepuesto();
    }

    /* ********************************************************************** *
     * Sección de funciones publicas del área EXTRINSECA. Estas funciones
     * ayudan para mostrar los datos EXTRINSESCOS del objeto, osea los que
     * no deberian de variar. Por eso solo muestran datos.
     * ********************************************************************** */

    public int getIdRepuesto() {
        return idRepuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDatosRepuesto() {
        return "EXTRINSECOS:\n" +
                ", idRepuesto=" + idRepuesto + "\n"
                + ", nombre='" + nombre + '\n'
                + ", descripcion='" + descripcion + '\n'
                + ", precio=" + precio + "\n"
                + "INTRINSECOS\n"
                + MostrarCaracteristicas();
    }

    /* ********************************************************************** *
     * Sección de funciones privadas. Sirven para modificar datos.
     * Estos datos no deberían variar con el tiempo (son comunes a todas las
     * instancias). Estas funciones son para manejar los datos EXTRINSECOS
     * ********************************************************************** */

    public void setDatosExtrinsecos(int idRepuesto, String nombre, String descripcion, double precio) {
        setIdRepuesto(idRepuesto);
        setNombre(nombre);
        setDescripcion(descripcion);
        setPrecio(precio);
    }
    public void setIdRepuesto(int idRepuesto) {
        this.idRepuesto = idRepuesto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
