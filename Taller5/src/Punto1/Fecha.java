package Punto1;


public class Fecha {
    private int año;
    private String mes;
    private int dia;
    private int añoActual;

    public Fecha(int año, String mes, int dia, int añoActual) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.añoActual = añoActual;
    }
    
    public Fecha() {
        this.año = 0;
        this.mes = " ";
        this.dia = 0;
        this.añoActual = 0;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAñoActual() {
        return añoActual;
    }

    public void setAñoActual(int añoActual) {
        this.añoActual = añoActual;
    }
    
    
    public int calcularAños(){
        int añosTotales = this.añoActual - año;
        return añosTotales;
    }
}
