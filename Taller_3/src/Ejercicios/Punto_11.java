
package Ejercicios;

/**
 *
 * @author SANDRY
 */
public class Punto_11 {
     public int Cuenta( int x ){
  
 int divisor = 1;
 int contador = 0; 
 int digito = 1;

 while ( 0 != digito )
 {      
  
 digito = x / divisor;
 divisor *= 10;
 contador++;

 }      

 return --contador;

 }      



 public void Invierte (int y ) 

 {         
 
 int digitos = Cuenta(y);

 for (int i = 1; i < digitos; i++)
 {       
 System.out.printf("\t%d", y % 10);     
 y /= 10;
          
 }       

 System.out.printf("\t%3d", y);
 System.out.println("\n");

 }         
}
