package com.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HiFriendTest {

    @Test
    public void testGreeting() {
        // Arrange
        HiFriend hiFriend = new HiFriend();

        // Act
        String greeting = hiFriend.getGreeting();

        // Assert
        assertEquals("Hi Larry Sprinkle!", greeting);
    }
}



