package Sammich;

import java.awt.*;
import java.util.Scanner;

public class SammichChop {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //PROMPT FOR SANDWICH SIZE
        System.out.println("Enter the size of the sandwich (1 for Regular, 2 for Large.)");
        int size = keyboard.nextInt();

        //BASE PRICES
        double basePrice;
        if (size == 1) {
            basePrice = 5.45;
        } else if (size == 2 ) {
            basePrice = 8.95;
        }else {
            System.out.println("THAT IS NOT A CHOICE YOU GOOSE.");
            return;

        }

        //AGE PROMPT
        System.out.println("Enter your age!");
        int age = keyboard.nextInt();

        //DISCOUNT
        double discount = 0.0;
        if (age <= 17) {
            discount = 0.10;
        }else if (age >= 65) {
            discount = 0.20;
        }

        //Calculate final price
        double finalPrice = basePrice - (basePrice * discount);

        //PRINT FINAL
        System.out.printf("The cost of the sammich is: $%.2f%n", finalPrice);

        System.out.printf("Please appreictae this. I only got 2 hours of sleep so I struggled a lot with this even though i shouldn't have :( </3. ");


    }


}