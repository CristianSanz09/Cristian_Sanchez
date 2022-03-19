package Punto2;

/**Escriba una aplicación que defina tres variables numéricas, con sus valores iniciales, y muestre la suma, promedio, 
producto, cociente y modulo. Los resultados se deben imprimir en formato decimal con dos cifras significativas.*/
public class Punto2 {
    public static void main(String[] args) {
       double x = 12;
       double y = 18;
       double z = 15;
        System.out.println("La suma es: "+(x+y+z));
        System.out.println("El promedio es: "+(x+y+z)/3);
        System.out.println("El producto es: "+(x*y*z));
        System.out.println("El cociente es: "+(x+y/z));
        System.out.println("El modulo es: "+(x%y%z));
        
    }
}
