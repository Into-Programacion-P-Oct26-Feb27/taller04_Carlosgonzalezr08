/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        // declarar las variables
        String nombre;
        String direccion;
        double costo;
        double minutos;
        double total;
        
        System.out.println("Ingrese el nombre del Titular");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la direccion del Titular");
        direccion = entrada.nextLine();
        
        System.out.println("Ingrese el Costo por minuto");
        costo = entrada.nextDouble();
        System.out.println("Ingrese los minutos consumidos");
        minutos = entrada.nextDouble();
        
        total = costo*minutos;
        
        System.out.printf("Titular: %s\nDireccion: %s\nCosto por minuto: %.2f\n"
                + "Minutos consumidos: %.2f\nVALOR TOTAL A PAGAR: %s\n",
                nombre,
                direccion,
                costo,
                minutos,
                total);
                
       
    }
    
}
