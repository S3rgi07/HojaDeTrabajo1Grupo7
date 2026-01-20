public interface Radio {
    void forwardFrequency(double frequency);

    void backwardFrequency(double frequency);

    void changeStation(double station);

    void turnOnOff();

    void saveFrequency(double frequency, int slot);

    void loadFrequency(int slot);
}