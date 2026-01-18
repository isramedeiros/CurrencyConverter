package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? (format: X.XX) ");
        double dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        double result = CurrencyConverter.total(dollarPrice, amount);

        System.out.printf("Amount to be paid in reais: R$ %.2f%n", result);
        sc.close();
    }


}
