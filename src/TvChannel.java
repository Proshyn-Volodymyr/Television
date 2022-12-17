public class TvChannel {
    private String channelName;
    private int channelNumber;

    public TvChannel(String channelName, int channelNumber) {
        this.channelName = channelName;
        this.channelNumber = channelNumber;
    }

    public String getChannelName() {
        return channelName;
    }

    public int getChannelNumber() {
        return channelNumber;
    }
}
