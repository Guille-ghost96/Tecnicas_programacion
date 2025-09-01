package semana01ejemplo03;

import java.util.Scanner;

/**
 *
 * @author Samael
 */
public class Semana01Ejemplo03 {

    public static void main(String[] args) {
        //Solici a un usuario su edad, el usuario la ingresa via
        //teclado y el sistema indica si es mayor o menor de edad
        Scanner teclado = new Scanner(System.in);
        //el objeto teclado se encarga de recoger informacion que el
        //usuario digita en el teclado
        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();//nextInt() es un metodo que permite
                            // capturar lo que se ingresa via teclado
                            // y almacenarlo en forma entero
        if(edad >= 18){
            System.out.println("El usuario es mayor de edad.");         
        }else{
            System.out.println("El usuario es menor de edad.");
                 
        }
    }
    
}
