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

        if (passTranvies && passVianants || passTranvies && passCotxes || passTranvies && passCotxes || passTranvies && passVianants && passCotxes) {
            System.out.println("POSSIBLE COLISIO");
        } else {
            switch (rol) {
                case "TRANVIA":
                    if (passTranvies) System.out.println("ENDAVANT");
                    else System.out.println("PARAR");
                    break;
                case "VIANANT":
                    if (passVianants) System.out.println("ENDAVANT");
                    else System.out.println("PARAR");
                    break;
                case "COTXE":
                    if (passCotxes) System.out.println("ENDAVANT");
                    else System.out.println("PARAR");
                    break;
            }
        }
    }
}