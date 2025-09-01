
package semana02ejemplo01;

import java.util.HashSet;

/**
 *
 * @author Samael
 */
public class Semana02Ejemplo01 {

    
    public static void main(String[] args) {
        //Creamos un objetos perosna de la clse Persona
        
        Persona persona = new Persona();
        //persona.nombre="Luis";//no se puede hacer
        persona.setNombre("Luis");
        persona.setApellido("Romero");
        persona.setEdad(44);
        persona.setProfesion("Ingeniero");
        
        //System.out.println("Nombre: "+ persona.nombre); //incorrecto!!
        
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Profesion: " + persona.getProfesion());
                
        
    }
    
}
