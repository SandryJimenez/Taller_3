
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author SANDRY
 */
public class Punto_11Final {
    public static void main(String args[])
 {        

 Scanner entrada = new Scanner(System.in);
 int numero;
 Punto_11 miObjeto = new Punto_11();


 System.out.println("\nEste programa recibe un entero y lo presenta con los ");
 System.out.println("digitos invertidos. ");
 System.out.println("\nPor favor introduzca un numero: ");
 numero = entrada.nextInt();

 System.out.println("\nEste es el numero invertido:\n ");
 miObjeto.Invierte( numero );

 
 }     
}
