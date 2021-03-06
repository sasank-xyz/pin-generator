package com.example.pingenerator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

/**
 * Class that generates 1000 unique, 4 digit pins.
 */
public class PinGenerator implements PinGeneratorInterface {
    private static final int PIN_LENGTH = 4;
    private static final int NUMBER_OF_PINS = 1000;
    private final Random random = new Random();

    /**
     * Generates a collection of 1000 unique 4 digit pins.
     *
     * @return The collection of 1000 pins
     */
    @Override
    public Collection<String> generatePins() {
        HashSet<String> pins = new HashSet<>();

        while (pins.size() < NUMBER_OF_PINS) {
            pins.add(generateSinglePin());
        }

        return pins;
    }

    /**
     * Generate a single 4 digit pin.
     *
     * @return 4 digit pin
     */
    private String generateSinglePin() {
        StringBuilder pin = new StringBuilder();
        for (int i = 0; i < PIN_LENGTH; i++) {
            String digit = String.valueOf(random.nextInt(10));
            pin.append(digit);
        }
        return pin.toString();
    }
}
