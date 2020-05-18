import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("========= Google Guice Sample : Binary Calculator =========");
        Scanner sc = new Scanner(System.in);

        System.out.println("Please choose the following operation + - * /");

        String operation = sc.nextLine();
        while (!Utility.inWhitelist(operation)) {
            System.out.println("The operation you chose is undefined");
            operation = sc.nextLine();
        }

        System.out.println("Please type the first number");

        while (!sc.hasNextLong()) {
            System.out.println("That's not a number");
            sc.next();
        }
        long expr1 = sc.nextLong();

        System.out.println("Please type the second number");

        while (!sc.hasNextLong()) {
            System.out.println("That's not a number");
            sc.next();
        }
        long expr2 = sc.nextLong();

        Injector injector = Guice.createInjector(new Configuration());
        BinaryCalculator calculator = injector.getInstance(BinaryCalculator.class);
        long result = calculator.calc(expr1, operation, expr2);

        System.out.println("The answer is " + result);
    }
}
