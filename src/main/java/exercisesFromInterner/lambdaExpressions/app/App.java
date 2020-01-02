package exercisesFromInterner.lambdaExpressions.app;

import java.util.Scanner;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        IStringPrinter printer = (t -> System.out.println(t));
        testStringPrinter(t -> System.out.println(t));
        printer = System.out::println;
        OperatorTest test = new OperatorTest();
        testStringPrinter(test::print);

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = sum(a, b);
    }

    private static int sum(int a, int b) {
        return a + b;
    }


    private static void testStringPrinter(Consumer<String> printer) {
        printer.accept("Test text");
    }

}
