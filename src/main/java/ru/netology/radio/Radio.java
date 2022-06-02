package ru.netology.radio;

import lombok.Data;

@Data
public class Radio {
    private int radioChannel;
    private int radioVolume;
    private int maxChannel;

    public Radio(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public Radio() {
        this.maxChannel = 9;
    }

    public void setRadioChannel(int newRadioChannel) {
        if (newRadioChannel > maxChannel) {
            newRadioChannel = 0;
        }
        if (newRadioChannel < 0) {
            newRadioChannel = maxChannel;
        }
        this.radioChannel = newRadioChannel;
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
