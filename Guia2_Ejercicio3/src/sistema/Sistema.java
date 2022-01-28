/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
*/
package sistema;

import operacion.Operacion;

public class Sistema {

    public static void main(String[] args) {
        //Ejercicio 3
        
        Operacion nuevaOperacion = new Operacion();
        
        nuevaOperacion.crearOperacion();
        System.out.printf("Numeros: %.2f y %.2f\n",nuevaOperacion.getNro1(),nuevaOperacion.getNro2());
        System.out.printf("Suma: %.2f + %.2f = %.2f\n", nuevaOperacion.getNro1(),nuevaOperacion.getNro2(),nuevaOperacion.sumar());
        System.out.printf("Resta: %.2f - %.2f = %.2f\n", nuevaOperacion.getNro1(),nuevaOperacion.getNro2(),nuevaOperacion.restar());
        System.out.printf("Multiplicacion: %.2f * %.2f = %.2f\n", nuevaOperacion.getNro1(),nuevaOperacion.getNro2(),nuevaOperacion.multiplicar());
        System.out.printf("Division: %.2f / %.2f = %.2f\n", nuevaOperacion.getNro1(),nuevaOperacion.getNro2(),nuevaOperacion.dividir());
    }
    
}
