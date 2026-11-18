
package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an English alphabet character: ");
        char ch = sc.next().charAt(0);

        ch = Character.toLowerCase(ch);

        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' ||
                    ch == 'i' || ch == 'o' || ch == 'u') {

                System.out.println(ch + " is a Vowel");

            } else {

                System.out.println(ch + " is a Consonant");
            }

        } else {

            System.out.println("Invalid input! Enter an alphabet.");
        }

        sc.close();
    }
}
