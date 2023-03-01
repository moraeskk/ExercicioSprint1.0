package ListaExercicio4;

import java.util.Arrays;

public class ExercicioVetor1 {
    public static void main(String[] args) {
        int[] vetor = new int[8];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * i * i;
        }

        System.out.println("Vetor de cubos: " + Arrays.toString(vetor));
    }
}