package Punto4;
import java.text.DecimalFormat;
import java.util.Scanner;

/**Se desea construir un programa en java que permita calcular el costo total de un viaje que tiene una duración en días. 
Para ello, se requiere los siguientes datos: Número de días del viaje, Total de kilómetros conducidos por día, costo por 
litro de gasolina, promedio de kilometro por litro de gasolina, pago por estacionamiento por día, pago de peajes por día. 
Imprima en consola el resultado.*/

public class Punto4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("###,###,###.##");
        double numdiasviaje, ttkmconxdia, pagoxestacxdia, pagopeaxdia;
        double gasolina = 3000;
        double kmxlitro = 10;
        double costgaso;
        double costotal;
        
        System.out.print("Cuantos días de viaje tuvo: ");
        numdiasviaje = sc.nextDouble();
        System.out.print("Cual fue su total de kilometros conducido por dia: ");
        ttkmconxdia = sc.nextDouble();
        System.out.print("Pago por estacionamiento: ");
        pagoxestacxdia = sc.nextDouble();
        System.out.print("Pago de peajes por dias: ");
        pagopeaxdia = sc.nextDouble();
        
        costgaso = (ttkmconxdia*numdiasviaje)/kmxlitro;
        costotal = (costgaso * gasolina) + (pagoxestacxdia * numdiasviaje) + (pagopeaxdia * numdiasviaje);
        
        System.out.println("El costo total del viaje es: "+"$"+formato.format(costotal));
    }
}

