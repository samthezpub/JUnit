package org.example;

import org.example.Figures.Circle;
import org.example.Figures.Rectangle;
import org.example.Figures.Rhomb;
import org.example.Figures.Triangle;
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

    @Test
    public void Triangle_calculateSquare_MustReturnSquareTypoDoubleWhenCalled() {
        Triangle triangle = new Triangle(10,12);
        triangle.calculateSquare();

        double expected = (double) (10 * 12) /2;

        assertEquals(expected, triangle.getSquare());
    }
    @Test
    public void Triangle_calculatePerimeter_MustReturnSquareTypoDoubleWhenCalled() {
        Triangle triangle = new Triangle(10,12);
        triangle.calculatePerimeter();

        double expected = 10 * 2 + 12;

        assertEquals(expected, triangle.getPerimeter());
    }

    @Test
    public void Rectangle_calculateSquare_MustReturnSquareTypoDoubleWhenCalled() {
        Rectangle rectangle = new Rectangle(10,12);
        rectangle.calculateSquare();

        double expected = 10 * 12;

        assertEquals(expected, rectangle.getSquare());
    }
    @Test
    public void Rectangle_calculatePerimeter_MustReturnSquareTypoDoubleWhenCalled() {
        Rectangle rectangle = new Rectangle(10,12);
        rectangle.calculatePerimeter();

        double expected = (10 + 12) * 2;

        assertEquals(expected, rectangle.getPerimeter());
    }

    @Test
    public void Rhomb_calculateSquare_MustReturnSquareTypoDoubleWhenCalled() {
        Rhomb rhomb = new Rhomb(10,12);
        rhomb.calculateSquare();

        double expected = 10 * 12;

        assertEquals(expected, rhomb.getSquare());
    }
    @Test
    public void Rhomb_calculatePerimeter_MustReturnSquareTypoDoubleWhenCalled() {
        Rhomb rhomb = new Rhomb(10,12);
        rhomb.calculatePerimeter();

        double expected = 4 * 10;

        assertEquals(expected, rhomb.getPerimeter());
    }
}
