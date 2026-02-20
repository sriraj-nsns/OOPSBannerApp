/**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Each row of the OOPS banner
        System.out.println(String.join(" ", " *** ", " *** ", " ***** ", " ***** "));
        System.out.println(String.join(" ", "*   *", "*   *", "*     *", "*     "));
        System.out.println(String.join(" ", "*   *", "*   *", " ***** ", " ***** "));
        System.out.println(String.join(" ", "*   *", "*   *", "*     ", "       *"));
        System.out.println(String.join(" ", "*   *", "*   *", "*      ", "*     *"));
        System.out.println(String.join(" ", " *** ", " *** ", "*      ", " ***** "));
    }
}