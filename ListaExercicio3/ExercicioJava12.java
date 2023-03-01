package ListaExercicio3;

import java.util.Scanner;

public class ExercicioJava12 {
    public static void main(String[] args) {
        double[] temperaturas = new double[20];
        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a temperatura em " + (i + 1) + " ºC : ");
            temperaturas[i] = input.nextDouble();

            soma += temperaturas[i];

            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }

            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
        }

        double media = soma / 20;

        System.out.println("A menor temperatura é: " + menor);
        System.out.println("A maior temperatura é: " + maior);
        System.out.println("A média das temperaturas é: " + media);
    }
}