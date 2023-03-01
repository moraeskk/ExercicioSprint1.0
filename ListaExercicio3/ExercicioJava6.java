package ListaExercicio3;

import java.util.Scanner;

public class ExercicioJava6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro valor");
        double A = input.nextInt();

        System.out.println("Informe o segundo valor");
        double B = input.nextInt();

        System.out.println("Informe o terceiro valor");
        double C = input.nextInt();

        double delta = B * B - (4 * A * C);

        if (delta < 0) {
            System.out.println("Não há solução nos números reais");
        } else {

            double X1 = (-B + Math.sqrt(delta)) / (2 * A);
            double X2 = (-B - Math.sqrt(delta)) / (2 * A);
            if (X1 == X2) {
                System.out.println("O valor de x é " + X1);

            } else {
                System.out.println("O valor de x1 = " + X1 + " O valor de x2 =" + X2);

            }
            input.close();
        }
    }

}