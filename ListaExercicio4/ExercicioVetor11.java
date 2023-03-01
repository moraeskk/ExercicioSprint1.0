package ListaExercicio4;

import java.util.Scanner;

public class ExercicioVetor11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String palavra = "anna";
        String reverso = "";


        for (int i = (palavra.length() - 1); i >= 0; i--) {
            reverso += palavra.charAt(i);


        }

        if (reverso.equals(palavra)) {
            System.out.println("É uma palíndromo");
        } else {
            System.out.println("Não é um palíndromo");


        }
    }
}
