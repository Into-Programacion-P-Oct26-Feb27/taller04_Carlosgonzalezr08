/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecicio01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Ejecicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        // declarar las variables
        String nombreProyecto1;
        double gastoMensual1;
        String nombreProyecto2;
        double gastoMensual2;
        String nombreProyecto3;
        double gastoMensual3;
        double gastoMensualTotal;
        
        System.out.println("Ingrese nombre del Proyecto 1");
        nombreProyecto1 = entrada.nextLine();
        System.out.println("Ingrese el gasto mensual");
        gastoMensual1 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese nombre del Proyecto 2");
        nombreProyecto2 = entrada.nextLine();
        System.out.println("Ingrese el gasto mensual");
        gastoMensual2 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese nombre del Proyecto 3");
        nombreProyecto3 = entrada.nextLine();
        System.out.println("Ingrese el gasto mensual");
        gastoMensual3 = entrada.nextDouble();
        
        gastoMensualTotal = gastoMensual1 + gastoMensual2 + gastoMensual3;
        
        System.out.printf("Proyecto 1: %s\nGasto Mensual: %.2f\nProyecto 2: %s\n"
                +"Gasto Mensual: %.2f\nProyecto 3: %s\nGasto Mensual: %.2f\n"
                +"Gasto Total: %.2f\n",
                nombreProyecto1,
                gastoMensual1,
                nombreProyecto2,
                gastoMensual2,
                nombreProyecto3,
                gastoMensual3,
                gastoMensualTotal);
        
    }
    
}
