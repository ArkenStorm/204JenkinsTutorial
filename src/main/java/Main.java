import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Enter a command:\n");
        String command;
        do {
            command = scanner.next();
            int a;
            int b;
            switch (command) {
                case "add":
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println(calc.add(a, b));
                    break;
                case "subtract":
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println(calc.subtract(a, b));
                    break;
                case "multiply":
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println(calc.multiply(a, b));
                    break;
                case "divide":
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println(calc.divide(a, b));
                    break;
                case "fibonacci":
                    a = scanner.nextInt();
                    System.out.println(calc.fibonacciNumberFinder(a));
                case "intToBinary":
                    a = scanner.nextInt();
                    System.out.println(calc.intToBinaryNumber(a));
            }
        } while (!command.equals("exit"));
    }
}
