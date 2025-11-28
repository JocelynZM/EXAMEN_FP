package examen2_25550423;

import java.util.Scanner;

public class Examen2_25550423 {

    public static void main(String[] args) {

        Scanner captura = new Scanner(System.in);

        int numero;
        int opcion;
        int opcions;

        do {

            System.out.println("¿DESEA CALCULAR NUMERO PRIMO?");
            System.out.println("0 - CALCULAR");
            System.out.println("1 - SALIR");
            opcion = captura.nextInt();

            if (opcion == 0) {

                System.out.println("SELECCIONE COMO DESEA MOSTRAR:");
                System.out.println("0 - PRIMOS");
                System.out.println("1 - NO PRIMOS");
                opcions = captura.nextInt();

                if (opcions == 0) { // PRIMO
                    System.out.println("INGRESE EL NUMERO: ");
                    numero = captura.nextInt();
                    System.out.println();

                    for (int i = 2; i <= numero; i++) {
                        int resultado = numero % i;

                        if (resultado == 0) {
                            for (int a = 1; a <= i; a++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    }

                    for (int i = 2; i <= numero; i++) {
                        int resultado = numero % i;

                        if (resultado == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();

                } else if (opcions == 1) { // NO PRIMO

                    System.out.println("INGRESE EL NUMERO: ");
                    numero = captura.nextInt();
                    System.out.println();

                    for (int i = 2; i <= numero; i++) {
                        int resultado = numero % i;

                        if (resultado == 0) {
                            for (int a = 2; a <= i; a++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    }

                    for (int i = 2; i <= numero; i++) {
                        int resultado = numero % i;

                        if (resultado >= 1) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();

                } else {
                    System.out.println("INCORRECTO, OPCION NO VALIDA");
                }

            }

        } while (opcion != 1);

    }
}
