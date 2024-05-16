package at.fhj.msd;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result_1 = calculator.add(32, 3);
        double result_2 = calculator.minus(23, 4);
        double result_3 = calculator.divide(34, 2);
        double result_4 = calculator.multiply(2, 3);
        System.out.println(result_1);
        System.out.println(result_2);
        System.out.println(result_3);
        System.out.println(result_4);
        System.out.println("Mihajlo Ilijic");
    }
}
