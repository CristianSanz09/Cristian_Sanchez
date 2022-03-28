package Punto2;

public class Principal {
    
    public static void main(String[] args) {

        Cuenta1 c1= new Cuenta1();
        Cuenta1 c2= new Cuenta1();
       
        System.out.println("NUMERO DE CUENTA: "+c1.getNumCuenta());
        System.out.println("NOMBRE DEL USUARIO: "+c1.getNomCliente());
        c1.Consignar(500000);
        System.out.println("SU SALDO ES: $"+c1.getSaldo());
        c1.Retirar(50000);
        System.out.println("--------------------------------------");
        c2.setNumCuenta(484916156);
        c2.setNomCliente("MILADIS ARCIA");
        c2.setSaldo(700000);
        System.out.println("NUMERO DE CUENTA: "+c2.getNumCuenta());
        System.out.println("NOMBRE DEL USUARIO: "+c2.getNomCliente());
        c2.Consignar(100000);
        System.out.println("SU SALDO ES: $"+c2.getSaldo());
        c2.Retirar(40000);
}
}
