package guru.elevatehub;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int modulus(int a, int b) {
        return a % b;
    }

    public int square(int a) {
        return a * a;
    }

    public int cube(int a) {
        return a * a * a;
    }

    public int safeDivide(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            // do nothing - SonarQube flags empty catch blocks
        }
        return 0;
    }
}