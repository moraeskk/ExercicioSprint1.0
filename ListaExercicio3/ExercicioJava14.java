package ListaExercicio3;

import java.util.Scanner;

public class ExercicioJava14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[12];
        int[] B = new int[12];
        int[] C = new int[24];

        int i = 0;
        while (i < 12) {
            System.out.print("Digite o " + (i + 1) + "º elemento da matriz A (divisível por 2 ou 3): ");
            int elemento = input.nextInt();
            if (elemento % 2 == 0 || elemento % 3 == 0) {
                A[i] = elemento;
                i++;
            } else {
                System.out.println("Valor Inválido.");
            }
        }
        System.out.println("Lendo Valores da Matriz B.");
        int j = 0;
        while (j < 12) {
            System.out.print("Digite o " + (j + 1) + "º elemento da matriz B (não múltiplo de 5): ");
            int elemento = input.nextInt();
            if (elemento % 5 != 0) {
                B[j] = elemento;
                j++;
            } else {
                System.out.println("Valor inválido.");
            }
        }
        for (int i1 = 0; i1 < 12; i1++) {
            C[i1] = A[i1];
        }
        for (int i2 = 0; i2 < 12; i2++) {
            C[12 + i2] = B[i2];
        }

        System.out.print("Elementos da matriz C: ");
        for (int i3 = 0; i3 < 24; i3++) {
            System.out.print(C[i3] + " ");
        }

    }
}