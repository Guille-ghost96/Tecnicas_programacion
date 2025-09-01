
package semana02ejemplo03;

/**
 *
 * @author Samael
 */
public class Semana02Ejemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Digitar los atributos  de un objeto de la clase Persona, mostrar sus 
        //datos en pantalla y determinar si es mayor o menor de edad
        
        Persona persona = new Persona("Carolina", "Sanchez", 34);
        //el objeto persona que estamos creado con este constructor, se genera
        //con los atributos que se colocan como parametros
        
        //toString() convierte la informacion de un objeto en una cadena
        System.out.println(persona.toString());
        persona.determinaCondicion();
        
        Persona persona1 =new Persona("Gonzalo", "Ortiz", 10);
        System.out.println(persona1.toString());
        persona1.determinaCondicion();
        
    }
    
}
