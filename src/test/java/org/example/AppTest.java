package org.example;

import org.example.Figures.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testApp() {
        String helloWorld = "Hello World!";
        assertEquals("Hello World!", helloWorld);
    }


    @Test
    public void Circle_calculateSquare_MustReturnSquareTypoDoubleWhenCalled() {
        Circle circle = new Circle(10);
        circle.calculateSquare();

        double expected = Math.PI * Math.pow(10, 2);

        assertEquals(expected, circle.getSquare());
    }

    @Test
    public void Circle_calculatePerimeter_MustReturnSquareTypoDoubleWhenCalled() {
        Circle circle = new Circle(10);
        circle.calculatePerimeter();

        double expected = 2 * Math.PI * 10;

        assertEquals(expected, circle.getPerimeter());
    }

}
