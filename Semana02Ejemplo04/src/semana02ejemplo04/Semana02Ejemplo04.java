
package semana02ejemplo04;

import java.util.Scanner;

/**
 *
 * @author Samael
 */
public class Semana02Ejemplo04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programa que permita crear n objeto de clase Estudiante.
        //Cada objeto tendra el nombre de un estudiante y una calificaion. El
        //usuario ingresara el nombre de cada estudiante y su calificacion . La
        //cantidad de estudiantes es indeterminada. Al finalizar el ingreso
        //el sistema debera mostrar un reporte que indique la calificacion 
        //cada estudiante ingresado y el promedio general del aula.
        
        Scanner teclado = new Scanner(System.in);
        
        int respuesta = 1; //variable que recogera la respuesta del usuario de si quiere continuar o no ingresar datos
        int suma = 0; // acumulador de las calificaciones de cada estudiante
        int contador = 0; //contador de estudiantes
        //suma y contador serviran  para calcular el promedio
        //cuando no conocemos de antemano la cantidad de iteraciones que realizara un bucle, podemos usar
        //un bucle, podemos usar while
        while(respuesta != 0){
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = teclado.nextLine();
            System.out.print("Ingrese la calificacion: ");
            int calificacion = teclado.nextInt();
            
            Estudiante estudiante = new Estudiante(nombre, calificacion);
            estudiante.mostrarDatos();
            suma += estudiante.getCalificacion();
            contador++;
            
            System.out.print("¿Desea continuar? [Si  | 1]  [No | 0]");
            respuesta = teclado.nextInt();
            teclado.nextLine(); //limpieza de buffer
        }
        //teminado el while, he creado n objetos y he acumualado la suma
        //de sus calificaciones y contador he almacenado la cnatidad de estudiantes
        
        System.out.println("Promedio del aula: " + (suma/contador));
    }
    
}
