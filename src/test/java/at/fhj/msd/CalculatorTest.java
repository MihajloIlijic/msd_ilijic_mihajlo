package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    /*
     * creating an object of the Calculator class which contains the methods for arithmetic operations
     */
    private Calculator calc = new Calculator();


    /*
     * 3 testcases for the addition method
     */

    @Test
    public void calculatorAddition() {
        final double expected_sum_1 = 25;
        final double expected_sum_2 = 10;
        final double expected_sum_3 = 20;


        assertEquals(expected_sum_1, calc.add(2, 23), 0.01);
        assertEquals(expected_sum_2, calc.add(9, 1), 0.01);
        assertEquals(expected_sum_3, calc.add(19, 1), 0.01);
    }

    /*
     * 3 testcases for the substract method */
    @Test
    public void calcualtorSubstraction() {
        final double expected_difference_1 = 12;
        final double expected_difference_2 = 93;
        final double expected_difference_3 = 88;

        assertEquals(expected_difference_1, calc.minus(33, 21), 0.01);
        assertEquals(expected_difference_2, calc.minus(100, 7), 0.01);
        assertEquals(expected_difference_3, calc.minus(100, 12), 0.01);
    }

    /*
     * 3 testcases for the multiplication method
     */
    @Test
    public void calculatorMultiplication() {
        final double expected_factor_1 = 9;
        final double expected_factor_2 = 18;
        final double expected_factor_3 = 27;
        assertEquals(expected_factor_1, calc.multiply(1, 9));
        assertEquals(expected_factor_2, calc.multiply(2, 9));
        assertEquals(expected_factor_3, calc.multiply(3, 9));
    }

    /*
     * 3 testcases for the division method
     */
    @Test
    public void calculatorDivision() {
        final double expected_quotient_1 = 6;
        final double expected_quotient_2 = 3;
        final double expected_quotient_3 = 5;

        assertEquals(expected_quotient_1, calc.divide(36, 6), 0.01);
        assertEquals(expected_quotient_2, calc.divide(36, 12), 0.01);
        assertEquals(expected_quotient_3, calc.divide(20, 4), 0.01);

    }

    @Test
    public void facultyTest ( ){
        final int expected_result_1 = 120;
        final int expected_result_2 = 0;
        final int expected_result_3 = 6;

        assertEquals(expected_result_1, calc.faculty(5), 0.01);
        assertEquals(expected_result_2, calc.faculty(-2), 0.01);
        assertEquals(expected_result_3, calc.faculty(3), 0.01);
    }


}
