package command.receiver.concrete_receiver;

import command.receiver._interface.IGadget;

public class Light implements IGadget {
    private boolean isLightOn = false;
    private int lightIntensity = 0;

    public boolean isLightOn() {
        return isLightOn;
    }

    public int getLightIntensity() {
        return lightIntensity;
    }


    public void turnOn() {
        if (!isLightOn) {
            isLightOn = true;
        }
    }

    public void turnOff() {
        if (isLightOn) {
            isLightOn = false;
        }
        lightIntensity = 0;
    }

    public void turnUp() {
        if (!isLightOn) {
            isLightOn = true;
        }
        lightIntensity += 10;
    }

    public void turnDown() {
        if (lightIntensity <= 0) {
            return;
        }

        lightIntensity -= 10;
    }
}
