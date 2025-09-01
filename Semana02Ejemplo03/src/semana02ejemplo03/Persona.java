package semana02ejemplo03;

/**
 *
 * @author Samael
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    
    //metodo constructor 
    //lleva el mimso nombre de la clase
    // no devuelve ningun valor (no se coloca void)
    //puede o no tenre parametros
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    //-----

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

    @Override
    public String toString() {
        return "Persona{" + "nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + '}';
    }
    
    public void determinaCondicion(){
        //metodo que indica si una persona e smayor o menor de edad
        if (this.edad>=18){
            System.out.println("La persona es mayor de edad");
        }else{
            System.out.println("La persona es menor de edad");
        }
    }
    
    
}
