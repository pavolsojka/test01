import java.util.Scanner;

public class NacitanieVstupuVynimka {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("zadaj meno a priezvisko");
        String meno = sc.nextLine();
        System.out.println("zadaj vek");
        int vek = sc.nextInt();
        if(vek < 0) {

            System.out.println("Zadali ste zaporny vek");
            System.out.println("Zadali ste zaporny vek");
            System.exit(1);
        }
        sc.close();

        System.out.println("meno: " + meno);
        System.out.println("vek: " + vek);

    }

}
