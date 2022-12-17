public class Television {
    private String model;
    private boolean isOn;
    private int volume;
    private TvChannel[] tvChannels;

    public Television(String model) {
        this.model = model;
        this.isOn = false;
        this.volume = 5;
        this.tvChannels = new TvChannel[10];
    }

    public String getModel() {
        return model;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getVolume() {
        return volume;
    }

    public TvChannel[] getTvChannels() {
        return tvChannels;
    }

    public void turnOn() {
        if (!isOn) {
            this.isOn = true;
            System.out.println("TV is turning on...");
        } else {
            System.out.println("TV is already turned on");
        }
    }

    public void turnOff() {
        if (isOn) {
            this.isOn = false;
            System.out.println("TV is turning off...");
        } else {
            System.out.println("TV is already turned off");
        }
    }

    public int increaseVolume() {
        if(!isOn){
            System.out.println("Turn the TV first");
            return -1;
        }
        if (this.volume < 10) {
            System.out.println("Volume is increasing...");
            this.volume++;
        }
        return this.volume;
    }

    public int decreaseVolume() {
        if(!isOn){
            System.out.println("Turn the TV first");
            return -1;
        }
        if (this.volume > 0) {
            System.out.println("Volume is decreasing...");
            this.volume--;
        }
        return this.volume;
    }

    public void changeChannel(int channelNumber) {
        if(!isOn){
            System.out.println("Turn the TV first");
            return;
        }
        for (int i = 0; i < tvChannels.length; i++) {
            String chName = tvChannels[i].getChannelName();
            if (channelNumber == tvChannels[i].getChannelNumber()) {
                System.out.println("Switching on the " + chName + " channel");
                return;
            }
        }
        System.out.println(channelNumber + " doesn't exist");
    }
}
