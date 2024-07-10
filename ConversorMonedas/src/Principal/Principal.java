package Principal;

import Cons.Consultation;
import Cons.Conversion;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consultation consultation = new Consultation();
        int option = 0;

        while (option != 9) {
            showMenu();

            try {
                System.out.println("Please choose a valid option: ");
                option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 1:
                        Conversion.convert("USD", "MXN", consultation, scanner);
                        break;
                    case 2:
                        Conversion.convert("MXN", "USD", consultation, scanner);
                        break;
                    case 3:
                        Conversion.convert("USD", "ARS", consultation, scanner);
                        break;
                    case 4:
                        Conversion.convert("ARS", "USD", consultation, scanner);
                        break;
                    case 5:
                        Conversion.convert("USD", "BRL", consultation, scanner);
                        break;
                    case 6:
                        Conversion.convert("BRL", "USD", consultation, scanner);
                        break;
                    case 7:
                        Conversion.convert("USD", "COP", consultation, scanner);
                        break;
                    case 8:
                        Conversion.convert("COP", "USD", consultation, scanner);
                        break;
                    case 9:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid option, please choose an option from 1 to 9.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter numbers only.");
            } catch (Exception e) {
                System.out.println("Unknown error: " + e.getMessage());
            }
        }
        scanner.close();
    }

    private static void showMenu() {
        System.out.println("********************************************");
        System.out.println("Welcome to the currency converter");
        System.out.println("1) Dollar ==> Mexican Peso");
        System.out.println("2) Mexican Peso ==> Dollar");
        System.out.println("3) Dollar ==> Argentine Peso");
        System.out.println("4) Argentine Peso ==> Dollar");
        System.out.println("5) Dollar ==> Brazilian Real");
        System.out.println("6) Brazilian Real ==> Dollar");
        System.out.println("7) Dollar ==> Colombian Peso");
        System.out.println("8) Colombian Peso ==> Dollar");
        System.out.println("9) Exit");
        System.out.println("********************************************");
    }
}
