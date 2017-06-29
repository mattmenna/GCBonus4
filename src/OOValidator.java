import java.util.Scanner;

/**
 * Created by Matt on 6/28/2017.
 */
public class OOValidator {

    Scanner sc;

    public OOValidator(Scanner sc) {

    }

    public int getInt(String prompt) {
        System.out.println("Enter any integer:");
        sc.nextLine()

        return 0;
    }

    public int getIntWithinRange(String prompt, int min, int max){
        System.out.println("Enter any integer between " + min + "and " + max + ":");
        return 0;
    }

    public double getDouble(String prompt){
        System.out.println("Enter any double:");
        return 0;
    }

    public double getDoubleWithinRange(String prompt, double min, double max){
        System.out.println("Enter any double between " + min + "and " + max + ":");
        return 0;
    }
}
