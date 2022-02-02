/*

*/
package sistema;

import cuenta.Cuenta;

public class Sistema {

    public static void main(String[] args) {
        //Ejercicio 5
        Cuenta nuevaCuenta = new Cuenta();
        nuevaCuenta.crearCuenta();
        nuevaCuenta.consultarSaldo();
        nuevaCuenta.ingresarDinero(1000);
        nuevaCuenta.extraccionRapida(5000);
        nuevaCuenta.consultarSaldo();        
    }
    
}
