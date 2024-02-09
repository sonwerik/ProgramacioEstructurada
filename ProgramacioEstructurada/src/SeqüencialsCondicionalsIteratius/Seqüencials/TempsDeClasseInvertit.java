package SeqüencialsCondicionalsIteratius.Seqüencials;

import java.util.Scanner;

public class TempsDeClasseInvertit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seconds = scanner.nextInt();

        int secondsToHours = seconds / 3600;
        int modulusHours = seconds % 3600;
        int minutesToHours = modulusHours / 60;
        int modulusSeconds = modulusHours % 60;


        System.out.println(secondsToHours);
        System.out.println(minutesToHours);
        System.out.println(modulusSeconds);

    }
}