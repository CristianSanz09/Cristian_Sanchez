package Punto2;
import java.text.DecimalFormat;

public class Cuenta1 {
    private int numCuenta;
    private String nomCliente;
    private int saldo;
DecimalFormat formato = new DecimalFormat("###,###.##");  
    public Cuenta1(){
        this.numCuenta=298161816;
        this.nomCliente="CRISTIAN SANCHEZ";
        this.saldo=1500000;
    }

    public void setNumCuenta(int Cuenta){
        this.numCuenta = Cuenta;
    }
    public void setNomCliente(String Nombre){
        this.nomCliente = Nombre;    
    }
    public void setSaldo(int Saldo){
        this.saldo = Saldo;
    }
    
    public int getNumCuenta(){
        return this.numCuenta;
    } 
    public String getNomCliente(){
        return this.nomCliente;
    }
    public int getSaldo(){
        return this.saldo;
    }
    
    public void Consignar(int consigna){
        
        if (consigna==0){
            System.out.println("NO SE HA CONSIGNADO NADA");
        }
        else{
            System.out.println("SE HAN CONSIGNADO: " +"$"+formato.format(consigna));
            this.saldo = consigna + this.saldo;
        }
    }
    
    public void Retirar(int retiro){
        if (retiro<=this.saldo){
            System.out.println("SE HAN RETIRADO DE SU CUENTA: "+"$"+formato.format(retiro));
            this.saldo = this.saldo - retiro;
        }
        else{
            System.out.println("SU SALDO ES INSUFICIENTE");
        }
    }
}
