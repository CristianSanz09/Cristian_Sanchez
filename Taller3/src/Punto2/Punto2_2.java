package Punto2;
import java.util.Scanner; 

public class Punto2_2 {
    
    public void Recibe(){
        
        Scanner leer = new Scanner(System.in);
        int nCuentaExit;
        double saldoInicio;               
        double abono;               
        double deducciones;               
        double limCredito;               
                
        System.out.println("\nIntroduzca el numero de cuenta del cliente o 0 (cero) para terminar: ");   
        nCuentaExit = leer.nextInt();
                               
        while(0 != nCuentaExit){
        
            System.out.println("\nIntroduzca el saldo inicial del mes: ");           
            saldoInicio = leer.nextDouble();              
                
            System.out.println("\nIntroduzca el total de abonos del mes: ");       
            abono = leer.nextDouble();
            System.out.println("\nIntroduzca el total de deducciones aplicadas a la cuenta del cliente en el mes: ");        
            deducciones = leer.nextDouble();              
                
            System.out.println("\nIntroduzca el limite de credito permitido: ");      
            limCredito = leer.nextDouble();              
                    
            double x = Retorna(saldoInicio, abono, deducciones);           
            if( x - limCredito > 0)
                System.out.println("\nEl credito se ha excedido.");      
        } 
    }           
    public double Retorna( double saldoInic, double abonos, double deducciones){           
        return saldoInic + abonos - deducciones;           
    }             
}  
