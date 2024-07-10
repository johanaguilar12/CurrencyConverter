package Cons;
import Currency.Currency;

import java.util.Scanner;
import java.util.Date;

public class Conversion {

    public static void convert(String baseCurrency, String targetCurrency, Consultation consultation, Scanner scanner) {
        double amount;
        double convertedAmount;
        Date today = new Date();

        Currency currency = consultation.searchCurrency(baseCurrency, targetCurrency);
        System.out.println("The conversion rate for today " + today +
                " \n1 " + baseCurrency + " = " + currency.conversion_rate() + " " + targetCurrency);

        System.out.println("Enter the amount you want to convert from " + baseCurrency);
        amount = Double.parseDouble(scanner.nextLine());
        convertedAmount = amount * currency.conversion_rate();
        System.out.println("The amount " + amount + " " + baseCurrency + " is equivalent to =>> " + convertedAmount + " " + currency.target_code() + '\n');
    }
}
