package Punto1;

public class Coche {
    
    public static void main(String[] args) {
        
        PruebaCoche A1 = new PruebaCoche("Rojo", "Mazda", "Signature", 5000, 4, "HXD134");
        PruebaCoche A2 = new PruebaCoche("Blanco", "Ferrari", "250 GTO", 12000, 2, "HPS16C");
        PruebaCoche A3 = new PruebaCoche("Negro", "bugatti", "La Voiture Noire", 12000, 2, "HPS16C");
        PruebaCoche A4 = new PruebaCoche("Amarillo", "Renault", "Megane", 6200, 4, "HPS16C");
        
        System.out.println("--------AUTO 1--------");
        A1.mostrar1();
        A1.acelera();
        System.out.println("");
        System.out.println("--------AUTO 2--------");
        A2.mostrar2();
        A2.encender();
        System.out.println("");
        System.out.println("--------AUTO 3--------");
        A3.mostrar3();
        A3.apagar();
        System.out.println("");
        System.out.println("--------AUTO 4--------");
        A4.mostrar3();
        A4.frenar();
    }
}
