package exercisesFromInterner.javaStart.interfaces.framework;

public class Button {
    private OnClickListener listener;

    public void click() {
        if (listener != null) {
            listener.onClick();
        }
    }

    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }
}
