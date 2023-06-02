package com.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Diff21Test {


        @Test
        public void testDiff21_LessThan21() {
            // Arrange
            Diff21 diff21 = new Diff21();

            // Act
            int result = diff21.diff21(10);

            // Assert
            assertEquals(11, result);
        }

        @Test
        public void testDiff21_EqualTo21() {
            // Arrange
            Diff21 diff21 = new Diff21();

            // Act
            int result = diff21.diff21(21);

            // Assert
            assertEquals(0, result);
        }

        @Test
        public void testDiff21_GreaterThan21() {
            // Arrange
            Diff21 diff21 = new Diff21();

            // Act
            int result = diff21.diff21(30);

            // Assert
            assertEquals(18, result);
        }
    }


