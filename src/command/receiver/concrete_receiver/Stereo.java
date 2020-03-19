package command.receiver.concrete_receiver;

import command.receiver._interface.IGadget;

public class Stereo implements IGadget {
    private boolean isStereoOn = false;
    private int volumeIntensity = 0;

    public boolean isStereoOn() {
        return isStereoOn;
    }

    public int getVolumeIntensity() {
        return volumeIntensity;
    }


    public void turnOn() {
        if (!isStereoOn) {
            isStereoOn = true;
        }
    }

    public void turnOff() {
        if (isStereoOn) {
            isStereoOn = false;
        }
        volumeIntensity = 0;
    }

    public void turnUp() {
        if (!isStereoOn) {
            isStereoOn = true;
        }
        volumeIntensity += 10;
    }

    public void turnDown() {
        if (volumeIntensity <= 0) {
            return;
        }

        volumeIntensity -= 10;
    }
}
