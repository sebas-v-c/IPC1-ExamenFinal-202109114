import problem1.Problem1;
import problem2.Problem2;
import problem3.Problem3;

import java.util.Scanner;

public class MainMenu {
    public void display() {
        String message = "";
        menu(message);

        Scanner sc = new Scanner(System.in);
        String option = sc.next();

        while (!option.equals("4")) {
            switch (option) {
                case "1" -> {
                    Problem1 problem1 = new Problem1();
                    problem1.start();
                }
                case "2" -> {
                    Problem2 problem2 = new Problem2();
                    problem2.start();
                }
                case "3" -> {
                    Problem3 problem3 = new Problem3();
                    problem3.start();
                }
                default -> message = "Opción no válida, vuelva a intentar!";
            }

            menu(message);
            option = sc.next();
            message = "";
        }

        System.out.println("\n\"Toda despedida va siempre acompañada de un nuevo punto de partida.\"");
        System.out.println("(alguien en internet, probablemente)");
    }

    private void menu(String message){
        // System.out.println("Bienvenid@ al peor código que leeras en tu vida, las bebidas y la comida son gratis!!");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(message);
        System.out.println("********************Examen Final Lab IPC1********************");
        System.out.println("*                                                           *");
        System.out.println("*        1. Problema 1                                      *");
        System.out.println("*        2. Problema 2                                      *");
        System.out.println("*        3. Problema 3                                      *");
        System.out.println("*        4. Salir                                           *");
        System.out.println("*                                                           *");
        System.out.println("*************************************************************");
        System.out.print("Elige una opción (1, 2, 3, 4): ");

    }
}