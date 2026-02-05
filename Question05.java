public class Calculator {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        int prod1 = myCalc.multiply(3, 4);
        int prod2 = myCalc.multiply(5, 7);
        int sum1 = myCalc.add(prod1, prod2);
        int result1 = myCalc.square(sum1);
        System.out.println("Result of (3*4 + 5*7)^2: " + result1);

        int sum2 = myCalc.add(4, 7);
        int sum3 = myCalc.add(8, 3);
        int resPart1 = myCalc.square(sum2);
        int resPart2 = myCalc.square(sum3);
        int result2 = myCalc.add(resPart1, resPart2);
        System.out.println("Result of (4+7)^2 + (8+3)^2: " + result2);
    }
}
