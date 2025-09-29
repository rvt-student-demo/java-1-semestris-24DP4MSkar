package rvt;
import java.util.Scanner;
public class AvarageOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number: ");
        int second = Integer.valueOf(scanner.nextLine());

        double result1 = first + second;
        double result2 = result1 / 2;

        System.out.println(result2);
    }
    
}
