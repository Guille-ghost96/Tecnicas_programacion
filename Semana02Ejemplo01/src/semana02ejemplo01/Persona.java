
package semana02ejemplo01;

/**
 *
 * @author Samael
 */
public class Persona {
    //el indicador de ambito privado indicca que los atributos no
    //serean visibkles desde fuera de clase Persona
    private String nombre;
    private String apellido;
    private int edad;
    private String profesion;
    
    //como los atributos estan en privado, debedmos programar
    //metodos publicos que permitan acceder a ellos
    //estos metodos se llaman "metodos de acceso"
    public void getNombre(String nombre){
        //al atributo nombre de esta clase, le asignamosel
        // valor almacenado en el parametro nombre
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    

    

    
    
}
