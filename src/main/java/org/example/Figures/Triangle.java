package org.example.Figures;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Triangle extends Figure{
    private int firstSide;
    private int secondSide;
    private double perimeter;
    private double square;

    public Triangle(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void calculateSquare() {
        square = (double) (firstSide * secondSide) /2;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = firstSide * 2 + secondSide;
    }
}
