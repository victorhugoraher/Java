package ProgramasPragmáticos;       //Modificar el nombre del paquete que utilizas o utlizarás para desarrollar dicho programa.
import java.util.Scanner;           //Se importa la clase Scanner (Permitirá ingresar datos desde el teclado).


/**
 * Nombre del programa: Área de un Cuadrado.
 * ---
 * "El programa Área de un Cuadrado, calcula el área de un cuadrado mediante los datos que ingresa el usuario.
 * Para desarrollar éste programa: Se utilizó la clase Scanner y el operador "*".
 * ---
 * Fecha de creación: 22/03/2021
 * Hora: 10:45 am
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: / /2021
 * Hora última de modificación: : 
 *
 */


public class ÁreaCuadrado {             //Se inicia la clase
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);        //Se declara la clase Scanner.
        int a, la1, la2;                                //Se declaran variables.
        
        System.out.println("\t\t\t\t\t\tÁrea de un Cuadrado\n");    //Línea impresa del título del programa.
        System.out.print("Ingresa el número para el lado 1: ");     //Primer mensaje de impresión para ingresar datos por teclado.
        la1=input.nextInt();                                        //Lee los datos que ingresan por teclado.
        
        System.out.print("Ingresa el número para el lado 2: ");     //Segundo mensaje de impresión para ingresar datos por teclado.
        la2=input.nextInt();                                        //Lee los datos que ingresan por teclado.
        
        a=la1*la2;                                                  //Área= lado * lado.
        
        System.out.println("El área del cuadrado es: " + a);        //Línea de impresión para mostrar el resultado.
    }
}
