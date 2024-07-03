package at.fhj.msd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {


    public static Logger logger = LogManager.getLogger(Calculator.class);

    /**
     * Using the two parameters number1 and number2 in order to make an addition of two
     * numbers.
     *
     * @param number1
     * @param number2
     * @return the sum of number1 and number2 as the result
     */


    public double add(double number1, double number2) {

        logger.debug("addition called with parameters: number1={} and number2={}", number1, number2);

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
        logger.debug("substitution called with parameters: number1={} and number2={}", number1, number2);
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
        logger.debug("multiplication called with parameters: number1={} and number2={}", number1, number2);
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
        logger.debug("Called divide with parameters: number1={}, number2={}", number1, number2);
        if (number2 == 0) {
            logger.error("Division by zero attempted with parameters: number1={}, number2={}", number1, number2);
            throw new ArithmeticException("Cannot divide by zero");
        }
        return number1 / number2;
    }

    /**
     * @param number any positive integer
     * @return the faculty of the parameter number
     */
    public int faculty(int number) {
        logger.debug("faculty called with parameter: number={}", number);


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