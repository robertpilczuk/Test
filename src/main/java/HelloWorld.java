import lombok.Data;
import lombok.Value;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int add = addition(3);
        System.out.println("resoult :" + add);
        int add1 = secAdd(3, 5);
        System.out.println("resoult : " + add1);

    }

    @Value
    @Data

    public class User {
        private String name;
        private String surname;
        private int age;
        private String address;
    }

    private static int addition(int a) {
        int first = 1;
        int second = 2;
        return a + first + second;
    }

    private static int secAdd(int first, int second) {
        return first + second;
    }
}
