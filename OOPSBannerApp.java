/**
 * OOPSBannerApp UC6 – OOPS Banner Application (Use Case 6)
 * Modular banner generation using helper methods.
 */
public class OOPSBannerApp {

    // Pattern for letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    // Pattern for letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };
    }

    // Pattern for letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };
    }

    // Main method
    public static void main(String[] args) {

        String[] oPattern1 = getOPattern();
        String[] oPattern2 = getOPattern(); // second O
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Assemble and print banner
        for (int i = 0; i < oPattern1.length; i++) {
            System.out.println(
                oPattern1[i] + "  " +
                oPattern2[i] + "  " +
                pPattern[i] + "  " +
                sPattern[i]
            );
        }
    }
}