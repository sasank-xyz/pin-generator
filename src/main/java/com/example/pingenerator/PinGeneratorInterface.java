package com.example.pingenerator;

import java.util.Collection;

/**
 * Class that generates 1000 unique, 4 digit pins.
 */
public interface PinGeneratorInterface {
    /**
     * Generates a collection of 1000 unique 4 digit pins.
     *
     * @return The collection of 1000 pins
     */
    Collection<String> generatePins();
}
