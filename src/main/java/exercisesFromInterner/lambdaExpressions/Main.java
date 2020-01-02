package exercisesFromInterner.lambdaExpressions;

public class Main {
    private static void printAgeMoreThen20(Person person, IAgeChecker checker) {
        System.out.println("Result: " + checker.checkAge(person));
    }

    public static void main(String[] args) {
        Person person = new Person("Jan", 21);
        /*to samo co lambda tylko w jednej linii
        printAgeMoreThen20(person, new IAgeChecker() {
            @Override
            public boolean checkAge(Person person) {
                return person.getAge() > 20;
            }
        });
        */
        printAgeMoreThen20(person, p -> p.getAge() > 20);

        LambdaScope ls = new LambdaScope();
        LambdaScope.FirstLevel fl = ls.new FirstLevel();
        fl.methodFirstLevel(2);
    }


}
