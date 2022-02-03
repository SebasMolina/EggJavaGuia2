/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
*/
package persona;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
/*
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.    
*/
    public void crearPersona() throws ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        //le da formato a la fecha
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US); 
        System.out.print("Ingrese el nombre: ");
        nombre = leer.next();
        System.out.print("Ingrese la fecha de nacimiento (dd/mm/aaaa): ");
        String fecha = leer.next();
        fechaNacimiento = formato.parse(fecha);
        
        }
//• Metodo mostrarPersona(): este método muestra la persona creada en el método anterior.    
    public void mostrarPersona(){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nombre: "+nombre);
        System.out.println("Fecha de nacimiento: "+formato.format(fechaNacimiento));
        //imprime con el formato que le dimos
        int edad = calcularEdad();
        System.out.println("Edad: "+edad);
    }
/*Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.*/
    public int calcularEdad(){
        Date fechaActual = new Date();
        int anioActual,anioNacimiento,mesActual,mesNacimiento,diaActual,diaNacimiento;
        anioActual = fechaActual.getYear()+1900;
        mesActual = fechaActual.getMonth()+1;
        diaActual= fechaActual.getDate();
        anioNacimiento = fechaNacimiento.getYear()+1900;
        mesNacimiento= fechaNacimiento.getMonth()+1;
        diaNacimiento = fechaNacimiento.getDate();
        int edad=0;
        if (mesNacimiento<=mesActual){
            if (diaNacimiento<=diaActual){
                edad = anioActual-anioNacimiento;
            } else {
                edad = anioActual-anioNacimiento-1;
            }            
        } else {
                edad = anioActual-anioNacimiento-1;
        }
        return edad;
    }

/*
Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.    
*/
    public boolean esMenorQue(int edad){
        boolean resultado = false;
        int miEdad = this.calcularEdad();
        if(miEdad < edad){
            resultado = true;
        }
        return resultado;
    }
    
}
