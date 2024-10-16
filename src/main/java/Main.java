import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      System.out.println("Welcome to the calculator!\nEnter a command:");
      Calculator calc = new Calculator();
      Scanner scanner = new Scanner(System.in);
      String inp = scanner.next();
      while (!inp.equals("exit")) {
         int num = scanner.nextInt();
         int num2 = 0;
         switch (inp) {
            case "fibonacci":
               System.out.println(calc.fibonacciNumberFinder(num));
               break;
            case "binary":
               System.out.println(calc.intToBinaryNumber(num));
               break;
            case "add":
               num2 = scanner.nextInt();
               System.out.println(calc.add(num, num2));
               break;
            case "subtract":
               num2 = scanner.nextInt();
               System.out.println(calc.subtract(num, num2));
               break;
            case "multiply":
               num2 = scanner.nextInt();
               System.out.println(calc.multiply(num, num2));
               break;
            case "divide":
               num2 = scanner.nextInt();
               System.out.println(calc.divide(num, num2));
               break;
         }

         inp = scanner.next();

      }

   }
}
