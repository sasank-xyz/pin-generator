package com.example.pingenerator;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PinGeneratorTest {
    private final PinGeneratorInterface pinGenerator = new PinGenerator();

    @Test
    public void shouldGenerate1000Pins() {
        Collection<String> pins = pinGenerator.generatePins();
        assertEquals(1000, pins.size());
    }
}
