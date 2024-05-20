package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Hash hash = new Hash();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type password: ");

        String stringScanner = scanner.nextLine();

        String hashPW = hash.hashPassword(stringScanner);

        hash.checkPassword(stringScanner, hashPW);

        System.out.println(hashPW);

        System.out.println(hash.checkPassword(stringScanner, hashPW));

    }
}