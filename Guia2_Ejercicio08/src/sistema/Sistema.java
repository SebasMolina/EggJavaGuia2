/*

*/
package sistema;

import cadena.Cadena;
import java.util.Locale;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        // Ejercicio 8
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cadena frase = new Cadena("Hola mundo");
        System.out.println(frase.getFrase());
        System.out.println(frase.getLongitud());
        System.out.print("Ingrese una cadena de caracteres: ");
        String letra = leer.next();
        frase.setFrase(letra);
        System.out.println(frase.getFrase());
        System.out.println(frase.getLongitud());
        System.out.println("Cantidad de vocales en frase: "+ frase.mostrarVocales());
        frase.invertirFrase();
        System.out.println(frase.getFrase());
        System.out.print("Ingrese una letra que quiera buscar: ");
        letra = leer.next();
        System.out.println("Cantidad que se repite "+letra+": "+frase.vecesRepetido(letra));
        System.out.print("Ingrese una cadena para compara las longitudes: ");
        letra = leer.next();
        frase.compararLongitud(letra);
        System.out.print("Ingrese una frase que quiera unir a la que ya esta: ");
        letra = leer.next();
        frase.unirFrases(letra);
        System.out.print("Ingrese una letra para cambiar las 'a': ");
        letra = leer.next();
        frase.reemplazarLetra(letra);
        System.out.print("Ingrese una letra para saber si esta en la frase: ");
        letra = leer.next();
        System.out.println("¿La letra "+letra+" esta en la frase?"+ frase.contieneLetra(letra));
        
        
        
    }

    
    
    
}
