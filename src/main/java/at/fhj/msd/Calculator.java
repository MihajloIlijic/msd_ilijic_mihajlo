package at.fhj.msd;

public class Calculator {

    public double add(double number1, double number2) {

        return number1 + number2;

    }

    public double minus(double number1, double number2) {
        return number1 - number2;

    }

    public double multiply(double number1, double number2) {
        return number1 * number2;

    }

    public double divide(double number1, double number2) {

        try {
            return number1 / number2;
        } catch (Exception divisionByZero) {
            return 100000;
        }

    }
    public int faculty(int number){
/*
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
       */
        return 0;
    }

}