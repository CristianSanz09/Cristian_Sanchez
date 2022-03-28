package Punto5;

public class TrianguloIsosceles {
    private double base;
    private double altura;
    private double area;
    private double lados;
    private double ladosa;
    private double perimetro;
    private double anguloV;
    private double angulo;

    public TrianguloIsosceles() {
        this.base = 0;
        this.altura = 0;
        this.area = 0;
        this.lados = 0;
        this.ladosa = 0;
        this.perimetro = 0;
        this.anguloV = 0;
        this.angulo = 0;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        area =(this.altura * this.base)/2;
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getLados() {
        return lados;
    }

    public void setLados(double lados) {
        this.lados = lados;
    }
    
    public double getLadosa() {
        ladosa = this.lados;
        return ladosa;
    }

    public void setLadosa(double lados) {
        this.ladosa = lados;
    }

    public double getPerimetro() {
        perimetro = this.base + this.lados + this.ladosa;
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getAnguloV() {
        double anguloa = Math.tan(this.altura*(this.base/2));
        double aux = Math.atan(anguloa);
        anguloV = aux*2;
        return anguloV;
    }

    public void setAnguloV(double anguloV) {
        this.anguloV = anguloV;
    }
    
    public double getAngulo() {
        double anguloa = Math.tan((this.altura)*(this.base/2));
        double aux = Math.atan(anguloa);
        angulo = aux;
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }
}

    
    
    