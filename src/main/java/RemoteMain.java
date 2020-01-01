public class RemoteMain {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl("black");

        remoteControl.volumeUp();
        remoteControl.volumeUp();
        remoteControl.volumeUp();

        remoteControl.nextChannel();
        remoteControl.nextChannel();

        remoteControl.setCurrentVolume(30);
        remoteControl.setCurrentChannel(3);

        System.out.println(remoteControl.getCurrentChannel());
        System.out.println(remoteControl.getCurrentVolume());

        System.out.println(remoteControl.getColor());
    }
}
