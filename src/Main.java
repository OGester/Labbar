import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\nWelcome!");
        while (true) {
            System.out.println("If you want to calculate tip please enter Tab total below.\n");
            System.out.println("If you wish to exit? please press 0\nTab Total:");

            try {
                double tabTotal = scan.nextDouble();


                if (tabTotal >= 50 && tabTotal <= 300) {
                    double tip = tabTotal * 0.15;
                    tabTotal = tabTotal + tip;

                    System.out.println("The amount of tip you should pay is " + tip);
                    System.out.println("And your tab total is " + tabTotal + "\n");
                    System.out.println("Thank you for your visit and welcome back.");
                    break;

                } else if (tabTotal >= 300 && tabTotal <= 1000) {
                    double tip = tabTotal * 0.20;
                    tabTotal = tabTotal + tip;

                    System.out.println("The amount of tip you should pay is " + tip);
                    System.out.println("And your tab total is " + tabTotal + "\n");
                    System.out.println("Thank you for your visit and welcome back.");
                    break;

                } else if (tabTotal > 1000) {
                    double tip = tabTotal * 0.25;
                    tabTotal = tabTotal + tip;

                    System.out.println("The amount of tip you should pay is " + tip);
                    System.out.println("And your tab total is " + tabTotal + "\n");
                    System.out.println("Thank you for your visit and welcome back.");
                    break;

                } else if (tabTotal >= 1 && tabTotal < 50) {

                    System.out.println("Your tab is less than 50, no need for tip this time.\n");
                    System.out.println("Thank you for your visit and welcome back.");
                    //continue;

                } else if (tabTotal == 0) {

                    System.out.println("Exiting Tip calculation.\nThank you for your visit and welcome back!");
                    System.exit(0);
                    break;

                } else {
                    System.out.println("You have entered a negative amount, please try again.\n");

                }

                } catch (Exception e) {
                System.out.println("invalid input, please try again");
                scan.nextLine();

            }
        }
    }
}

