/**
 * OOPSBannerApp UC5 - Render OOPS as Banner using Inline Array Initialization
 *
 * This use case extends UC4 by defining and populating the String array
 * in a concise way at the time of declaration using String.join().
 *
 * @author Developer
 * @version 5.0
 */

public class OOPSBannerApp {

    // Main method to run the banner display
    public static void main(String[] args) {

        // Each line represents a row in the banner for letters O, O, P, S
        String[] lines = {
            String.join(" ", " ***  ", " ***  ", " ***** ", " ***** "),
            String.join(" ", "*   * ", "*   * ", "*   * ", "*     "),
            String.join(" ", "*   * ", "*   * ", " ***** ", " ***** "),
            String.join(" ", "*   * ", "*   * ", "*      ", "     *"),
            String.join(" ", "*   * ", "*   * ", "*      ", "*    *"),
            String.join(" ", " ***  ", " ***  ", "*      ", " **** ")
        };

        // Print each line of the banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}