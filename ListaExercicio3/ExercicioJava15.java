package ListaExercicio3;

public class ExercicioJava15 {
    public static void main(String[] args) {

        double ValorAtual = 1;
        double ValorAnterior;
        System.out.println("Grãos de trigo no tabuleiro de xadrez: ");
        double soma = 0;

        for (double i = 1; i < 65; i++) {
            System.out.println(ValorAtual);
            ValorAnterior = ValorAtual;
            ValorAtual = ValorAnterior * 2;
            soma = soma + ValorAnterior;
        }
        System.out.println(soma);


    }
}
