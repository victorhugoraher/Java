package ProgramasPragmáticos;        //Modificar el nombre del paquete que utilizas o utlizarás para desarrollar dicho programa.
import java.util.Scanner;            //Se importa la clase Scanner (Permitirá ingresar datos desde el teclado).


/**
 * Nombre del programa: Área de un Romboide.
 * ---
 * "El programa Área de un Romboide, calcula el área de un romboide mediante los datos que ingresa el usuario.
 * Para desarrollar éste programa: Se utilizó la clase Scanner, el operador "*".
 * ---
 * Fecha de creación: 24/03/2021
 * Hora: 06:45 am
 * @author Víctor Hugo Raher
 * @version java 1.8.0_281
 * Fecha última de modificación: / /2021
 * Hora última de modificación: : 
 *
 */


public class ÁreaRomboide {          //Se inicia la clase
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);        //Se declara la clase Scanner.
        int a, ba, al;                                  //Se declaran variables.
        
        System.out.println("\t\t\t\t\t\tÁrea de un Romboide\n");//Línea impresa del título del programa.
        System.out.print("Ingresa el número para la base: ");   //Primer mensaje de impresión para ingresar datos por teclado.
        ba=input.nextInt();                                     //Lee los datos que ingresan por teclado.
        
        System.out.print("Ingresa el número para la altura: "); //Segundo mensaje de impresión para ingresar datos por teclado.
        al=input.nextInt();                                     //Lee los datos que ingresan por teclado.
        
        a=ba*al;                                                //Área= base * altura.
        
        System.out.println("El área del romboide es: " + a);    //Línea de impresión para mostrar el resultado.
    }
}


