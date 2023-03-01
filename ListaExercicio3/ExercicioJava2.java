package ListaExercicio3;

import java.util.Scanner;

public class ExercicioJava2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Informe Salário Mensal");
        int SM = Input.nextInt();

        System.out.println("Informe Percentual De Reajuste");
        double PR = Input.nextInt();

        double PercentualReajustado = (PR / 100);

        System.out.println("O novo salário com aumento é " + (SM * (1 + PercentualReajustado)));

        Input.close();
    }
}