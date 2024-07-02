package at.fhj.msd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    public static Logger logger = LogManager.getLogger(Calculator.class);

    public double add(double number1, double number2) {

        logger.debug("addition called with parameters: number1={} and number2={}", number1, number2);

        return number1 + number2;

    }

    public double minus(double number1, double number2) {
        logger.debug("substitution called with parameters: number1={} and number2={}", number1, number2);
        return number1 - number2;

    }

    public double multiply(double number1, double number2) {
        logger.debug("multiplication called with parameters: number1={} and number2={}", number1, number2);
        return number1 * number2;

    }

    public double divide(double number1, double number2) {
        logger.debug("Called divide with parameters: number1={}, number2={}", number1, number2);
        if (number2 == 0) {
            logger.error("Division by zero attempted with parameters: number1={}, number2={}", number1, number2);
            throw new ArithmeticException("Cannot divide by zero");
        }
        return number1 / number2;
    }
    public int faculty(int number){
        logger.debug("faculty called with parameter: number={}", number);

        int result = 1;

       if (number > 1){
           for (int i = number; i > 1;i--){

               result *= i;


           }
       } else if (number == 1) {
           result = number;
       }
       else {
           return 0;
       }
       return result;
    }
}