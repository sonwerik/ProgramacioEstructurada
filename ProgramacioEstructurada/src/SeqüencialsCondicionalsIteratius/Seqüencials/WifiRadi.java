package SeqüencialsCondicionalsIteratius.Seqüencials;

import java.util.Scanner;


public class WifiRadi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float area = scanner.nextFloat();
        float radius = (float) Math.sqrt(area / Math.PI);
        int distance = Math.round(radius);

        System.out.println(Math.round(distance));

    }
}