package net.groundgurus.day1;

import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        var name = input.nextLine();
        System.out.printf("Hello %s!", name);
    }
}
