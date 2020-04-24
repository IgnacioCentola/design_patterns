package bridge.shape_interface;

import bridge.color_interface.IColor;

import java.util.Map;

public abstract class Shape {
    protected IColor color;
    public Shape(IColor color){
        this.color = color;
    }
    abstract public Map<String, String> draw();
}
