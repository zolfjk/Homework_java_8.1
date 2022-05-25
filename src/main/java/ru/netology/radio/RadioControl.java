package ru.netology.radio;

public class RadioControl {

    public int chanellNext(int numberOfPush, int radioChannel) {
        Radio radio = new Radio();
        radio.setRadioChannel(radioChannel);
        for (int i = 0; i < numberOfPush; i++) {
            radio.setRadioChannel(radio.getRadioChannel() + 1);
        }
        return radio.getRadioChannel();
    }

    public int chanellPrev(int numberOfPush, int radioChannel) {
        Radio radio = new Radio();
        radio.setRadioChannel(radioChannel);
        for (int i = 0; i < numberOfPush; i++) {
            radio.setRadioChannel(radio.getRadioChannel() - 1);
        }
        return radio.getRadioChannel();
    }

    public int  channelManualControl(int channel, int channelChange) {
        Radio radio = new Radio();
        if (channelChange >= 0 && channelChange <= 9) {
            radio.setRadioChannel(channelChange);
            return radio.getRadioChannel();
        }
        return channel;
    }

    public int volumeUp(int numberOfPush, int radioVolumeDefault) {
        Radio radio = new Radio();
        radio.setRadioVolume(radioVolumeDefault);
        for (int i = 0; i < numberOfPush; i++) {
            radio.setRadioVolume(radio.getRadioVolume() + 1);
        }
        return radio.getRadioVolume();
    }

    public int volumeDown(int numberOfPush, int radioVolumeDefault) {
        Radio radio = new Radio();
        radio.setRadioVolume(radioVolumeDefault);
        for (int i = 0; i < numberOfPush; i++) {
            radio.setRadioVolume(radio.getRadioVolume() - 1);
        }
        return radio.getRadioVolume();
    }
}
