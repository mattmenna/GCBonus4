
/*
GCBonus4
ValidatorTestApp
Written by Matthew MEnna
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

        validClass.getInt("Hi");

    }
}
