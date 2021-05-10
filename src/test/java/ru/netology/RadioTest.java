package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSelectChannelWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentChannel(4);
        assertEquals(4, radio.getCurrentChannel());
    }

    @Test
    void shouldSelectChannelOverRange() {
        Radio radio = new Radio();
        radio.setCurrentChannel(52);
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    void shouldSelectChannelBelowRange() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-3);
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    void shouldSwitchNextChannelLowerMaxChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(3);
        radio.nextChannel();
        assertEquals(4, radio.getCurrentChannel());
    }

    @Test
    void shouldSwitchNextChannelAboveMaxChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.nextChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    void shouldSwitchPrevChannelWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentChannel(8);
        radio.previousChannel();
        assertEquals(7, radio.getCurrentChannel());
    }

    @Test
    void shouldSwitchPrevChannelLowerMinChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.previousChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    void shouldSetVolumeWithinLevel () {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void shouldSetVolumeOverRange () {
        Radio radio = new Radio();
        radio.setCurrentVolume(123);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeWithinRange () {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.increaseVolume();
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeOverRange () {
        Radio radio = new Radio();
        radio.setCurrentVolume(321);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeWithinRange () {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.decreaseVolume();
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeOutOfRange () {
        Radio radio = new Radio();
        radio.setCurrentVolume(-2);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}



