package rvt;
import java.util.Scanner;
public class AvarageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number: ");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number: ");
        int third = Integer.valueOf(scanner.nextLine());

        double result1 = first + second + third;
        double result2 = result1 / 2;

        System.out.println(result2);
    }
    
}
