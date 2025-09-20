package latinasincloud;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Scanner teclado =new Scanner(System.in);
        int opcionIngresada = 0;
        do {
            System.out.println("--- ¡Bienvenida! ¿Que deseas hacer hoy?");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar Dinero");
            System.out.println("4. Salir");
            System.out.println(">Selecciona una opción: ");
            opcionIngresada = teclado.nextInt();

            teclado.nextLine();
        }while (opcionIngresada != 5);

        }
    }
