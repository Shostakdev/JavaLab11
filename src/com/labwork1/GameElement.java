package com.labwork1;

public interface GameElement {
    /**
     * Calculate the area of the game element
     * @return the area of the game element
     */
    double calculateArea();

    /**
     * Add a child to the game element
     * @param element the child to add
     */
    void add(GameElement element);

    /**
     * Remove a child from the game element
     * @param element the child to remove
     */
    void remove(GameElement element);

    /**
     * Get a child of the game element
     * @param index the index of the child to get
     * @return the child at the specified index
     */
    GameElement getChild(int index);
}

