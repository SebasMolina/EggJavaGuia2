/*

*/
package sistema;

import matematica.Matematica;

public class Sistema {

    public static void main(String[] args) {
        // Ejercicio 9
        Matematica nuevo = new Matematica();
        
        nuevo.setNumero1(Math.random() * 11);
        nuevo.setNumero2(Math.random() * 11);
        
        System.out.printf("El numero1 es %.2f y el numero2 es %.2f\n",nuevo.getNumero1(),nuevo.getNumero2());
        System.out.printf("El mayor es: %.2f\n", nuevo.devolverMayor());
        System.out.printf("La potencia del mayor valor elevado al menor valor es: %d\n",nuevo.calcularPotencia());
        System.out.printf("La raiz cuadrada del menor valor es: %.2f\n",nuevo.calcularRaiz());
        
    }
    
}
