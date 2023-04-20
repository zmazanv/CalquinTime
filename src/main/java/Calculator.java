public class Calculator {

    public double add(double summand1, double summand2) {
        return summand1 + summand2;
    }
    public double subtract(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }
    public double multiply(double factor1, double factor2) {
        return factor1 * factor2;
    }
    public double divide(double dividend, double divisor) {
        return dividend / divisor;
    }
    public double square(double base) {
        return Math.pow(base, 2);
    }
    public double squareRoot(double radicand) {
        return Math.sqrt(radicand);
    }
    public double exponent(double base, double exponent) {
        return Math.pow(base, exponent);
    }

}
