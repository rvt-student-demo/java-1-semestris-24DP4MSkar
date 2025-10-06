package rvt;
import java.util.Scanner;
public class SkaitluAnalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int skaitlis;
        int count = 0;
        int sum = 0;
        int max = 0;

        while (true) {
            System.out.println("Ievadi pozitivu skaitli:");
            skaitlis = scanner.nextInt();
            if (skaitlis <= 0) {
                break;
            }
            count += 1;
            sum = sum + skaitlis;

            if (skaitlis > max) {
                max = skaitlis;
            }

        }
        double vid = (double) sum / count;
        System.out.println("Ievadto skaiļu skaits: " + count);
        System.out.println("Ievadito skaitļu summa: " + sum);
        System.out.println("Videja vertiba: " + vid);
        System.out.println("Lielakais skaitlis: " + max);
    }
}
