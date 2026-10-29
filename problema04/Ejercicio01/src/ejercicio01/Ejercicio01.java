/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        // declarar las variables
        String cliente;
        double cpu;
        double teclado;
        double raton;
        double pantalla;
        
        double costoBase;
        double costoAdicional;
        double costoTotal;
        
        System.out.print("Ingrese los nombres del cliente: ");
        cliente = entrada.nextLine();
        System.out.print("Ingrese el costo de la CPU: ");
        cpu = entrada.nextDouble();
        System.out.print("Ingrese el costo del teclado: ");
        teclado = entrada.nextDouble();
        System.out.print("Ingrese el costo del raton: ");
        raton = entrada.nextDouble();
        System.out.print("Ingrese el costo de la pantalla: ");
        pantalla = entrada.nextDouble();
        
        
        costoBase = cpu + teclado + raton + pantalla;
        costoAdicional = costoBase * 0.15;
        costoTotal = costoBase + costoAdicional;
        
        System.out.println("------------------------------------------------");
        
        System.out.printf("Reporte:\nNombres del cliente: %s\nValores Iniciales:"
                +"\nCPU: %.2f\nTeclado: %.2f\nRaton: %.2f\nPantalla: %.2f\n\n"
                +"Costo base: %.2f\nCosto Adicional del 15%%: %.2f\nCosto Final:"
                +" %.2f\n",
                
                cliente,
                cpu,
                teclado,
                raton,
                pantalla,
                costoBase,
                costoAdicional,
                costoTotal);
    }
    
}
