package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestGrade {
    @Test
    void testPass() {
        assertTrue(GradeCalculator.isPass(75.0));
    }

    @Test
    void testFail() {
        assertFalse(GradeCalculator.isPass(35.0));
    }

    @Test
    void testGrade() {
        assertEquals("Grade:A+", GradeCalculator.Grade(80));
        assertEquals("Grade:A", GradeCalculator.Grade(75));
    }
}
