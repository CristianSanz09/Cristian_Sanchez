package punto3;

public class VectorLista {
    private String mes;
    private double venta;
    
    public VectorLista(String mes, double venta) {
        this.mes = mes;
        this.venta = venta;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getVenta() {
        return venta;
    }

    public void setVenta(double venta) {
        this.venta = venta;
    }
    
    public double PromAnual(double Promedio, double acum){
        for (int i = 0; i<this.venta; i++){
            acum += this.venta;
        }
        Promedio = acum / this.venta;
        Promedio = Math.round(Promedio * 100) / 100d;
        System.out.println(Promedio);
        
        return 0;
    }
}