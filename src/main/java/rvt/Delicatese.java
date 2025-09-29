package rvt;
import java.util.Scanner;
public class Delicatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi preci: ");
        String preci = scanner.nextLine();

        System.out.println("Ievadi cenu: ");
        double cena = Double.valueOf(scanner.nextLine());

        double piegades_cena = 0.0;

        System.out.println("Ekspress piegāde (0==nē, 1==jā): ");
        int piegade = Integer.valueOf(scanner.nextLine());

        System.out.println("Rēķins: " + preci + " " + cena);

        if (cena < 10) {
            
        } 
    }
}