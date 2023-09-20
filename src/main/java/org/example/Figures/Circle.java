package org.example.Figures;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Circle extends Figure {
    private int side;
    private double perimeter;
    private double square;

    public Circle(int side) {
        this.side = side;
    }

    @Override
    public void calculateSquare() {
        square = Math.PI * Math.pow(side, 2);
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * Math.PI * side;
    }
}
