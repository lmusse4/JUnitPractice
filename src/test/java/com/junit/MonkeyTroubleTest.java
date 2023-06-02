package com.junit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MonkeyTroubleTest {
    //3 test for each scenario
    @Test
    void testMonkeyTrouble_BothSmiling() {

        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
        boolean aSmile = true;
        boolean bSmile = true;


        boolean result = monkeyTrouble.monkeyTrouble(aSmile, bSmile);


        assertTrue(result);
    }

    @Test
    void testMonkeyTrouble_NeitherSmiling() {

        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
        boolean aSmile = false;
        boolean bSmile = false;


        boolean result = monkeyTrouble.monkeyTrouble(aSmile, bSmile);


        assertTrue(result);
    }

    @Test
    void testMonkeyTrouble_OneSmiling() {

        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
        boolean aSmile = true;
        boolean bSmile = false;


        boolean result = monkeyTrouble.monkeyTrouble(aSmile, bSmile);


        assertFalse(result);
    }
}
