/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
*/
package sistema;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        //Ejercicio 11
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);        
        System.out.print("Ingrese el dia: ");
        int dia = leer.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = leer.nextInt();
        System.out.print("Ingrese el año: ");
        int anio = leer.nextInt();
        Date nuevaFecha = new Date(anio-1900,mes-1,dia);
        mostrarFecha(dia, mes, anio);
        Date fechaActual = new Date();
        mostrarFecha(fechaActual.getDate(),fechaActual.getMonth()+1, fechaActual.getYear()+1900);
        int diferencia = fechaActual.getYear()+1900 - anio;
        Math.abs(diferencia);        
        System.out.printf("Diferencia entre %d y %d = %d\n",fechaActual.getYear()+1900,anio,diferencia);
    }
    
    static void mostrarFecha(int dia,int mes, int anio){
        System.out.print(dia+"/");
        System.out.print(mes+"/");
        System.out.println(anio);
    }
}
