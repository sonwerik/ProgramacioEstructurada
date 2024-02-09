package SeqüencialsCondicionalsIteratius.Condicionals;

import java.util.Scanner;

    public class MajorEdat {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String nameLastName = scanner.nextLine();
            int birthYear = scanner.nextInt();
            int age = 2022 - birthYear;

            if (age >= 18) {
                System.out.println(nameLastName + " te " + age + " anys i es major d'edat.");

            } else {
                System.out.println(nameLastName + " te " + age + " anys i es menor d'edat.");
            }
        }
    }
}
