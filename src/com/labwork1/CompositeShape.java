package com.labwork1;

import java.util.ArrayList;
import java.util.List;

/**
 * CompositeShape class
 */
public class CompositeShape implements GameElement {
    /**
     * List of children
     */
    private List<GameElement> children = new ArrayList<>();

    @Override
    public double calculateArea() {
        double totalArea = 0;
        for (GameElement child : children) {
            totalArea += child.calculateArea();
        }
        return totalArea;
    }

    @Override
    public void add(GameElement element) {
        children.add(element);
    }

    @Override
    public void remove(GameElement element) {
        children.remove(element);
    }

    @Override
    public GameElement getChild(int index) {
        return children.get(index);
    }
}

