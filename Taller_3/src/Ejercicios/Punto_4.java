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
public class Punto_4 {
    public static void main(String[] args) {
        int cont, acum,horaem,hr,horasema,horaext,sb;
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa para calcular sueldo bruto de un trabajador : ");
        System.out.println("Digitar cantidad de empleados: ");
        cont=sc.nextInt();
        
      
        for (int i = 0; i <cont; i++) {
            acum=+1;
            System.out.println("Cantidad de horas del empleado "+ (i+1));
            horaem=sc.nextInt();
            System.out.println("Digitar el Precio de la hora:");
            hr=sc.nextInt();
            
            horasema=horaem-40;
             horaext= (int)(float)( horasema*hr*1.5);
            
             sb= horaext+(40*hr);
             
            System.out.println("el sueldo bruto es: "+sb);
            
        }
    }
}
