package punto3;
import java.util.ArrayList;

public class Ventas {
    
    public static void main(String[] args) {
        ArrayList<VectorLista> lista = new ArrayList<>();
        
        VectorLista ene = new VectorLista("ENERO", 120000);
        VectorLista feb = new VectorLista("FEBRERO", 300000);
        VectorLista mar = new VectorLista("MARZO", 400000);
        VectorLista abr = new VectorLista("ABRIL", 100400);
        VectorLista may = new VectorLista("MAYO", 500020);
        VectorLista jun = new VectorLista("JUNIO", 432800);
        VectorLista jul = new VectorLista("JULIO", 291000);
        VectorLista ago = new VectorLista("AGOSTO", 520900);
        VectorLista sep = new VectorLista("SEPTIEMBRE", 70000);
        VectorLista oct = new VectorLista("OCTUBRE", 320000);
        VectorLista nov = new VectorLista("NOVIEMBRE", 210000);
        VectorLista dic = new VectorLista("DICIEMBRE", 802000);
        
        lista.add(ene);
        lista.add(feb);
        lista.add(mar);
        lista.add(abr);
        lista.add(may);
        lista.add(jun);
        lista.add(jul);
        lista.add(ago);
        lista.add(sep);
        lista.add(oct);
        lista.add(nov);
        lista.add(dic);
        
        double acum = 0;
        double prom = 0;
        double mayor;
        double menor;
        String Mventa =" ";
        String MenorVenta = " ";
        
        mayor = lista.get(0).getVenta();
        menor = lista.get(0).getVenta();
        
        for (int i = 0; i<lista.size(); i++){
            acum += lista.get(i).getVenta();
        }
        
        for (int i=0; i<lista.size(); i++ ){
            if (lista.get(i).getVenta() > mayor){
                mayor = lista.get(i).getVenta();
            }
        }
        
        for (int i=0; i<lista.size(); i++ ){
            if (lista.get(i).getVenta() < menor){
                menor = lista.get(i).getVenta();
            }
        }
       
        for (int i=0; i<lista.size(); i++){
            if (lista.get(i).getVenta() == mayor){
                Mventa = lista.get(i).getMes();
            }
        }
       
        for (int i=0; i<lista.size(); i++){
            if (lista.get(i).getVenta() == menor){
                MenorVenta = lista.get(i).getMes();
            }
        }
        
        prom = acum / lista.size();
        prom = Math.round(prom * 100) / 100d;
        
        System.out.println("EL MES CON MAYOR VENTA ES: "+Mventa);
        System.out.println("---------------------------------------------");
        System.out.println("EL MES CON MENOR VENTA ES: "+MenorVenta);
        System.out.println("---------------------------------------------");
        System.out.println("VENTA PROMEDIO EN EL AÑO: "+prom);
        System.out.println("---------------------------------------------");
        System.out.println("VENTAS TOTAL DEL AÑO: "+acum);
    }
}
