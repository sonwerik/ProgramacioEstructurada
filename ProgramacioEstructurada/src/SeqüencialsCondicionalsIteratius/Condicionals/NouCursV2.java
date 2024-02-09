package SeqüencialsCondicionalsIteratius.Condicionals;

import java.util.Scanner;

public class NouCursV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int P = scanner.nextInt();
        int M = scanner.nextInt();

        int totalPlaces = N * A * P;
        int freePlaces = totalPlaces - M;

        if (N > 0 && A > 0 && P > 0 && M > 0 && freePlaces >= 0){
            System.out.println("A l'institut hi caben tots els alumnes, encara n'hi caben " + freePlaces);
        }else if (N > 0 && A > 0 && P > 0 && M > 0 && freePlaces < 0){
            int freePlacesPositive = freePlaces * -1;
            float newFloor = (float) freePlacesPositive / N / A;
            int roundNewFloor = (int) Math.ceil(newFloor);

            System.out.println("Calen " + roundNewFloor + " plantes per acollir tots els alumnes matriculats");
        }else{
            System.out.println("Error dades introduides no valides");
        }
    }
}
