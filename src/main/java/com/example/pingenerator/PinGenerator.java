package com.example.pingenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class PinGenerator implements PinGeneratorInterface {
    private final Random random = new Random();

    @Override
    public Collection<String> generatePins() {
        ArrayList<String> pins = new ArrayList<>();

        pins.add(generateSinglePin());

        return pins;
    }

    private String generateSinglePin() {
        StringBuilder pin = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            String digit = String.valueOf(random.nextInt(10));
            pin.append(digit);
        }
        return pin.toString();
    }
}
