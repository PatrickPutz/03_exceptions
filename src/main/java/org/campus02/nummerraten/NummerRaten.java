package org.campus02.nummerraten;

import java.util.Random;
import java.util.Scanner;

public class NummerRaten {

    public static void main(String[] args) {

        int randomNumber = new Random().nextInt(10);
        int input = -1;
        Scanner scanner = new Scanner(System.in);

            while(input != randomNumber){
                System.out.print("Please enter a number: ");
                try {
                    input = Integer.parseInt(scanner.next());
                } catch (NumberFormatException e) {
                    System.out.println("that's not a number idiot");
                } finally {
                    if (input != randomNumber)
                        System.out.println("nope loser");
                }
            }
        System.out.println("boom bitch");

    }
    
}
