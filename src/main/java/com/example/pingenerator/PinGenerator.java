package com.example.pingenerator;

import java.util.*;

public class PinGenerator implements PinGeneratorInterface {
    private final Random random = new Random();
    private static final int PIN_LENGTH = 4;
    private static final int NUMBER_OF_PINS = 1000;


    @Override
    public Collection<String> generatePins() {
        HashSet<String> pins = new HashSet<>();

        while (pins.size() < NUMBER_OF_PINS) {
            pins.add(generateSinglePin());
        }

        return pins;
    }

    private String generateSinglePin() {
        StringBuilder pin = new StringBuilder();
        for (int i = 0; i < PIN_LENGTH; i++) {
            String digit = String.valueOf(random.nextInt(10));
            pin.append(digit);
        }
        return pin.toString();
    }
}
