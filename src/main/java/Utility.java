import java.util.HashSet;

public class Utility {

    public static final String Addition = "+";
    public static final String Subtraction = "-";
    public static final String Multiplication = "*";
    public static final String Division = "/";

    private static HashSet<String> whitelist =
        new HashSet<String>() { {
            add(Addition);
            add(Subtraction);
            add(Multiplication);
            add(Division);
        } };

    public static boolean inWhitelist(String operation) {
        return whitelist.contains(operation);
    }
}
