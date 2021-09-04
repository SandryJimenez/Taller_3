/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author SANDRY
 */
public class Punto_10 {
     public void RecibeP(){
        
        Scanner sc = new Scanner(System.in);
        double Horas = 0;
        double Cargo = 0;
        double Total = 0;
        int Contador = 1;
    
        System.out.println("\nBienvenido al sistema de cobro del estacionamiento.");

        System.out.printf("Por favor dijite el numero de horas del coche: %d:\n", Contador++);
        System.out.print("\n( 0 para terminar)\n");
        Horas =  sc.nextDouble();

        while ( 0 != Horas ){     

        System.out.printf("\nEl cargo para este usuario es de: %.2f\n", Cargo(Horas));
        Total += Cargo(Horas);

        System.out.printf("Por favor dijite el numero de horas del coche: %d:\n", Contador++);
        System.out.print("\n(0 para terminar)\n");
        Horas =  sc.nextDouble();

        } 

        System.out.printf("\nEl cargo total del dia es: %.2f\n", Total);

        }   



    public double Cargo( double x){    

        if ( 3 >= x )
            return 2.0;

            else
                return (2 + 0.5*Math.ceil(x - 3)) <= 10? 2 + 0.5*Math.ceil(x -3) : 10; 

    }     

}
