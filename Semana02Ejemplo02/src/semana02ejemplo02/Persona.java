
package semana02ejemplo02;

/**
 *
 * @author Samael
 */
public class Persona {
    //atributos
    private String nombre;
    private String apellido;
    private int edad;
    private String profesion;
    
    
    //metodos de acceso
    public String getNombre() {
        return nombre;
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
    
    //metodos auxiliares
    public void mostrarDatos(){
        //metodo que imprime en pantalla la informacion de un objeto
        
        System.out.println("DATOS DE LA PERSONA");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Edad: " + this.edad);
        
    }
    
    public void determinaCondicion(){
        //metodo que indica si una persona e smayor o menor de edad
        if (this.edad>=18){
            System.out.println("La perosna es mayor de edad");
        }else{
            System.out.println("La persona es menor de edad");
        }
    }
}
