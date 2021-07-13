package com.example.pingenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class PinGenerator implements PinGeneratorInterface {
    private final Random random = new Random();
    private static final int PIN_LENGTH = 4;

    @Override
    public Collection<String> generatePins() {
        ArrayList<String> pins = new ArrayList<>();

        for (int i=0; i<1000; i++) {
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
