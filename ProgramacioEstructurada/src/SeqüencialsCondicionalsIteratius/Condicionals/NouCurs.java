package SeqüencialsCondicionalsIteratius.Condicionals;

import java.util.Scanner;

public class NouCurs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int P = scanner.nextInt();
        int M = scanner.nextInt();

        int totalPlaces = N * A * P;
        int freePlaces = totalPlaces - M;

        if (N > 0 && A > 0 && P > 0 && M > 0 && freePlaces >= 0){
            System.out.println("A l'institut hi caben tots els alumnes, encara n'hi caben "+ freePlaces);
        }else if (N > 0 && A > 0 && P > 0 && M > 0 && freePlaces < 0){
            int freePlacesPositive = freePlaces * -1;
            System.out.println("Calen " + freePlacesPositive + " places per tots els alumnes que s'han matriculat");
        }else{
            System.out.println("Error dades introduides no valides");
        }
    }
}