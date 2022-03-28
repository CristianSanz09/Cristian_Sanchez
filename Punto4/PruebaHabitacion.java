
package Punto4;


public class PruebaHabitacion {
    private double largoH;
    private double anchoH;
    private double alturaH;
    private double enchape;
    private double tapizado;

    public PruebaHabitacion () {
        this.largoH = 0;
        this.anchoH = 0;
        this.alturaH = 0;
        this.enchape = 0;
        this.tapizado = 0;
    }

    public double getLargoH() {
        return largoH;
    }
    
    public void setLargoH(double largoH) {
        this.largoH = largoH;
    }

    public double getAnchoH() {
        return anchoH;
    }

    public void setAnchoH(double anchoH) {
        this.anchoH = anchoH;
    }

    public double getAlturaH() {
        return alturaH;
    }

    public void setAlturaH(double alturaH) {
        this.alturaH = alturaH;
    }
    
    public double getEnchape() {
        enchape = this.anchoH * this.largoH;
        return enchape;
    }

    public void setEnchape(double enchape) {
        this.enchape = enchape;
    }

    public double getTapizado() {
        tapizado = (this.largoH*this.alturaH*2)+(this.alturaH*this.anchoH*2);
        return tapizado;
    }

    public void setTapizado(double tapizado) {
        this.tapizado = tapizado;
    }
        
}
