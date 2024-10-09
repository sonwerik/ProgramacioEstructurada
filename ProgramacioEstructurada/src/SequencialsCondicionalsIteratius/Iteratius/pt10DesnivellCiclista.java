package SequencialsCondicionalsIteratius.Iteratius;

import java.util.Scanner;

public class pt10DesnivellCiclista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int desnivell = 0;

        for (int i = 0; i < 1; i++) {
            int alturaPorts = sc.nextInt();
            if (alturaPorts <= -1) break;
            else alturaPorts += desnivell;
        }
        System.out.println(desnivell);
    }
}
