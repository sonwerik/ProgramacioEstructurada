package SeqüencialsCondicionalsIteratius.Seqüencials;

import java.util.Scanner;

public class DamMitjanaAritmèticaPonderada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();
        float num4 = scanner.nextFloat();

        int weight1 = scanner.nextInt();
        int weight2 = scanner.nextInt();
        int weight3 = scanner.nextInt();
        int weight4 = scanner.nextInt();

        float weightNumber1 = num1 * weight1 / 100;
        float weightNumber2 = num2 * weight2 / 100;
        float weightNumber3 = num3 * weight3 / 100;
        float weightNumber4 = num4 * weight4 / 100;

        float average = weightNumber1 + weightNumber2 + weightNumber3 + weightNumber4;

        int roundAverage = Math.round(average);
        System.out.println(roundAverage);

    }
}
