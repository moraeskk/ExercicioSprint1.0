package ListaExercicio4;

import java.util.Scanner;

public class ExercicioVetor15 {
    public static void main(String[] args) {

        System.out.println(inverter(12345, 0));
    }

    private static int inverter(int n, int total) {
        if (n == 0)
            return total;
        else return inverter(n / 10, total * 10 + n % 10);
    }

}
