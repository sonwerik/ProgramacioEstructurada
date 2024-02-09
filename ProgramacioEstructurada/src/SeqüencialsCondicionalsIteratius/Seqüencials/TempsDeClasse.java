package SeqüencialsCondicionalsIteratius.Seqüencials;

import java.util.Scanner;

public class TempsDeClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();

        int hoursToSeconds = hours * 3600;
        int minutesToSeconds = minutes * 60;

        int totalSeconds = hoursToSeconds + minutesToSeconds + seconds;

        System.out.println(totalSeconds);

    }
}
