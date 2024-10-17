package SequencialsCondicionalsIteratius.Iteratius;

import java.util.Scanner;

public class pt19Capicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int length = 0;
        while (n > 0) n = n / 10; length++;
        boolean capicua = false;

        int n1 = n / 100;
        int n2 = (n % 100) / 10;
        int n3 = n % 10;

    }
}