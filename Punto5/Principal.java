package Punto5;

public class Principal {
    
    public static void main(String[] args) {
        TrianguloIsosceles t1 = new TrianguloIsosceles();
        
        t1.setAltura(12);
        t1.setBase(18);
        t1.setLados(20);
        
        System.out.println("El Area del triangulo isosceles es: "+t1.getArea()+"\n");
        
        System.out.println("Los lados del triangulo isosceles son: "+t1.getLadosa()+"\n");
        
        System.out.println("El perimetro del triangulo isosceles es: "+t1.getPerimetro()+"\n");
        
        System.out.println("El angulo del triangulo isosceles es: "+t1.getAngulo()+"\n");
        
        System.out.println("El angulo vertice del triangulo isosceles es: "+t1.getAnguloV()+"\n");
          
    }
}
