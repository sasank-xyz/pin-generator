package com.example.pingenerator;

import org.junit.jupiter.api.Test;

public class PinGeneratorTest {
    @Test
    public void shouldReturnEmptyList() {
        PinGeneratorInterface pinGenerator = new PinGenerator();
        assert(pinGenerator.generatePins().isEmpty());
    }
}
