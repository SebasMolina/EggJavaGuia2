/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
*/
package cuenta;

import java.util.Locale;
import java.util.Scanner;

public class Cuenta {
    private int nroCuenta;
    private long dni;
    private double saldo;
    private double interes;

    public Cuenta() {
    }

    public Cuenta(int nroCuenta, long dni, double saldo, double interes) {
        this.nroCuenta = nroCuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.interes = interes;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void crearCuenta(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese el número de cuenta: ");
        nroCuenta = leer.nextInt();
        System.out.print("Ingrese el DNI: ");
        dni = leer.nextLong();
        System.out.print("Ingrese el saldo: ");
        saldo = leer.nextDouble();
        System.out.print("Ingrese los intereses: ");
        interes = leer.nextDouble();
    }
    //Método ingresar(double ingreso): el método recibe una cantidad de dinero a
    // ingresar y se la sumara a saldo actual.
    public void ingresarDinero(double ingreso){
        this.saldo += ingreso;
    }
    
    /*
    Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
    se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
    pondrá el saldo actual en 0.
    */
    public void retirarDinero(double retiro){
        if (retiro>=saldo){
            System.out.println("No es posible realizar la operacion. El saldo no es suficiente.");
        } else {
            System.out.println("Se retiro $"+retiro+"de forma correcta.");
            saldo -= retiro;
        }
    }
    /*
    Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
    que el usuario no saque más del 20%.
    */
    public void extraccionRapida(double retiro){
        double porcentajeSaldo = saldo*0.20;
        
        if (retiro <= porcentajeSaldo){
            this.retirarDinero(retiro);
        } else {
            System.out.println("No se ha podido realizar la operacion.");
        }
    }
    
    //Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(){
        System.out.printf("Saldo: %.2f\n",saldo);
    }
    
    public void consultarDatos(){
        System.out.printf("Numero cuenta: %d\n",nroCuenta);
        System.out.printf("DNI: %s\n",dni);
        this.consultarSaldo();
        System.out.printf("Intereses: %.2f\n", interes);
    }
    
}
