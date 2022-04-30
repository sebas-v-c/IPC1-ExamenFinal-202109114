package problem1;

import java.util.Scanner;

public class Problem1 {
    public void start() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Iniciando problema 1 :)");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " es el mayor!");
        } else {
            System.out.println(num2 + " es el mayor!");
        }

        System.out.println("Ingrese cualquier cosa para continuar");
        sc.next();
    }
}
