package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testGetNameCircle() {
        Shape circle = new Circle();
        String nameCircle = circle.getShapeName();
        Assert.assertEquals(nameCircle, "Circle");
    }

    @Test
    public void testGetNameTriangle() {
        Shape triangle = new Triangle();
        String nameTriangle = triangle.getShapeName();
        Assert.assertEquals(nameTriangle, "Triangle");
    }

    @Test
    public void testGetNameSquare() {
        Shape square = new Square();
        String nameSquare = square.getShapeName();
        Assert.assertEquals(nameSquare, "Square");
    }

    @Test
    public void testGetFieldCircle() {
        Shape circle = new Circle();
        int fieldCircle = circle.getField();
        Assert.assertEquals(fieldCircle, 1);
    }

    @Test
    public void testGetFieldTriangle() {
        Shape triangle = new Triangle();
        int fieldTriangle = triangle.getField();
        Assert.assertEquals(fieldTriangle, 1);
    }

    @Test
    public void testGetFieldSquare() {
        Shape square = new Square();
        int fieldSquare = square.getField();
        Assert.assertEquals(fieldSquare, 1);
    }

    @Test
    public void testAddFigureCircle() {
        Shape square = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        Assert.assertEquals(shapeCollector.getShapes().size(), 1);

    }

    @Test
    public void testAddFigureTriangle() {
        Shape triangle = new Triangle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);
        Assert.assertEquals(shapeCollector.getShapes().size(), 1);

    }

    @Test
    public void testAddFigureSquare() {
        Shape square = new Square();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        Assert.assertEquals(shapeCollector.getShapes().size(), 1);

    }

    @Test
    public void testGetFigureCircle() {
        Shape circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        Shape shape = shapeCollector.getFigure(0);
        Assert.assertEquals(shape, circle);
    }

    @Test
    public void testGetFigureTriangle() {
        Shape triangle = new Triangle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);
        Shape shape = shapeCollector.getFigure(0);
        Assert.assertEquals(shape, triangle);
    }

    @Test
    public void testGetFigureSquare() {
        Shape square = new Square();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        Shape shape = shapeCollector.getFigure(0);
        Assert.assertEquals(shape, square);
    }

    @Test
    public void testRemoveFigureCircle() {
        Shape circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        shapeCollector.removeFigure(circle);
        int sizeShapeList = shapeCollector.getShapes().size();
        Assert.assertEquals(sizeShapeList, 0);

    }

    @Test
    public void testRemoveFigureTriangle() {
        Shape triangle = new Triangle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);
        shapeCollector.removeFigure(triangle);
        int sizeShapeList = shapeCollector.getShapes().size();
        Assert.assertEquals(sizeShapeList, 0);

    }

    @Test
    public void testRemoveFigureSquare() {
        Shape square = new Square();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        shapeCollector.removeFigure(square);
        int sizeShapeList = shapeCollector.getShapes().size();
        Assert.assertEquals(sizeShapeList, 0);
    }


}
