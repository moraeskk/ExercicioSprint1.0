package ListaExercicio3;

import java.util.Scanner;

public class ExercicioJava7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("valores impares");

        for (int ValorImpar = 0; ValorImpar < 20; ValorImpar++) {
            if ((ValorImpar % 2) != 0) {
                System.out.print(" " + ValorImpar);
            }
        }

    }
}
