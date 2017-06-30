import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Matt on 6/28/2017.
 */
public class MyValidator extends OOValidator {

    /**
     *
     * @param prompt
     * @return
     */
    public String getRequiredString(String prompt) {
        String rString = sc.nextLine();
        return rString;
    } // end method

    public String getRequiredString(String prompt, String sCase) {
        if (sCase.equalsIgnoreCase("upper")){
            String rString = sc.nextLine().toUpperCase();
            return rString;
        } else if ( sCase.equalsIgnoreCase("lower")){
            String rString = sc.nextLine().toLowerCase();
            return rString;
        } else {
            String rString = sc.nextLine();
            return rString;
        }
    } // end method

    /**
     *
     * @param prompt
     * @param s1
     * @param s2
     * @return
     */
    public String getChoiceString(String prompt, String s1, String s2) {
        String rString = "empty";
        return rString;
    } // end method

    public boolean getContinue(String sInput){
        //String[] contArray = {"yes", "y"};

            if (sInput.toLowerCase().equals("yes") || sInput.toLowerCase().equals("y")) {
                return true;
            } else {
                System.out.println("Please try again");
                return false;
            }
    } // end method

} // end class
