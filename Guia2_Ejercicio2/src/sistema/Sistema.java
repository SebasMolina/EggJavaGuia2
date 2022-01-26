package sistema;

import circunferencia.Circunferencia;
import java.util.Locale;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        double area, perimetro;
        //Ejercicio 2
        Circunferencia circunferencia1 = new Circunferencia();
        circunferencia1.crearCircunferencia();
        area = circunferencia1.obtenerArea();
        perimetro = circunferencia1.obtenerPerimetro();
        System.out.printf("El radio de la circunferencia es: %.2f.\n",circunferencia1.getRadio());
        System.out.printf("El area de la circunferencia es: %.2f.\n", area);
        System.out.printf("El perimetro de la circunferencia es: %.2f.\n", perimetro);
    }
    
}
