package Punto1;


public class Principal {

    public static void main(String[] args) {
        
        Persona p= new Persona("Diagonal 18b #35-85 FUNDADORES", "Carrera 15 #16a-05", "CRISTIAN ARCIA");
        Fecha p1 = new Fecha (2001, "Octubre", 23, 2022);
        
        System.out.println("Nombre: "+p.getNombre());
        System.out.println("Dirección del domicio: "+p.getDireccionDomi());
        System.out.println("Dirección del domicio: "+p.getDireccionTra());
        System.out.println("Edad: "+p1.calcularAños());
        System.out.println("Fecha de nacimiento: "+p1.getDia()+"/"+p1.getMes()+"/"+p1.getAño());
    }
    
}
