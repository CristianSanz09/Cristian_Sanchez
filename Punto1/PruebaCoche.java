package Punto1;

public class PruebaCoche {
    String color;
    String marca;
    String modelo;
    int numcaballos;
    int numpuertas;
    String matricula;

    public PruebaCoche(String color1, String marca1, String modelo1, int numcaballos1, int numpuertas1, String matricula1){
        this.color = color1;
        this.marca = marca1;
        this.modelo = modelo1;
        this.numcaballos = numcaballos1;
        this.numpuertas = numpuertas1;
        this.matricula = matricula1;
    }
    
    public void PruebaCoche2(String color2, String marca2, String modelo2, int numcaballos2, int numpuertas2, String matricula2){
        this.color = color2;
        this.marca = marca2;
        this.modelo = modelo2;
        this.numcaballos = numcaballos2;
        this.numpuertas = numpuertas2;
        this.matricula = matricula2;
    }
    public void PruebaCoche3(String color3, String marca3, String modelo3, int numcaballos3,int numpuertas3, String matricula3){
        this.color = color3;
        this.marca = marca3;
        this.modelo = modelo3;
        this.numcaballos = numcaballos3;
        this.numpuertas = numpuertas3;
        this.matricula = matricula3;
    }
    public void mostrar1(){
        System.out.println("El color es: "+this.color);
        System.out.println("La marca es: "+this.marca);
        System.out.println("El modelo es: "+this.modelo);
        System.out.println("El número de caballos es: "+this.numcaballos);
        System.out.println("El número de puertas son: "+this.numpuertas);
        System.out.println("La matricula es: "+this.matricula);
    }
    public void mostrar2(){
        System.out.println("El color es: "+this.color);
        System.out.println("La marca es: "+this.marca);
        System.out.println("El modelo es: "+this.modelo);
        System.out.println("El número de caballos es: "+this.numcaballos);
        System.out.println("El número de puertas son: "+this.numpuertas);
        System.out.println("La matricula es: "+this.matricula);
    }
    public void mostrar3(){
        System.out.println("El color es: "+this.color);
        System.out.println("La marca es: "+this.marca);
        System.out.println("El modelo es: "+this.modelo);
        System.out.println("El número de caballos es: "+this.numcaballos);
        System.out.println("El número de puertas son: "+this.numpuertas);
        System.out.println("La matricula es: "+this.matricula);
    }
    public void PruebaCoche4(String color4, String marca4, String modelo4, int numcaballos4,int numpuertas4, String matricula4){
        this.color = color4;
        this.marca = marca4;
        this.modelo = modelo4;
        this.numcaballos = numcaballos4;
        this.numpuertas = numpuertas4;
        this.matricula = matricula4;
    }
    public void mostrar4(){
        System.out.println("El color es: "+this.color);
        System.out.println("La marca es: "+this.marca);
        System.out.println("El modelo es: "+this.modelo);
        System.out.println("El número de caballos es: "+this.numcaballos);
        System.out.println("El número de puertas son: "+this.numpuertas);
        System.out.println("La matricula es: "+this.matricula);
    }
    public void acelera(){
        System.out.println("El auto aceleró");
    }
    public void frenar(){
        System.out.println("El auto frenó");
    }
    public void encender(){
        System.out.println("El auto encendió");
    }
    public void apagar(){
        System.out.println("El auto se apagó");
    }
}
