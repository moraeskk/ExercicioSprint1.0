package ListaExercicio4;

public class ExercicioVetor8 {
    public static int SomaDosNumeros(int N1, int N2, int N3) {
        return N1 + N2 + N3;
    }
    public static void main(String[] args) {
        int ValorDaSoma = SomaDosNumeros(75, 66, 72);
        double media = ValorDaSoma / 3;
        System.out.println(media);
    }
}
