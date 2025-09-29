package rvt;
import java.util.Scanner;

public class Variable{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nosaukums = scanner.nextLine(); 

        int skaits = Integer.valueOf(scanner.nextLine());

        double cena = Double.valueOf(scanner.nextLine());

        double TotalCena = skaits * cena;
        

        System.out.println("Nosaukums:" + nosaukums);
        System.out.println("Daudzums:" + skaits); 
        System.out.println("Cena:" + cena);
        System.out.println("TotalPrice:" + TotalCena);

    }

}