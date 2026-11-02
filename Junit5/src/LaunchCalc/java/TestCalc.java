package LaunchCalc.java;


public class TestCalc {

    public static void main(String[] args) {

        calc c = new calc();

        // Testing division
        int divResult = c.divide(10, 2);

        if (divResult == 5) {
            System.out.println("Division test case passed");
        } else {
            System.out.println("Division test case failed");
        }

        // Testing multiplication
        int mulResult = c.multiply(10, 2);

        if (mulResult == 20) {
            System.out.println("Multiplication test case passed");
        } else {
            System.out.println("Multiplication test case failed");
        }
    }
}