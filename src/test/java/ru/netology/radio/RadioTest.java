package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "100,100",
            "50,51"
    })
    void radioVolumeUpTest(int defaultChannel, int expectedChannel) {
        Radio radio = new Radio();

        radio.setRadioVolume(defaultChannel);

        radio.radioVolumeUp();

        int actual = radio.getRadioVolume();
        int expected = expectedChannel;

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "100,99",
            "50,49"
    })
    void radioVolumeDownTest(int defaultChannel, int expectedChannel) {
        Radio radio = new Radio();

        radio.setRadioVolume(defaultChannel);

        radio.radioVolumeDown();

        int actual = radio.getRadioVolume();
        int expected = expectedChannel;

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "9,0",
            "5,6"
    })
    void radioChannelNextTest(int defaultChannel, int expectedChannel) {
        Radio radio = new Radio();

        radio.setRadioChannel(defaultChannel);

        radio.radioChannelNext();

        int actual = radio.getRadioChannel();
        int expected = expectedChannel;

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,9",
            "9,8",
            "5,4"
    })
    void radioChannelPrevTest(int defaultChannel, int expectedChannel) {
        Radio radio = new Radio();

        radio.setRadioChannel(defaultChannel);

        radio.radioChannelPrev();

        int actual = radio.getRadioChannel();
        int expected = expectedChannel;

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "5,7,7",
            "6,-1,6",
            "0,12,0"
    })
    void radioChannelManualControlTest(int defaultChannel, int newChannel, int expectedChannel) {
        Radio radio = new Radio();

        radio.setRadioChannel(defaultChannel);

        radio.radioChannelManualControl(newChannel);

        int actual = radio.getRadioChannel();
        int expected = expectedChannel;

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "11,0,1",
            "11,10,0",
            "9,8,0"
    })
    void radioChannelNextWithSetCountOfChannelsTest(int countOfChannels, int defaultChannel, int expectedChannel) {
        Radio radio = new Radio(countOfChannels);

        radio.setRadioChannel(defaultChannel);

        radio.radioChannelNext();

        int actual = radio.getRadioChannel();
        int expected = expectedChannel;

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "11,0,10",
            "11,10,9",
            "9,0,8"
    })
    void radioChannelPrevWithSetCountOfChannelsTest(int countOfChannels, int defaultChannel, int expectedChannel) {
        Radio radio = new Radio(countOfChannels);

        radio.setRadioChannel(defaultChannel);

        radio.radioChannelPrev();

        int actual = radio.getRadioChannel();
        int expected = expectedChannel;

        Assertions.assertEquals(expected, actual);
    }
}
