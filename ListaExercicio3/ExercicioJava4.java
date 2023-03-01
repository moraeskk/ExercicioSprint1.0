package ListaExercicio3;

import java.util.Scanner;

public class ExercicioJava4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("informe o maior numero ");
        double MaiorNumero = input.nextInt();

        System.out.println("informe o menor numero");
        double MenorNumero = input.nextInt();

        System.out.println("A diferença entre o maior e menor valor é: " + (MaiorNumero - MenorNumero));

        input.close();
    }
}
