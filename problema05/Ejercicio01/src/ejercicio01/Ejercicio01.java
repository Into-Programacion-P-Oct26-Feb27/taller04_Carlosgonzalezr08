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

        // Declarar las variables
        String cliente;
        double netflix;
        double youtube;
        double dropbox;
        double spotify;

        double descuentoNetflix;
        double descuentoYoutube;
        double descuentoDropbox;
        double descuentoSpotify;

        double precioNetflix;
        double precioYoutube;
        double precioDropbox;
        double precioSpotify;

        double costoTotal;
        double ahorroTotal;
        double totalPagar;

        
        System.out.print("Ingrese el nombre del cliente: ");
        cliente = entrada.nextLine();
        System.out.print("Ingrese el precio de Netflix: ");
        netflix = entrada.nextDouble();
        System.out.print("Ingrese el precio de YouTube Premium: ");
        youtube = entrada.nextDouble();
        System.out.print("Ingrese el precio de Dropbox: ");
        dropbox = entrada.nextDouble();
        System.out.print("Ingrese el precio de Spotify: ");
        spotify = entrada.nextDouble();
       
        
        descuentoNetflix = netflix * 0.23;
        descuentoYoutube = youtube * 0.23;
        descuentoDropbox = dropbox * 0.45;
        descuentoSpotify = spotify * 0;
        precioNetflix = netflix - descuentoNetflix;
        precioYoutube = youtube - descuentoYoutube;
        precioDropbox = dropbox - descuentoDropbox;
        precioSpotify = spotify - descuentoSpotify;
        costoTotal = netflix + youtube + dropbox + spotify;
        ahorroTotal = descuentoNetflix + descuentoYoutube
                    + descuentoDropbox + descuentoSpotify;
        totalPagar = costoTotal - ahorroTotal;

        System.out.println("-----------------------------------------------");
        
        System.out.printf("Nombre: %s\nNetflix: %.2f\nYouTube Premium: %.2f\n"
                + "Dropbox: %.2f\nSpotify: %.2f\n",
                cliente,
                netflix,
                youtube,
                dropbox,
                spotify);
        System.out.println("----------------------------------------------");
        
        System.out.printf("Descuentos:\nNetflix: %.2f\nYouTube Premium: %.2f\n"
        + "Dropbox: %.2f\nSpotify: %.2f\n",
        descuentoNetflix,
        descuentoYoutube,
        descuentoDropbox,
        descuentoSpotify);
        
        System.out.println("------------------------------------------------");
        
        System.out.printf("Precios finales:\nNetflix: %.2f\nYouTube Premium: %.2f\n"
        + "Dropbox: %.2f\nSpotify: %.2f\n",
        precioNetflix,
        precioYoutube,
        precioDropbox,
        precioSpotify);
        
        System.out.println("------------------------------------------------");
        
        System.out.printf("Costo mensual sin descuentos: %.2f\nAhorro mensual"
        + " total: %.2f\nTOTAL A PAGAR: %.2f\n",
        costoTotal,
        ahorroTotal,
        totalPagar);

    }
    
}
