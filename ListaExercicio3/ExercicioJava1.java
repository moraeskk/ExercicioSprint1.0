package ListaExercicio3;

import java.util.Scanner;

public class ExercicioJava1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("informe numero");
        double Celsius = input.nextInt();

        double F = (9 * Celsius + 160) / 5;
        System.out.println("A temperatura convertida em Fahrenheit é " + F);

        input.close();
    }
}
