package exercisesFromInterner.javaStart.interfaces.app;

import exercisesFromInterner.javaStart.interfaces.framework.Button;

public class Screen1 {
    private final Button button;

    public Screen1() {
        button = new Button();
        button.setOnClickListener(() -> System.out.println("Somebody just click on button !"));
    }

    public Button getButton() {
        return button;
    }
}
