package SeqüencialsCondicionalsIteratius.Seqüencials;

import java.util.Scanner;

public class DamMitjanaAritmètica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();
        float num4 = scanner.nextFloat();

        float average = (num1 + num2 + num3 + num4)/4;
        int roundAverage = Math.round(average);
        System.out.println(roundAverage);
    }
}
