/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:

*/
package cafetera;

public class Cafetera {

    private double capacidadMaxima;
    private double cantidadActual;
// • Constructor predeterminado o vacío

    public Cafetera() {
    }
// • Constructor con la capacidad máxima y la cantidad actual

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
// • Métodos getters y setters.

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
// • Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.

    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
        System.out.println("Se lleno la Cafetera");
    }

    /*
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.    
     */
    public boolean servirTaza(int tamanio) {
        boolean seLleno = false;
        if (tamanio <= this.cantidadActual) {
            this.cantidadActual -= tamanio;
            seLleno = true;
            return seLleno;
        } else {
            System.out.printf("Se cargó %.2f de %d\n", this.cantidadActual, tamanio);
            this.cantidadActual = 0;
            return seLleno;
        }

    }
// • Método vaciarCafetera(): pone la cantidad de café actual en cero.    

    public void vaciarCafetera() {
        this.cantidadActual = 0;
        System.out.println("Se vació la cafetera.");
    }
/*
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
    
*/
    public void agregarCafe(int cantidad){
        this.cantidadActual += cantidad;
        System.out.println("Se agregó "+cantidad+" litros");
    }
    
}
