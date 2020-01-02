package exercisesFromInterner.javaStart.interfaces.app;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Application is running");
        Screen1 screen1 = new Screen1();

        Thread.sleep(3000);

        screen1.getButton().click();
    }
}
