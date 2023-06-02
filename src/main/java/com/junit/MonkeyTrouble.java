package com.junit;

public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        // If both monkeys are smiling
        if (aSmile && bSmile) {
            return true; // They are in trouble, so return true
        } else if (!aSmile && !bSmile) {
            // If both monkeys are not smiling
            return true; // They are in trouble, so return true
        } else {
            // In all other cases (one monkey is smiling and the other is not)
            return false; // They are not in trouble, so return false
        }
    }
}
