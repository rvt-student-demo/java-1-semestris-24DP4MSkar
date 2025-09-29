package rvt;
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Whats`s your name?");

        String name = scanner.nextLine();

        System.out.println("Hi " + name);
    }
}