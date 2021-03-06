package ru.netology.radio;

public class Radio {
    private int radioChannel;
    private int radioVolume;

    public void setRadioChannel(int newRadioChannel) {
        if (newRadioChannel > 9) {
            newRadioChannel = 0;
        }
        if (newRadioChannel < 0) {
            newRadioChannel = 9;
        }
        this.radioChannel = newRadioChannel;
    }

    public int getRadioChannel() {
        return radioChannel;
    }

    public void setRadioVolume(int newRadioVolume) {
        if (newRadioVolume > 10) {
            return;
        }
        if (newRadioVolume < 0) {
            return;
        }
        this.radioVolume = newRadioVolume;
    }

    public int getRadioVolume() {
        return radioVolume;
    }




    public void radioVolumeUp() {
        setRadioVolume(getRadioVolume() + 1);
    }

    public void radioVolumeDown() {
        setRadioVolume(getRadioVolume() - 1);
    }

    public void radioChannelNext() {
        setRadioChannel(getRadioChannel() + 1);
    }

    public void radioChannelPrev() {
        setRadioChannel(getRadioChannel() - 1);
    }

    public void radioChannelManualControl(int channelManual) {
        if (channelManual >= 0 && channelManual <= 9)
            setRadioChannel(channelManual);

    }

}
