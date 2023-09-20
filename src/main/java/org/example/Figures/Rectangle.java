package org.example.Figures;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;
    private double perimeter;
    private double square;

    public Rectangle(int side, int secondSide) {
        this.firstSide = side;
        this.secondSide = secondSide;
    }

    @Override
    public void calculateSquare() {
        square = firstSide * secondSide;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = (firstSide + secondSide) * 2;
    }
}
