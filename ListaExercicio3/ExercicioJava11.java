package ListaExercicio3;

import java.util.Scanner;

public class ExercicioJava11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ElementoA = new int[15];
        int[] ElementoB = new int[15];
        int[] ElementoC = new int[30];

        System.out.println("Digite os elementos da matriz A:");
        for (int i = 0; i < 15; i++) {
            ElementoA[i] = input.nextInt();
        }

        System.out.println("Digite os elementos da matriz B:");
        for (int i = 0; i < 15; i++) {
            ElementoB[i] = input.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            ElementoC[i] = ElementoB[i];
            ElementoC[i + 15] = ElementoB[i];
        }

        System.out.println("Matriz C: ");
        for (int i = 0; i < 30; i++) {
            System.out.print(ElementoC[i] + " ");
        }

    }
}

