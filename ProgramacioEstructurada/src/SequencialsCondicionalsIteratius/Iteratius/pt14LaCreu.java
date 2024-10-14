package SequencialsCondicionalsIteratius.Iteratius;

import java.util.Scanner;

public class pt14LaCreu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 0 || n % 2 == 0) System.out.println("N ha de ser imparell i positiu");
        else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 0; i < n; i++) {
                System.out.print("*");
                for (int j = 0; j < n; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
