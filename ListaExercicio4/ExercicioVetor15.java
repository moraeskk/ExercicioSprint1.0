package ListaExercicio4;

import java.util.Scanner;

public class ExercicioVetor15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Forneça os valores para serem inversos " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }
        int valores;
        for (int j = 0; j < numeros.length; j++) {
            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] < numeros[i + 1]) {
                    valores = numeros[i + 1];
                    numeros[i + 1] = numeros[i];
                    numeros[i] = valores;

                }
            }
        }
        System.out.println("O inverso dos valores dados são: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i]);
        }
    }
}
