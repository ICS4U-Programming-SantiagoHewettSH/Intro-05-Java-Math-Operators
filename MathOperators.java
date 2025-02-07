/**
* This program display different math problems to the user.
*
* @author Santiago Hewett
* @version 1.0
* @since   2025/02/07
*/

final class MathOperators {

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
    */
    private MathOperators() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        // Addition
        System.out.println("5 + 7 = " + (5 + 7));
        // Subtraction
        System.out.println("5 - 6 = " + (5 - 6));
        // Multiplication
        System.out.println("3 * 7 = " + (3 * 7));
        // Division with integers
        System.out.println("10 / 5 = " + (10 / 5));
        // Division with float numbers
        System.out.println("1 / 3 = " + (1f / 3f));
        // Division with double numbers
        System.out.println("1 / 3 = " + (1d / 3d));
        // Exponents to the power of 2
        System.out.println("4^2 = " + (Math.pow(4, 2)));
        // Exponents to the power of 3
        System.out.println("4^3 = " + (Math.pow(4, 3)));
        // Square root
        System.out.println("√36 = " + (Math.sqrt(36)));
    }
}
