package exercisesFromInterner.lambdaExpressions;

import java.util.function.Consumer;

public class LambdaScope {
    public int x = 0;

    public class FirstLevel {
        int x = 1;

        public void methodFirstLevel(int x) {
            Consumer<Integer> cons = (y) -> {
                System.out.println("x = " + x);
                System.out.println("this.x = " + this.x);
                System.out.println("LambdaScope.this.x = " + LambdaScope.this.x);
            };
            cons.accept(x);
        }
    }
}
