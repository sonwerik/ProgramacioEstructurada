package SeqüencialsCondicionalsIteratius.Condicionals;

import java.util.Scanner;

public class LaCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        char c = sc.next().charAt(0);
        int result = 0;

        if (c == '+') {
            result = n1 + n2;
            System.out.println(result);
        } else if (c == '-') {
            result = n1 - n2;
            System.out.println(result);

        } else if (c == '*') {
            result = n1 * n2;
            System.out.println(result);

        } else if (c == '/') {
            result = n1 / n2;
            System.out.println(result);

        } else if (c == '%') {
            result = n1 % n2;
            System.out.println(result);

        } else {
            System.out.println("L'operacio no es valida");
        }
    }
}
