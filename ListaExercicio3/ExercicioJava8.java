package ListaExercicio3;

public class ExercicioJava8 {
    public static void main(String[] args) {

        double celcius = 0;

        for (int i = 1; i < 10; i ++){
            celcius = celcius +10;

            double fahreinheit = (9 * celcius + 160) /5;

            System.out.println( " valor em celsius: "+ celcius + " = temperatura em fahreinheit: " + fahreinheit);
        }

    }
}
