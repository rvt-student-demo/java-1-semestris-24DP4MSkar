package rvt;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
public class JMArrayList {
   public static void main(String[] args) {
      RemoveLast();
   }
   public static void onlyTheseNumbers() {
    ArrayList<Integer> numbers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    while(true){
        Integer number = scanner.nextInt();
        if (number == -1) {
            break;
        }
        numbers.add(number);
    }
    System.out.println("From where? ");
    int start = scanner.nextInt();
    System.out.println("To where? ");
    int end = scanner.nextInt();

    for(int i = start; i <= end; i=i+1) {
        System.out.println(numbers.get(i));
    }

   }
   public static void ListSize() {
    ArrayList<String> names = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    while(true){
        String name = scanner.nextLine();
        if(name.isEmpty()){
            break;
        }
        names.add(name);
    }
    System.out.println("In total: " + names.size());
   }

   public static void OnTheList() {
    ArrayList<String> names = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    while(true){
        String name = scanner.nextLine();
        if(name.isEmpty()){
            break;
        }
        names.add(name);
    }
    System.out.println("Search for? ");
    String search = scanner.nextLine();

    if(names.contains(search)) {
        System.out.println(search + " was found!");
    } else {
        System.out.println(search + " was not found!");
    }
   }
   public static void RemoveLast(){
    ArrayList<String> strings = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
        while(true){
        String word = scanner.nextLine();
        if(word.isEmpty()){
            break;
        }
        strings.add(word);
    }
    System.out.println(strings);

    strings.removeLast();
    System.out.println(strings);

   }
}
