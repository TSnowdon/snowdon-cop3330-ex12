import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Tyler Snowdon
 */
public class App {
    public static void main(String[] args) {
        double principal;
        double rate;
        double years;
        double amount;
        Scanner reader = new Scanner(System.in);
        try {
            // Input
            System.out.print("Enter the principal: ");
            principal = Double.parseDouble(reader.nextLine());
            System.out.print("Enter the rate of interest: ");
            rate = Double.parseDouble(reader.nextLine());
            rate /= 100;
            System.out.print("Enter the number of years: ");
            years = Double.parseDouble(reader.nextLine());
        } catch (Exception e) {
            System.out.println("Invalid input! Please restart the program and try again.");
            return;
        }
        // Processing
        // A = P(1 + rt)
        // Amount = Principal * (1 + (rate * years))
        amount = principal * (1 + (rate * years));
        // Output
        System.out.printf("After %.0f years at %.2f%%, the investment will be worth $%.2f.\n", years, (rate * 100), amount);
    }
}
