package SeqüencialsCondicionalsIteratius.Condicionals;

import java.util.Scanner;

public class MatriculaPoblenou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tuition = 440;
        boolean largeFamily = sc.nextBoolean();
        boolean dhonLicensePlate = sc.nextBoolean();
        boolean singleParent = sc.nextBoolean();
        boolean singleParentSpecial = sc.nextBoolean();
        int age = sc.nextInt();
        boolean completeCourse = sc.nextBoolean();
        int ufs = sc.nextInt();

        if (largeFamily) {
            tuition /= 2;
            System.out.println(tuition);

        } else if (dhonLicensePlate) {
            tuition -= 80;
            System.out.println(tuition);

        } else if (singleParent) {
            tuition /= 2;
            System.out.println(tuition);

        } else if (singleParentSpecial) {
            tuition -= (int) (tuition * 0.2);
            System.out.println(tuition);

        } else if (age >= 27) {
            tuition -= (int) (tuition * 0.1);
            System.out.println(tuition);

        } else if (!completeCourse) {
            if (ufs > 0 && ufs < 18) {
                tuition = 25 * ufs;
                System.out.println(tuition);
            }
        }
    }
}