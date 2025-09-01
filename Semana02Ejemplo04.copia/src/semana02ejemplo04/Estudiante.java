/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana02ejemplo04;

/**
 *
 * @author Samael
 */
public class Estudiante {
    //atributos en privado
    private String nombre;
    private int calificacion;
    //constructor
    public Estudiante(String nombre, int calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    //metodo auxiliar 
    public void mostrarDatos(){
        System.out.println(this.nombre  + "\t" + this.calificacion);              
    }
}

