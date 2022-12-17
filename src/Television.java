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

}
