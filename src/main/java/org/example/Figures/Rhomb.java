package org.example.Figures;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Rhomb extends Figure{
    private int firstSide;
    private int secondSide;
    private double perimeter;
    private double square;

    public Rhomb(int side, int secondSide) {
        this.firstSide = side;
        this.secondSide = secondSide;
    }

    @Override
    public void calculateSquare() {
        square = firstSide * secondSide;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 4 * firstSide;
    }
}
