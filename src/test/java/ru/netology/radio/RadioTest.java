package ru.netology.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/volumeDownTestData"})
    void radioVolumeDownTest(int volume, int volumeDown, int expected) {
        Radio radio = new Radio();
        RadioControl control = new RadioControl();

        volume = control.volumeDown(volumeDown, volume);
        radio.setRadioVolume(volume);

        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/volumeUpTestData"})
    void radioVolumeUpTest(int volume, int volumeUp, int expected) {
        Radio radio = new Radio();
        RadioControl control = new RadioControl();

        volume = control.volumeUp(volumeUp, volume);
        radio.setRadioVolume(volume);

        int actual = radio.getRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/channelUpTestData"})
    void radioChannelUpTest(int channel, int channelUp, int expected) {
        Radio radio = new Radio();
        RadioControl control = new RadioControl();

        channel = control.chanellNext(channelUp, channel);
        radio.setRadioChannel(channel);

        int actual = radio.getRadioChannel();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/channelDownTestData"})
    void radioChannelDownTest(int channel, int channelDown, int expected) {
        Radio radio = new Radio();
        RadioControl control = new RadioControl();

        channel = control.chanellPrev(channelDown, channel);
        radio.setRadioChannel(channel);

        int actual = radio.getRadioChannel();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/channelManualControlTestData"})
    void radioChannelManualControlTest(int channel, int manual, int expected) {
        Radio radio = new Radio();
        RadioControl control = new RadioControl();

        channel = control.channelManualControl(channel, manual);
        radio.setRadioChannel(channel);

        int actual = radio.getRadioChannel();

        Assertions.assertEquals(expected, actual);
    }
}
