package exercisesFromInterner.anonymousClass;

public class Main {
    public static void main(String[] args) {


        class A {
            public void methodA() {
                System.out.println("methodA");
            }

        }
        class B {
            A a = new A() {
                public void methodA() {
                    System.out.println("anonymous methodA");
                }
            };
        }
    }
}
