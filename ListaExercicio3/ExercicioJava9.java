package ListaExercicio3;

import java.util.Scanner;

public class ExercicioJava9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ValorInicial = 0, ValorMaior = Integer.MIN_VALUE, ValorMenor = Integer.MAX_VALUE;

        do {
            System.out.println("informe o valor: ");

            ValorInicial = input.nextInt();

            if (ValorInicial > ValorMaior) {
                ValorMaior = ValorInicial;

            }
            if (ValorInicial < ValorMenor) {
                ValorMenor = ValorInicial;
            }

            System.out.println("Maior valor informado: " + ValorMaior + " Menor valor informado " + ValorMenor);

        } while (ValorInicial >= 0);

    }
}