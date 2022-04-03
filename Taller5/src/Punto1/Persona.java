package Punto1;


public class Persona {
    private String direccionDomi;
    private String direccionTra;
    private String nombre;

    public Persona(String direccionDomi, String direccionTra, String nombre) {
        this.direccionDomi = direccionDomi ;
        this.direccionTra = direccionTra;
        this.nombre = nombre;
    }
    
    //*sobre carga*//
    public Persona(){
        this.direccionDomi = " ";
        this.direccionTra = " ";
        this.nombre = " ";
    }

    public String getDireccionDomi() {
        return direccionDomi;
    }

    public void setDireccionDomi(String direccionDomi) {
        this.direccionDomi = direccionDomi;
    }

    public String getDireccionTra() {
        return direccionTra;
    }

    public void setDireccionTra(String direccionTra) {
        this.direccionTra = direccionTra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
