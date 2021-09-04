/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author SANDRY
 */
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Punto_5 {
    public static void main(String[] args) {
        
        String [] cabezera ={"Columna", "Candidato A", "Candidato B", "Candidato C", "Candidato D"};
        String [][] datos = {

                {"1","194","48","206","45"},
                {"2","180","20","320","16"},
                {"3","221","90","140","20"},
                {"4","432","50","821","14"},
                {"5","820","61","946","18"},
            };
    
    
    DefaultTableModel mod = new DefaultTableModel(datos, cabezera);
    JTable tabla = new JTable (mod);
    
    JScrollPane scroll = new JScrollPane(tabla);
    scroll.setBounds(40,40,400,400);
    
    JFrame ventana = new JFrame();
    ventana.setLayout(null);
    ventana.setSize(500,300);
    ventana.setLocationRelativeTo(null);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    ventana.add(scroll);
    ventana.setVisible(true);
    
    }
   }
