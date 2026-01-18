package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        // System.out.printf("Amount to be paid in reais = %.2f%n", XX);

        System.out.println(total(dollarPrice, amount));

        sc.close();
    }

    public static double total(double dollarPrice, double amount) {
        double IOF = 0.06;
        double conversion = dollarPrice * amount;
        return conversion + (conversion * IOF);
    }
}
