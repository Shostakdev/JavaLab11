package com.labwork1;

/**
 * Represents a shape in the game.
 */
public class Shape implements GameElement {
    /**
     * The width of the shape
     */
    private double width;
    /**
     * The height of the shape
     */
    private double height;

    /**
     * Constructor
     * @param width of the shape
     * @param height of the shape
     */
    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void add(GameElement element) {
        // Leaf nodes do not support add operation
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(GameElement element) {
        // Leaf nodes do not support remove operation
        throw new UnsupportedOperationException();
    }

    @Override
    public GameElement getChild(int index) {
        // Leaf nodes do not support getChild operation
        throw new UnsupportedOperationException();
    }
}

