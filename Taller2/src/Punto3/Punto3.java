package Punto3;
/**El precio de venta de los artículos de una tienda se calcula a partir de su valor de costo fijo, el porcentaje de iva y su 
porcentaje de utilidad. Cree una aplicación en Java, en la que defina e inicialice dichos valores para un artículo, y 
calcule y muestre su precio de venta.*/

public class Punto3 {
        
    public static void main(String[] args) {
        double precioart; 
        double iva;
        double porc_utd;
        double precioVenta;
        precioart = 199.99;
        iva = 21;
        porc_utd = (precioart *  iva / 100);
        precioVenta = (precioart+iva+porc_utd);
        
        System.out.println("El precio del articulo es: "+precioVenta);
    }
}
