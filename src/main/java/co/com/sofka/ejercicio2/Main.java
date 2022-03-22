package co.com.sofka.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int cont = 0;
        List<String> mensajes = new ArrayList<>();
        do{
            String mensaje;
            System.out.print("->: ");
            mensaje = scanner.next();

            mensajes.add(mensaje);

            cont++;

        }while (cont != 5);


        FiltrarPalabras filtrarPalabras = new FiltrarPalabras();

        System.out.println(filtrarPalabras.filtrarMalasPalabras(mensajes));
    }
}
