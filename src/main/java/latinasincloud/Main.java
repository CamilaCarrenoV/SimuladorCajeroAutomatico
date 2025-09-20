package latinasincloud;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado =new Scanner(System.in);
        int saldo = 0;
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
            switch (opcionIngresada) {
                case 1:
                    System.out.println("Tu saldo actual es: $" + saldo);

                    break;

                case 2:
                    System.out.println("ingresa la cantidad que deseas depositar: ");

                    int deposito = teclado.nextInt();

                    teclado.nextLine();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósitaste $" + deposito + " con éxito");
                    } else {
                        System.out.println("Error: ingresa un número positivo");
                    }

                    break;

                case 3:
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opción ingresada no es válida. Intenta nuevamente");
                    break;
            }
        }while (opcionIngresada != 5);

        }
    }
