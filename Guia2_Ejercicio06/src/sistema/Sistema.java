/*

*/
package sistema;

import cafetera.Cafetera;

public class Sistema {

    public static void main(String[] args) {
        //Ejercicio 6
        Cafetera nuevaCafetera = new Cafetera();
        nuevaCafetera.setCapacidadMaxima(1000);
        nuevaCafetera.llenarCafetera();
        System.out.println(nuevaCafetera.getCantidadActual());
        if (nuevaCafetera.servirTaza(500)){
            System.out.println("Se llenó la taza");
        } else {
            System.out.println("NO Se llenó la taza");
        }
        System.out.println(nuevaCafetera.getCantidadActual());
        if (nuevaCafetera.servirTaza(500)){
            System.out.println("Se llenó la taza");
        } else {
            System.out.println("NO Se llenó la taza");
        }
        if (nuevaCafetera.servirTaza(200)){
            System.out.println("Se llenó la taza");
        } else {
            System.out.println("NO Se llenó la taza");
        }
        System.out.println(nuevaCafetera.getCantidadActual());
        
    }
    
}
