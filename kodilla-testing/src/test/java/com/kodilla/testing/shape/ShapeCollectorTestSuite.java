package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    @Nested
    class ListModificationTests {
        @DisplayName("When a new shape is created," + "then addFigure() should add it to the list if indicated so.")
        @Test
        public void testAddFigure() {
            //Given
            Shape square = new Square("square", 2.5);
            ShapeCollector collector = new ShapeCollector();

            //When
            collector.addFigure(square);
            Shape resultShape = collector.getFigure(0);

            //Then
            Assertions.assertEquals(square, resultShape);
        }

        @DisplayName("When a shape is created and first added to the list," + "then removeFigure() should remove it from the list if indicated so.")
        @Test
        public void testRemoveFigure() {
            //Given
            Shape square = new Square("square", 2.5);
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(square);

            //When
            collector.removeFigure(square);

            //Then
            Assertions.assertEquals(0, collector.shapes.size());
        }
    }

    @Nested
        class ElementsRetrievalTests {
        @DisplayName("When a shape is created and added to the list," + "then getFigure() should retrieve it if indicated so.")
        @Test
        public void testGetFigure() {
            //Given
            Shape square = new Square("square", 2.5);
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(square);

            //When
            Shape resultShape = collector.getFigure(0);

            //Then
            Assertions.assertEquals(square, resultShape);
        }

        @DisplayName("When the list is filled with shapes," + "then showFigures() should retrieve the whole list.")
        @Test
        public void testShowFigures() {
            //Given
            Shape square = new Square("square", 2.5);
            Shape circle = new Circle("circle", 1.5);
            Shape triangle = new Triangle("triangle", 5.5, 3.5);
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(square);
            collector.addFigure(circle);
            collector.addFigure(triangle);
            List<Shape> testShapes = new ArrayList<>();
            testShapes.add(square);
            testShapes.add(circle);
            testShapes.add(triangle);
            //When
            List<Shape> resultList = collector.showFigures();

            //Then
            Assertions.assertEquals(testShapes, resultList);
        }
    }
}
