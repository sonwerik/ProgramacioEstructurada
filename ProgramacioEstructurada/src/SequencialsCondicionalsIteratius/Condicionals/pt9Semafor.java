import java.util.Scanner;

public class pt9Semafor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String rol = sc.next();
        String semaforTranvies = sc.next();
        String semaforVianants = sc.next();
        String semaforCotxes = sc.next();

        boolean passTranvies = semaforTranvies.equals("GO");
        boolean passVianants = semaforVianants.equals("VERD");
        boolean passCotxes = semaforCotxes.equals("VERD");

        if (passTranvies && passVianants || passVianants && passCotxes || passTranvies && passCotxes) {

            System.out.println("POSSIBLE COLISIO");

        } else {

            boolean pass = false;

            switch (rol) {
                case "TRANVIA":
                    pass = passTranvies;
                    break;
                case "VIANANT":
                    pass = passVianants;
                    break;
                case "COTXE":
                    pass = passCotxes;
                    break;
                default:
                    System.out.println("PARAR");
            }

            if (pass == true) System.out.println("ENDAVANT");
            else System.out.println("PARAR");
        }
    }
}