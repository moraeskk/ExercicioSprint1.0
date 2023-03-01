package ListaExercicio3;

import java.util.Scanner;

public class ExercicioJava3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("informe o valor inicial");
        double VI = input.nextInt();

        double NS = (VI + 1);
        double NA = (VI - 1);

        System.out.println("o valor sucessor é " + NS);
        System.out.println("O valor anterior é " + NA);

        input.close();
    }
}
