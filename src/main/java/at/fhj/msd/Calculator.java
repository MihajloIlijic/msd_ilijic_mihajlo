package at.fhj.msd;

public class Calculator {

    /**
     * Using the two parameters number1 and number2 in order to make an addition of two
     * numbers.
     *
     * @param number1
     * @param number2
     * @return the sum of number1 and number2 as the result
     */

    public double add(double number1, double number2) {

        return number1 + number2;

    }

    /**
     *
     * Using the two parameters number1 and number2 in order to make a substitution of two
     * numbers.
     *
     * @param number1
     * @param number2
     * @return the difference of number1 and number2 as the result
     */

    public double minus(double number1, double number2) {
        return number1 - number2;

    }

    /**
     * Using the two parameters number1 and number2 in order to make a multiplication of two
     * numbers.
     * @param number1
     * @param number2
     * @return the factor of number1 and number2 as the result
     */

    public double multiply(double number1, double number2) {
        return number1 * number2;

    }

    /**
     * Using the two parameters number1 and number2 in order to make a division of two
     * numbers.
     * @param number1 divisor
     * @param number2 dividend
     * @return the result of the division (quotient). In case the dividend is zero, the division is not valid.
     */

    public double divide(double number1, double number2) {

        try {
            return number1 / number2;
        } catch (Exception divisionByZero) {
            return 100000;
        }

    }

    /**
     * @param number any positive integer
     * @return the faculty of the parameter number
     */
    public int faculty(int number) {

        int result = 1;

        if (number > 1) {
            for (int i = number; i > 1; i--) {

                result *= i;


            }
        } else if (number == 1) {
            result = number;
        } else {
            return 0;
        }
        return result;
    }
}