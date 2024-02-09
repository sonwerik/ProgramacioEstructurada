package SeqüencialsCondicionalsIteratius.Condicionals;

import java.util.Scanner;

public class ElMesGran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();

        if (n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10 || n3 < 0 || n3 > 10) {
            System.out.println("Error en el rang de les notes");
        } else {
            if (n1 > n2 && n1 > n3) {
                System.out.println(n1);
            }
            if (n2 > n1 && n2 > n3) {
                System.out.println(n2);
            }
            if (n3 > n1 && n3 > n2) {
                System.out.println(n3);
            }
        }
    }
}
