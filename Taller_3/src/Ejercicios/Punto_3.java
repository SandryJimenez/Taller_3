
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author SANDRY
 */
public class Punto_3 {
    public static void main(String[] args) {
        
            Scanner entrada = new Scanner(System.in);
    
            double PagoSem = 200, VDS, PagoTot, h, m;

            System.out.println("Favor ingrese el valor de ventas de la semana: ");
            VDS=entrada.nextInt();       

            if (VDS>3000 && VDS<5000){
                h=VDS*0.09;
                m=VDS*0.05;
                PagoTot=PagoSem+h+m;
                System.out.println("Su pago es de:--- "+ PagoTot);


                }else if(VDS>=5000 && VDS<=7000){
                    h=VDS*0.09;
                    m=VDS*0.07;
                    PagoTot=PagoSem+h+m;
                    System.out.println("Su pago es de:----"+ PagoTot);


                    }else if(VDS>7000 && VDS<10000){
                        h=VDS*0.09;
                        m=VDS*0.1;
                        PagoTot=PagoSem+h+m;
                        System.out.println("Su pago es de:----"+ PagoTot);


                        }else if(VDS>=10000 && VDS<=15000){
                            h=VDS*0.09;
                            m=VDS*0.1;
                            PagoTot=PagoSem+h+m;
                            System.out.println("Su pago es de: ----"+ PagoTot);


                            }else if(VDS>15000){
                                h=VDS*0.09;
                                m=VDS*0.13;
                                PagoTot=PagoSem+h+m;
                                System.out.println("Su pago es de:---- "+ PagoTot);


                                }else{
                                    h=VDS*0.09;
                                    PagoTot=PagoSem+h;
                                    System.out.println("Su pago es de:---- "+ PagoTot);

                    }
    
        }
}

