package ListaExercicio3;

import java.util.Scanner;

public class ExercicioJava5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe O Valor Numerico");
        double Vn = input.nextInt();
        if (Vn < 0) {
            Vn = Vn * (-1);
        }

        System.out.println("O número transformado em positivo é " + Vn);

        input.close();
    }
}
