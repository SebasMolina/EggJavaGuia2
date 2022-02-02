/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
*/
package sistema;

import java.util.Arrays;

public class Sistema {

    public static void main(String[] args) {
        // Ejercicio 10
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        //imprimir desordenado
        for(int i=0; i<arregloA.length;i++){
            arregloA[i]= Math.random() * 11;
            System.out.printf("%.2f|",arregloA[i]);
        }
        System.out.println("");
        Arrays.sort(arregloA);
        //imprimir ordenado
        for(int i=0; i<arregloA.length;i++){
            arregloA[i]= Math.random() * 11;
            System.out.printf("%.2f|",arregloA[i]);
        }
        System.out.println("");
    }
    
}
