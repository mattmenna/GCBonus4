
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
        System.out.println("Hello World");
        Scanner scnr = new Scanner(System.in);
        OOValidator validClass = new OOValidator(scnr);

        System.out.println(validClass.getInt("Enter an integer:"));

        System.out.println();
        System.out.println(validClass.getIntWithinRange("Enter an integer between 4 and 10" , 4, 10));
        System.out.println();
        System.out.println(validClass.getDouble("Enter a double:"));
        System.out.println();
        System.out.println(validClass.getDoubleWithinRange("Enter a double between 0 and 100", 0, 100));
    }
}
