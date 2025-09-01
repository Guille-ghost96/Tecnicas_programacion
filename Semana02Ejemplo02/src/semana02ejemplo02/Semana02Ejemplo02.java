
package semana02ejemplo02;

import java.util.Scanner;


public class Semana02Ejemplo02 {
    
    
    public static void main(String[] args) {
        //programa que recibe datos del usuario, con esos datos crea ujn objetos
        //de la clase Persona, muestra la informacion ingresas por le usuario
        //e indica si la persona es mayor o menor de edad
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        String nombre = teclado.nextLine();
        //el metodo nextLine() recoge lo que el usuario digita y lo almacena
        //como una cadena de texto
        System.out.println("Ingrese un apellido: ");
        String apellido = teclado.nextLine();
        
        System.out.println("Ingrese un edad: ");
        int edad = teclado.nextInt();
        
            
        Persona persona = new Persona();
        //con el metodo setNombre coloco el valor de la variable nombre
        //que es el que el teclado recogio
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setEdad(edad);
        
        //mostramos la informacion almacenada en el objeto persona
        persona.mostrarDatos();
        persona.determinaCondicion();
        
        
    }
    
}
