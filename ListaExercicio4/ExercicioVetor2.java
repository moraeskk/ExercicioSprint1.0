package ListaExercicio4;

import java.util.Arrays;

public class ExercicioVetor2 {
    public static void main(String[] args) {

        int[] v = {5,1,4,2,7,8,3,6};
        int[]v2 = new int[8];

        for (int i = 0; i < v.length; i++) {
            v2[i] = v[i] * 2;
        }

        System.out.println("valor do vetor 2: " + Arrays.toString(v2));
    }
}
