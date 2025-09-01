
package semana01ejemplo04;

import java.util.Scanner;

/**
 *
 * @author Samael
 */
public class Semana01Ejemplo04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //programa que genera una clase llamada Persona.
        //el usuario ingresa los datos (nombre, apellido y edad) via teclado
        //y estos son almacenados
        //en un objeto de la clase Persona
        //finalmente se visualizan los datos
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = teclado.nextLine(); //nextLine() recoge la informacion digitada
                                            // por el ususario en forma de cadena de texto
        System.out.println("Ingrese el apellido: ");
        String apellido = teclado.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = teclado.nextInt();
        
        //en las variables nombre, apellido y edad estan los datos que el usuario ha
        // digitado, vamos a crear un objeto de la clase persona y colocar estos datos 
        // en sus atributos
        
        Persona persona = new Persona();
        //Clase objeto = new Constructor()
        persona.nombre = nombre;
        persona.apellido = apellido;
        persona.edad = edad;
        //Mostramos los datos
        System.out.println("Nombre: " + persona.nombre);
        System.out.println("Apellido: " + persona.apellido);
        System.out.println("Edad: " + persona.edad);
        
    }
    
}
