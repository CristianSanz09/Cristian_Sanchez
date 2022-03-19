package Punto5;
import java.util.Scanner;

/**En la Tabla 1 se muestran el número de calorías que contienen las principales frutas. ¿Si Juan cena una ensalada de 
frutas que contiene 2 manzanas, 3 peras, 1 naranja y 1 melón, cuantas calorías ha consumido? Cree una aplicación en 
java que le permita realizar el cálculo, para ello defina e inicialice las variables que considere.
 */
public class Punto5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double manzana = 52, pera =  55, naranja = 45, melon = 54, piña = 55, fresa = 32;
        double cantidadmanzana, cantidadpera, cantidadnaranja, cantidadmelon, cantidadpiña, cantidadfresa;
        double Calorias;
        
        System.out.print("Manzanas comidas: "); 
        cantidadmanzana = sc.nextDouble();
        System.out.print("Peras comidas: "); 
        cantidadpera = sc.nextDouble();
        System.out.print("Naranjas comidas: "); 
        cantidadnaranja = sc.nextDouble();
        System.out.print("Melones comidos: "); 
        cantidadmelon = sc.nextDouble();
        System.out.print("Piñas comidas: "); 
        cantidadpiña = sc.nextDouble();
        System.out.print("Fresas comidas: "); 
        cantidadfresa = sc.nextDouble();
        
        Calorias = ((manzana * cantidadmanzana)+ (pera * cantidadpera) + 
        (naranja * cantidadnaranja) + (melon * cantidadmelon ) + (piña *cantidadpiña) + (fresa * cantidadfresa));
        System.out.println("El total de calorias consumidas son: "+Calorias);
        
        
    }
}
