package com.labwork1;

/**
 * Main class to test the composite pattern.
 */
public class Main {
    /**
     * Main method to test the composite pattern.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GameElement rectangle = new Shape(10, 5);
        GameElement square = new Shape(3, 3);

        CompositeShape composite1 = new CompositeShape();
        composite1.add(rectangle);
        composite1.add(square);

        GameElement triangle = new Shape(6, 4);

        CompositeShape composite2 = new CompositeShape();
        composite2.add(composite1);
        composite2.add(triangle);

        System.out.println("Total area of composite2: " + composite2.calculateArea());
    }
}