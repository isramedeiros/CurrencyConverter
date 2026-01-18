package util;

public class CurrencyConverter {
    static double IOF = 0.06;

    public static double total(double dollarPrice, double amount) {
        double conversion = dollarPrice * amount;
        return conversion + (conversion * IOF);
    }
}
