package guru.elevatehub;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    void testDivide() {
        assertEquals(4, calculator.divide(8, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void testModulus() {
        assertEquals(1, calculator.modulus(7, 3));
    }

    @Test
    void testSquare() {
        assertEquals(9, calculator.square(3));
    }

    @Test
    void testCube() {
        assertEquals(27, calculator.cube(3));
    }
}