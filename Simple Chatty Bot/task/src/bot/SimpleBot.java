package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "Gino";
        int createdYear = 2020;

        System.out.println("Hello! My name is " + name);
        System.out.println("I was created in " + createdYear);
        System.out.println("Please, remind me your name.");

        String userName = scanner.next();

        // reading a name

        System.out.println("What a great name you have !" + userName);
    }
}
