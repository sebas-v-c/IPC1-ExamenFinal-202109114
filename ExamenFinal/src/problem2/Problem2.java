package problem2;

import java.util.Scanner;

public class Problem2 {
    public void start() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Iniciando problema 2");
        Scanner sc = new Scanner(System.in);

        int num;
        while (true) {
            System.out.print("Ingrese un numero impar: ");
            num = sc.nextInt();
            if (num % 2 != 0) {
                break;
            }
            System.out.println("SOLO NUMEROS IMPARES");
        }

        for (int i = 1; i <= num; i+=2) {
            for (int j = num; j > i; j-=2 ) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Ingrese cualquier cosa para continuar");
        sc.next();
    }
}
