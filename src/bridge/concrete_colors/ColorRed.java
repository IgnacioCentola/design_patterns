package bridge.concrete_colors;

import bridge.color_interface.IColor;

public class ColorRed implements IColor {
    @Override
    public String fill() {
        return "red";
    }
}
