/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:

• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
*/
package cadena;

public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }
    
    public Cadena(String frase){
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.setLongitud(frase.length());
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
//Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public int mostrarVocales(){
        int cantidad=0;
        String letra;
        for (int i=0; i<longitud;i++){
            letra = frase.substring(i, i+1);
            if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")){
                cantidad++;
            }
        }
        return cantidad;
    }
    
//Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
    public void invertirFrase(){
        String fraseInvertida="";
        for (int i=longitud-1; i>=0;i--){
            fraseInvertida += frase.charAt(i);
        }
        System.out.println(fraseInvertida);
    }
//Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
//y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    public int vecesRepetido(String letra){
        int cantidad=0;
        String caracter;
        for (int i=0; i<longitud;i++){
            caracter = frase.substring(i, i+1);
            if (caracter.equalsIgnoreCase(letra)){
                cantidad++;
            }
        }
        return cantidad;
    }
//Método compararLongitud(String frase), deberá comparar la longitud de la frase
//que compone la clase con otra nueva frase ingresada por el usuario.    
    public void compararLongitud(String nuevaFrase){
        int nuevaLongitud = nuevaFrase.length();
        if(longitud<nuevaLongitud){
            System.out.println("La nueva frase tiene longitud mayor");
        }else if(longitud>nuevaLongitud){
            System.out.println("La frase de la clase tiene longitud mayor");
        } else {
            System.out.println("Las longitudes son iguales");
        }
    }    
    //concat
//Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.    
    public void unirFrases(String nuevaFrase){
        
        frase = frase.concat(nuevaFrase);
        System.out.println("La frase concatenada es: "+ frase);
    }
    
    //replace
//Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y
//mostrar la frase resultante.
    public void reemplazarLetra(String letra){
        frase = frase.replace("a", letra);
        System.out.println("La nueva frase es: "+ frase);
    }
    
    //contains
//Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public boolean contieneLetra(String letra){
        return frase.contains(letra);
    }
    
}
