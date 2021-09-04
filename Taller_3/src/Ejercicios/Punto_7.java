
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author SANDRY
 */
public class Punto_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite cantidad de numeros: ");
        int contador=sc.nextInt();
        
        int mayor=0;
        
        for (int i = 0; i < contador; i++) {
            System.out.println("Digite numero"+(i+1));
            int numero=sc.nextInt();
            
            if(i==0){
                mayor=numero;
                
            }else if(numero>mayor){
            mayor=numero;
            }
        }
        System.out.println("El numero Mayor es: "+ mayor);
        
    }
}
