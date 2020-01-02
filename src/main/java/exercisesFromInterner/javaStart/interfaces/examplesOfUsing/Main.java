package exercisesFromInterner.javaStart.interfaces.examplesOfUsing;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Logger logger = new FileLogger();
        run(logger);

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Comparator<Person> reversed = comparator.reversed();
    }

    private static void run(Logger logger) {
        logger.log("Testing logger");
        logger.error("There is some error!");
    }
}
