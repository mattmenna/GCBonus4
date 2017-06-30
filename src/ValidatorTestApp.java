/*
GCBonus4
ValidatorTestApp
Written by Matthew Menna
6/29/2017
9:48 AM
2017
IntelliJ IDEA
Used to tet the methods in the validator, OOValidator, and MyValidator classes.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidatorTestApp {

    public static void main(String[] args) {
        System.out.println("Validator Test App");
        int caseNumber;
        boolean cont = true;
        String upLowCase;

        Scanner scnr = new Scanner(System.in);
        MyValidator validClass = new MyValidator();

        while( cont ) {
            System.out.println("What Method do you want to test?");
            System.out.println("\t1: Test for .getInt method");
            System.out.println("\t2: Test for .getIntWithinRange method");
            System.out.println("\t3: Test for .getDouble method");
            System.out.println("\t4: Test for .getDoubleWithinRange method");
            System.out.println("\t5: Test for .getRequiredString method");
            System.out.println("\t6: Test for .getRequiredString method with case flag");
            System.out.println("\t7: Test for .getDoubleWithinRange method");
            System.out.println("Pick one: ");

            caseNumber = scnr.nextInt();


                switch (caseNumber) {
                    case 1: {
                        System.out.println(validClass.getInt("Enter an integer:"));
                        System.out.println();
                        break;
                    }
                    case 2: {
                        System.out.println(validClass.getIntWithinRange("Enter an integer between 4 and 10", 4, 10));
                        System.out.println();
                        break;
                    }
                    case 3: {
                        System.out.println(validClass.getDouble("Enter a double:"));
                        System.out.println();
                        break;
                    }
                    case 4: {
                        System.out.println(validClass.getDoubleWithinRange("Enter a double between 0 and 100:", 0, 100));
                        System.out.println();
                        break;
                    }
                    case 5: {
                        System.out.println(validClass.getRequiredString("Enter a string:"));
                        System.out.println();
                        break;
                    }
                    case 6: {
                        System.out.println("upper or lower");
                        upLowCase = scnr.nextLine();
                        System.out.println(validClass.getRequiredString("Enter a string:", upLowCase));
                        System.out.println();
                        break;
                    }
                    case 7: {
                        System.out.println(validClass.getChoiceString("Enter a string:", "test", "test"));
                        System.out.println();
                        break;
                    }
                } //end switch

            System.out.println("Do you want to continue? (y/n):");
                scnr.nextLine();
                cont = validClass.getContinue(scnr.nextLine());

        } // end while
    } // end main
} // end class