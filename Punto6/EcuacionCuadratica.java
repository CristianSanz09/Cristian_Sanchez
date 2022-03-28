package Punto6;


public class EcuacionCuadratica {
    
    public static void main(String[] args) {
        FuncionCuadratica ecuacionc = new FuncionCuadratica();
        
        ecuacionc.setVariablea(2);
        ecuacionc.setVariableb(9);
        ecuacionc.setVariablec(10);
        ecuacionc.setVarible(-2);
        
        System.out.println(ecuacionc.getVariablex());
        System.out.println(ecuacionc.getVariableX());
        System.out.println(ecuacionc.getEcuacion());
    }
}
