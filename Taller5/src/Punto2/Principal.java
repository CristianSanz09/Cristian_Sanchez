package Punto2;

public class Principal {
    
    public static void main(String[] args) {
        
        Parrafo parrafo1 = new Parrafo("maria santa maria caracteristica virgen, maria era buena maria.");
        Parrafo parrafo2 = new Parrafo("Cuando digo Diego, digo digo, y cuando digo digo, digo Diego");
        
        System.out.println(parrafo1.getTexto() + "\n");
        System.out.println("~N° de vocales: " + parrafo1.nVocales());
        System.out.println("~N° de consonantes: " + parrafo1.nConsonantes());
        System.out.println("~N° de simbolos: " + parrafo1.nSimbolos());
        System.out.println("~Palabra repetida: " + parrafo1.Buscar("maria") + "Veces");
        System.out.println("~Hay " + parrafo1.nPalabras() + " palabras en la oración" + "\n");
        //System.out.println("~La Palabra mas Larga es: " + parrafo1.PalabraMayor() + "\n");
        
        
        System.out.println(parrafo2.getTexto() + "\n");
        System.out.println("~N° de vocales: " + parrafo2.nVocales());
        System.out.println("~N° de consonantes: " + parrafo2.nConsonantes());
        System.out.println("~N° de simbolos: " + parrafo2.nSimbolos());
        System.out.println("~Palabra repetida: " + parrafo2.Buscar("digo") + "Veces");
        System.out.println("~Hay " + parrafo2.nPalabras() + " palabras en la oración");
        //System.out.println("~La Palabra mas Larga es: " + parrafo2.PalabraMayor());   
    }
}
