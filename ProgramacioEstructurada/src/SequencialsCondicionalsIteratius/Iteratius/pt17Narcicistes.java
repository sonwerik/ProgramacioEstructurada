package SequencialsCondicionalsIteratius.Iteratius;

import java.util.Scanner;

public class pt17Narcicistes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char n = sc.next().charAt(0);
        boolean narcicista = false;
        if (n == '1') narcicista = true;
        System.out.println(narcicista);
    }
}
