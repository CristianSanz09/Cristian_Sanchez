package Punto4;


public class Habitacion {
    public static void main(String[] args) {

    PruebaHabitacion habi1 = new PruebaHabitacion();
        PruebaHabitacion habi2 = new PruebaHabitacion();
        habi1.setAnchoH(10.00);
        habi1.setLargoH(18.2371);
        habi1.setAlturaH(294);
        System.out.println("Se requeiren "+habi1.getEnchape()+" metros cuadrados de enchape");
        System.out.println("Se requeiren "+habi1.getTapizado()+" metros cuadrados para tapizado sus paredes");
        habi2.setAnchoH(20.02);
        habi2.setLargoH(182331.71);
        System.out.println(habi2.getEnchape());
}
}