public class Television {
    private String model;
    private boolean isOn;
    private int volume;
    private TvChannel[] tvChannel;

    public Television(String model) {
        this.model = model;
        this.isOn = false;
        this.volume = 5;
        this.tvChannel = new TvChannel[10];
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

    public TvChannel[] getTvChannel() {
        return tvChannel;
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
        if (this.volume < 10) {
            this.volume++;
        }
        return this.volume;
    }

    public int decreaseVolume() {
        if (this.volume > 0) {
            this.volume--;
        }
        return this.volume;
    }
}
