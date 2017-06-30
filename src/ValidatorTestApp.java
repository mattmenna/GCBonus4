
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

import java.util.Scanner;

public class ValidatorTestApp {

    public static void main(String[] args) {
        System.out.println("Validator Test App");
        int caseNumber = 0;

        Scanner scnr = new Scanner(System.in);
        OOValidator validClass = new OOValidator(scnr);
        System.out.println("What Method do you want to test?");

        System.out.println("/t1: Test for .getInt method");
        System.out.println("/t2: Test for .getIntWithinRange method");
        System.out.println("/t3: Test for .getDouble method");
        System.out.println("/t4: Test for .getDoubleWithinRange method");
        switch (caseNumber) {
            case 1: {
                System.out.println(validClass.getInt("Enter an integer:"));
                System.out.println();
            }
            case 2: {
                System.out.println(validClass.getIntWithinRange("Enter an integer between 4 and 10", 4, 10));
                System.out.println();
            }
            case 3: {
                System.out.println(validClass.getDouble("Enter a double:"));
                System.out.println();
            }
            case 4: {
                ;
                System.out.println(validClass.getDoubleWithinRange("Enter a double between 0 and 100", 0, 100));
                System.out.println();
            }
        }


    }
}
