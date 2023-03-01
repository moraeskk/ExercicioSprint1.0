package ListaExercicio4;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ExercicioVetor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] VetorA = {7,4,6,2,10,5,9,7,21,30};

        System.out.println("Informe o valor multiplicador: ");
        int X = input.nextInt();

        int[] VetorM = new int[10];

        for (int i = 0; i < VetorA.length; i++) {
            VetorM[i] = VetorA[i] * X;
        }

        System.out.println("Valores do vetor M: " + Arrays.toString(VetorM));


    }
}
