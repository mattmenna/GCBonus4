
import java.util.Scanner;

/**
 * Created by Matt on 6/28/2017.
 */
public class OOValidator {

    private Scanner sc = new Scanner(System.in);
    private boolean validEntry = false;

    public OOValidator(Scanner sc) {

    }

    public int getInt(String prompt) {
        int returnInt = 0;
        String sInput;

        while (!validEntry) {
            System.out.println(prompt);
            sInput = sc.nextLine();
            if (sInput.matches("[1234567890]")) {
                returnInt = Integer.parseInt(sInput);
                validEntry = true;

            } else {
                System.out.println("Please Try Again");
            } // end else

        } // end while
        return returnInt;
    } // end method

    public int getIntWithinRange(String prompt, int min, int max) {
        int returnInt = 0;
        String sInput;

        while (!validEntry) {
            System.out.println(prompt);
            sInput = sc.nextLine();
            if (sInput.matches("[1234567890]")&& (Integer.parseInt(sInput) < min || Integer.parseInt(sInput) > max)) {
                System.out.println("Please Try Again");

            } else {
                returnInt = Integer.parseInt(sInput);
                validEntry = true;
            } // end else

        } // end while
        return returnInt;
    } // end method

    public double getDouble(String prompt) {
        double returnDouble = 0;
        String sInput;

        while (!validEntry) {
            System.out.println(prompt);
            sInput = sc.nextLine();
            if (sInput.matches("[1234567890]")) {
                returnDouble = Double.valueOf(sInput);
                validEntry = true;

            } else {
                System.out.println("Please Try Again");
            } // end else

        } // end while
        return returnDouble;
    }

    public double getDoubleWithinRange(String prompt, double min, double max) {
        double returnDouble = 0;
        String sInput;

        while (!validEntry) {
            System.out.println(prompt);
            sInput = sc.nextLine();
            if (sInput.matches("[1234567890]") && (Double.valueOf(sInput) <min || Double.valueOf(sInput)>max)) {
                System.out.println("Please Try Again");
            } else {
                returnDouble = Double.valueOf(sInput);
                validEntry = true;
            } // end else

        } // end while
        return returnDouble;
    }
}
