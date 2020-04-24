package bridge.concrete_colors;

import bridge.color_interface.IColor;

public class ColorBlue implements IColor {
    @Override
    public String fill() {
        return "blue";
    }
}
