package exercisesFromInterner.andrzejRYouTube.abstractClasses;

public class Square extends Figure {

    @Override
    public void draw() {
        System.out.println("I'm drawing square");
    }

    @Override
    public void countField() {
        System.out.println("I'm counting square field");
    }
}
