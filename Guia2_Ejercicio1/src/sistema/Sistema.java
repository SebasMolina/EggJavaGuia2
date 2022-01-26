package sistema;

import libro.Libro;

public class Sistema {

    public static void main(String[] args) {
        //Ejercicio 1
        Libro libro = new Libro("121204912", "Martin Fierro", "Jose Hernandez", 700);
        
        System.out.println(libro.imprimir());
    }
    
}
