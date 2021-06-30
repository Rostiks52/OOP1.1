package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int minChannel = 0;
    private int channels = 10;
    private int maxChannel = (channels - 1);
    private int currentChannel;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;



    public int getMaxChannel() {
        return maxChannel;
    }

    public void setMaxChannel(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel)
            return;
        if (currentChannel < minChannel)
            return;
        this.currentChannel = currentChannel;
    }

    public void nextChannel() {
        if (currentChannel == maxChannel) {
            currentChannel = minChannel;
        } else {
            currentChannel++;
        }
    }

    public void previousChannel() {
        if (currentChannel == minChannel) {
            currentChannel = maxChannel;
        } else {
            currentChannel--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }
}
