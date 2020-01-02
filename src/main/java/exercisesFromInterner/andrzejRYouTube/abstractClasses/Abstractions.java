package exercisesFromInterner.andrzejRYouTube.abstractClasses;

public class Abstractions {
    public static void main(String[] args) {

        Figure f1 = new Triangle();
        f1.h = 5;
        f1.a = 2;
        f1.draw();
        f1.countField();
        System.out.println(f1.info("Triangle"));
        Figure f2 = new Square();
        f2.draw();
        f2.countField();
        System.out.println(f2.info("Square"));
    }
}
