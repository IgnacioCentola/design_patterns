package bridge.concrete_shapes;

import bridge.color_interface.IColor;
import bridge.shape_interface.Shape;

import java.util.HashMap;
import java.util.Map;

public class CircleShape extends Shape {
    private final Map<String, String> circleProps;
    public CircleShape(IColor color) {
        super(color);
        circleProps = new HashMap<>();
    }

    @Override
    public Map<String, String> draw() {
        circleProps.put("shape", "circle");
        circleProps.put("color", color.fill());
        return circleProps;
    }
}
