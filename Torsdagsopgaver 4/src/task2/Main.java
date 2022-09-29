package task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Please type your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.print("Please type your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");
        int result = 67 - age;
        System.out.println("You can retire" + (result > 0 ? " in " + result + " years." : " now."));
    }
}