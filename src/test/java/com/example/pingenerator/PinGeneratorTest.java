package com.example.pingenerator;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PinGeneratorTest {
    private final PinGeneratorInterface pinGenerator = new PinGenerator();

    @Test
    public void shouldGenerate1000Pins() {
        Collection<String> pins = pinGenerator.generatePins();
        assertEquals(1000, pins.size());
    }

    @Test
    public void shouldGeneratePinsOfLength4() {
        Collection<String> pins = pinGenerator.generatePins();
        Collection<String> pinsNotOfLengthFour = pins.stream().filter(n -> n.length() != 4).collect(Collectors.toList());
        assert(pinsNotOfLengthFour.size() == 0 && !pins.isEmpty());
    }

    @Test
    public void shouldGeneratePinsWithNumbersOnly() {
        Collection<String> pins = pinGenerator.generatePins();
        Collection<String> pinsWithoutNumbers = pins.stream().filter(this::isNotNumber).collect(Collectors.toList());
        assert (pinsWithoutNumbers.size() == 0 && !pins.isEmpty());
    }

    @Test
    public void shouldGenerateUniquePins() {
        Collection<String> pins = pinGenerator.generatePins();
        assertEquals(pins.size(), pins.stream().distinct().count());
    }

    private boolean isNotNumber(String input) {
        try {
            Integer.parseInt(input);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }
}
