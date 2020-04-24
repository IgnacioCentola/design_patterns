package bridge.concrete_shapes;

import bridge.color_interface.IColor;
import bridge.shape_interface.Shape;

import java.util.HashMap;
import java.util.Map;

public class SquareShape extends Shape {
    private final Map<String, String> squareProps;
    public SquareShape(IColor color) {
        super(color);
        squareProps = new HashMap<>();
    }

    @Override
    public Map<String, String> draw() {
        squareProps.put("shape", "square");
        squareProps.put("color", color.fill());
        return squareProps;
    }
}
