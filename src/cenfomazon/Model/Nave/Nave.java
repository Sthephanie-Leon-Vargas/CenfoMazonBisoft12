package cenfomazon.Model.Nave;

public class Nave {
    private int id_nave;
    private int id_usuario;
    private String categoria;
    private String marcaModelo;
    private String codigoIdentificacion;
    private String color;

    public Nave(int id_nave, int id_usuario, String categoria, String marcaModelo, String codigoIdentificacion, String color) {
        this.id_nave = id_nave;
        this.id_usuario = id_usuario;
        this.categoria = categoria;
        this.marcaModelo = marcaModelo;
        this.codigoIdentificacion = codigoIdentificacion;
        this.color = color;
    }

    public int getId_nave() {
        return id_nave;
    }

    public void setId_nave(int id_nave) {
        this.id_nave = id_nave;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }

    public String getCodigoIdentificacion() {
        return codigoIdentificacion;
    }

    public void setCodigoIdentificacion(String codigoIdentificacion) {
        this.codigoIdentificacion = codigoIdentificacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Nave{" +
                "id_nave=" + id_nave +
                ", id_usuario=" + id_usuario +
                ", categoria='" + categoria + '\'' +
                ", marcaModelo='" + marcaModelo + '\'' +
                ", codigoIdentificacion='" + codigoIdentificacion + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
