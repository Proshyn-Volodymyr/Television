
public class Main {
    public static void main(String[] args) {
        Television tv1 = new Television("Sony");

        for (int i = 0; i < tv1.getTvChannels().length; i++) {
            String chName = "";
            switch (i + 1) {
                case 1:
                    chName = "FOX";
                    break;
                case 2:
                    chName = "CNN";
                    break;
                case 3:
                    chName = "Discovery";
                    break;
                case 4:
                    chName = "Viasat History";
                    break;
                case 5:
                    chName = "Viasat Sport";
                    break;
                case 6:
                    chName = "HBO";
                    break;
                case 7:
                    chName = "Explorer";
                    break;
                case 8:
                    chName = "TVShows";
                    break;
                case 9:
                    chName = "Cartoon";
                    break;
                case 10:
                    chName = "Movies";
                    break;
            }
            tv1.getTvChannels()[i] = new TvChannel(chName, i+1);
        }
        tv1.turnOn();
        tv1.changeChannel(1);
        tv1.changeChannel(0);
        tv1.changeChannel(10);
        tv1.increaseVolume();
        tv1.turnOff();
    }
}