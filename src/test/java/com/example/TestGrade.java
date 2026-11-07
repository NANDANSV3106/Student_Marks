package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestGrade {
    @Test
    void testGrade() {
        assertEquals("Grade:A+", GradeCalculator.Grade(80));
        assertEquals("Grade:A", GradeCalculator.Grade(75));
    }
}
