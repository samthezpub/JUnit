package org.example.Figures;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Figure {
    private int side;
    private int perimeter;
    private float square;

    public abstract void calculateSquare();
    public abstract void calculatePerimeter();

}
