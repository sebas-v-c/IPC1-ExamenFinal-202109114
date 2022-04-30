package problem3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem3 {

    private int[] resultados = new int[1];
    private int pesoMax;
    public void start() {
        resultados[0] = 0;
        System.out.println("Iniciando problema 3");
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngrese el numero total de vacas a la venta: ");
        int totalVacas = sc.nextInt();
        Vaca[] vacas = new Vaca[totalVacas];

        System.out.print("\nIngrese el peso maximo que puede llevar el camion: ");
        pesoMax = sc.nextInt();

        System.out.println("\nIngrese una lista (separada por comas) de el peso de las vacas");
        System.out.print(": ");
        String listaPesos = sc.next();
        int[] arregloPesos = convertirAEnteros(listaPesos);

        System.out.println("\nIngrese una lista (separada por comas) de el peso de las vacas");
        System.out.print(": ");
        String listaLitros = sc.next();
        int[] arregloLitros = convertirAEnteros(listaLitros);

        for (int i = 0; i < totalVacas; i++) {
            Vaca vaca = new Vaca(arregloPesos[i], arregloLitros[i]);
            vacas[i] = vaca;
        }

        int maxProduccion = mayorProduccion(vacas, pesoMax);
        System.out.println(maxProduccion + " Litros");

        System.out.println("\nIngrese cualquier cosa para continuar");
        sc.next();
    }

    private int mayorProduccion(Vaca[] vacas, int pesoMax) {
        // Todas las combinaciones de diferentes tamaños
        int maxProduccion;
        for (int tamanio = 1; tamanio <= vacas.length; tamanio++) {
            Vaca[] temp = new Vaca[tamanio];
            combinar(vacas, temp, 0, vacas.length - 1, 0, tamanio);
        }

        int max = resultados[0];

        for (int i = 1; i < resultados.length; i++)
            if (resultados[i] > max)
                max = resultados[i];

        return max;
    }

    private void combinar(Vaca[] vacas, Vaca[] datos, int inicio, int finall, int indice, int combinacion) {
        if (indice == combinacion) {
            int peso = 0;
            int litros = 0;
            for (int i = 0; i < combinacion; i++) {
                peso += datos[i].getPeso();
                litros += datos[i].getProduccion();
            }
            if (!(peso > pesoMax)) {
                agregarDato(litros);
            }

            for (int i=inicio; i<=finall && finall-i+1 >= combinacion-indice; i++) {
                datos[indice] = vacas[i];
                combinar(vacas, datos, i+1, finall, indice+1, combinacion);
            }
        }
    }

    private int[] convertirAEnteros(String lista) {
        String[] arreglo = lista.split(",");
        int[] enteros = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            enteros[i] = Integer.parseInt(arreglo[i]);
        }

        return enteros;
    }

    private void agregarDato(int resultado) {
        int[] arr = Arrays.copyOf(resultados, resultados.length + 1);
        arr[arr.length - 1] = resultado; // Assign 40 to the last element
        resultados = arr;

    }
}
