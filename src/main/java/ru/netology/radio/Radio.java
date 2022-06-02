package ru.netology.radio;

public class Radio {
    private int radioChannel;
    private int radioVolume;

    private int countOfChannels;

    public Radio(int countOfChannels) {
        this.countOfChannels = countOfChannels;
    }

    public Radio() {
        this.countOfChannels = 10;
    }

    public void setRadioChannel(int newRadioChannel) {
        if (newRadioChannel > countOfChannels - 1) {
            newRadioChannel = 0;
        }
        if (newRadioChannel < 0) {
            newRadioChannel = countOfChannels - 1;
        }
        this.radioChannel = newRadioChannel;
    }

    public int getRadioChannel() {
        return radioChannel;
    }

    public void setRadioVolume(int newRadioVolume) {
        if (newRadioVolume > 100) {
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
        if (channelManual >= 0 && channelManual <= 9) {
            setRadioChannel(channelManual);
        }

    }

}
