package Punto7;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Libro> lista = new ArrayList<>();
        
        Libro libro1 = new Libro("Cien años de soledad", "1ra edición", "Gabriel García Márquez", "9788497592208", "‎$61.000", "Colombia, Aracataca","5 de junio de 1967", "471");
        Libro libro2 = new Libro("Harry Potter y la piedra filosofal", "1ra edición", "J. K. Rowling", " 9788478884452", "$42.900", "Reino Unido","26 de junio de 1997", "240");
        Libro libro3 = new Libro("El señor de los anillos", "1ra edición", "J. R. R. Tolkien.", "9788445071793", "$59.000", "Reino Unido","20 de octubre de 1955", "423");
        Libro libro4 = new Libro("Lo que el viento se llevó", "1ra edición", "Margaret Mitchell", "9788413141282", "$130.026", "Estados Unidos","30 de junio de 1936", "1.037");        
        Libro libro5 = new Libro("Los Miserables", "1ra edición", "Víctor Hugo", "97884911051121", "$45.500", "Francia","1862", "1.462");        
        
        lista.add(libro1);
        lista.add(libro2);
        lista.add(libro3);
        lista.add(libro4);
        lista.add(libro5);
        
        for (int i=0; i<lista.size(); i++){
            System.out.println("TITULO DEL LIBRO: "+lista.get(i).getTitulo());
            System.out.println(lista.get(i).getEdicion());
            System.out.println("AUTOR: "+lista.get(i).getNombreAutor());
            System.out.println("ISBN: "+lista.get(i).getIsbn());
            System.out.println("VALOR COMERCIAL: "+lista.get(i).getValorPublico());
            System.out.println("LUGAR: "+lista.get(i).getLugar());
            System.out.println("FECHAS: "+lista.get(i).getFecha_edicion());
            System.out.println("N°PAGINAS: "+lista.get(i).getPaginas());
            System.out.println("");
        }
    }
}