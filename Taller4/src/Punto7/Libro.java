package Punto7;

public class Libro {
    private String titulo;
    private String edicion;
    private String nombreAutor;
    private String isbn;
    private String valorPublico;
    private String lugar;
    private String fecha_edicion;
    private String paginas;

    public Libro(String titulo, String edicion, String nombreAutor, String isbn, String valorPublico, String lugar,String fecha_edicion, String paginas) {
        this.titulo = titulo;
        this.edicion = edicion;
        this.nombreAutor = nombreAutor;
        this.isbn = isbn;
        this.valorPublico = valorPublico;
        this.lugar = lugar;
        this.fecha_edicion = fecha_edicion;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getValorPublico() {
        return valorPublico;
    }

    public void setValorPublico(String valorPublico) {
        this.valorPublico = valorPublico;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha_edicion() {
        return fecha_edicion;
    }

    public void setFecha_edicion(String fecha_edicion) {
        this.fecha_edicion = fecha_edicion;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
}
}
