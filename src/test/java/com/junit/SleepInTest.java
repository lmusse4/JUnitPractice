package com.junit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SleepInTest {

    @Test
    @DisplayName("Checks to see if you can sleep in by looking if it's a weekday or you're on vacation")
    void sleepIn() {
        assertEquals(true, SleepIn.sleepIn(false, true));
    }
}
