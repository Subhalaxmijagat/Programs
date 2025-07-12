public class Calculator {
    
    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error: Division by zero");
                    return Double.NaN;
                }
            default:
                System.out.println("Invalid operation type");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        double a = 10.5;
        double b = 2.5;
        String operation = "divide";

        double result = calc.calculate(a, b, operation);
        System.out.println("Result: " + result);
    }
}
