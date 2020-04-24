package bridge;

import bridge.concrete_colors.ColorRed;
import bridge.concrete_shapes.CircleShape;
import bridge.concrete_shapes.SquareShape;
import bridge.shape_interface.Shape;

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new CircleShape(new ColorRed());
        printShape(redCircle);

        Shape redSquare = new SquareShape(new ColorRed());
        printShape(redSquare);

    }

    static void printShape(Shape shape) {
        System.out.println("Shape drawn. Shape: "
                + shape.draw().get("shape")
                + ". Color: " + shape.draw().get("color"));
    }
}
