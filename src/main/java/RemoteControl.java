import java.util.List;

public class RemoteControl {
    private static final int LENGHT_IN_CH = 15;
    private static final int WIDTH_IN_ON = 4;
    private static final int THICKNESS_IN_CM = 1;

    private static final List<String> BUTTON = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
            "Power", "VolumeUp", "VolumeDown", "NextChannel", "PreviousChannel");

    private final String color;

    private int currentVolume;
    private int currentChannel;

    public RemoteControl(String color) {
        this.color = color;
    }

    public void volumeUp() {
        currentVolume++;
    }

    public void volumeDown() {
        currentVolume--;
    }

    public void nextChannel() {
        currentChannel++;
    }

    public void previousChannel() {
        currentChannel--;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public String getColor() {
        return color;
    }

    public void setCurrentVolume(int volume) {
        currentVolume = volume;
    }

    public void setCurrentChannel(int channel) {
        currentChannel = channel;
    }
}
