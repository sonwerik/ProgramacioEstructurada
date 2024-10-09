package SequencialsCondicionalsIteratius;

import java.util.Scanner;

public class miau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String rol = sc.next();

        String semaforTranvies = sc.next();
        String semaforVianants = sc.next();
        String semaforCotxes = sc.next();

        boolean passTranvies = semaforTranvies.equals("GO");
        boolean passVianants = semaforVianants.equals("VERD");
        boolean passCotxes = semaforCotxes.equals("VERD");

        if (passTranvies && passVianants || passVianants && passCotxes || passTranvies && passCotxes){
            System.out.println("POSSIBLE COLISIO");
        } else if (semaforTranvies.equals("GO") && semaforVianants.equals("GROC") && semaforCotxes.equals("GROC")){
            System.out.println("PARAR");
        } else {
            switch (rol) {
                case "TRANVIA":
                    if (semaforTranvies.equals("GO"))
                        System.out.println("ENDAVANT");
                    else
                        System.out.println("PARAR");
                    break;
                case "VIANANT":
                    if (semaforVianants.equals("VERD"))
                        System.out.println("ENDAVANT");
                    else
                        System.out.println("PARAR");
                    break;
                case "COTXE":
                    if (semaforCotxes.equals("VERD"))
                        System.out.println("ENDAVANT");
                    else
                        System.out.println("PARAR");
                    break;
            }
        }
    }
}