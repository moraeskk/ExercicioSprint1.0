package ListaExercicio3;

import java.util.Scanner;

public class ExercicioJava13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numero = new int[12];
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite o valor do numero " + (i + 1) + ": ");
            numero[i] = input.nextInt();
        }
        int valores;
        for (int j = 0; j < numero.length; j++) {
            for (int i = 0; i < numero.length - 1; i++) {
                if (numero[i] < numero[i + 1]) {
                    valores = numero[i + 1];
                    numero[i + 1] = numero[i];
                    numero[i] = valores;

                }

            }

            }
        System.out.println("Os valores ordenados são: ");
        for (int i = 0; i < 12; i++) {
            System.out.println(numero[i]);
        }
    }
}