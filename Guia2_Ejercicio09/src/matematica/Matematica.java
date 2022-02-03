/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
package matematica;

public class Matematica {
    private double numero1;
    private double numero2;

    public Matematica() {
    }

    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
//• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor    
    public double devolverMayor(){
        return (Math.max(numero1, numero1));
    }
//• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
// elevado al menor número. Previamente se deben redondear ambos valores.
    public int calcularPotencia(){
        int resultado;
        numero1= (int) Math.round(numero1);
        numero2 = (int) Math.round(numero2);
        int max = (int) Math.max(numero1, numero2);
        int min = (int) Math.min(numero1, numero2);
        resultado = (int) Math.pow(max, min);
        System.out.println("Numero1 redondeado "+ numero1);
        System.out.println("Numero2 redondeado "+ numero2);
        return resultado;
    }
//• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
// Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    public double calcularRaiz(){
        double absoluto, resultado;
        int min = (int) Math.min(numero1, numero2);
        absoluto = Math.abs(min);
        resultado = Math.sqrt(absoluto);
        return resultado;
    }    
}