package Punto1;

public class Punto1 {

    public static void main(String[] args) {
        int productos [] = {2327, 1423, 2329, 1429, 0423};
        float precio[] = {8700, 6900, 3200, 70000, 9300};
        int cantidad[] = {3, 4, 9, 2, 7};
        int pmayor = (int) precio[0]; 
        int pMayor = (int) cantidad[0]; 
        float cTotal = 0;
        float aux = 0;
        int aux2 = 0;
        int Valdia = 0;
        for (int i=0; i<productos.length; i++){
            System.out.println("EL producto con indentificaion "+productos[i]);
            System.out.println("Tiene un precio de "+precio[i]+" Y se vendieron "+cantidad[i]);
            System.out.println(" ");
            
            cTotal = (precio[i]*cantidad[i]) + aux;
            aux = cTotal;
            
            Valdia = (int) (cantidad[i]+ aux2);
            aux2 = Valdia;     
        } 
        
        for (int x=0; x<precio.length; x++){
            if (precio[x]>pmayor){
                pmayor = (int) precio[x];
            }
            
        }
        for (int y=0; y<cantidad.length; y++){
            if (cantidad[y]> pMayor){
                pMayor = (int) cantidad[y];
            }
            
        }
        System.out.println("Total de productos vendidos al dia: "+Valdia+"\n");
        System.out.println("La venta en total es: "+cTotal+"\n");
        System.out.println("El producto mas vendido: "+pMayor+"\n");
        System.out.println("El producto con mayor precio: "+pMayor+"\n");
    }
}